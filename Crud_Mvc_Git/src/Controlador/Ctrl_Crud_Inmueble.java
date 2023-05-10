
package Controlador;

/*importo clases y librerias que necesito para trabajar en el controlador**/
import Dao.Dao_Inmueble;
import Dto.Dto_Inmueble;
import Vista.Crud_Inmueble;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Frame.ICONIFIED;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/* @author diego vargas**/
/*Implemento las interfaces que necesito y sus metodos abstractos**/
public class Ctrl_Crud_Inmueble implements ActionListener, MouseListener, FocusListener, WindowFocusListener {
/*Creamos una variable del tipo Crud_inmueble, para poder controlar sus componentes**/
    private Crud_Inmueble crud;
    private Dao_Inmueble dao_inmueble;
    private Dto_Inmueble dto_inmueble;

    public Ctrl_Crud_Inmueble(Crud_Inmueble crud, Dao_Inmueble dao_inmueble, Dto_Inmueble dto_inmueble) {
        this.crud = crud;
        /*inicializamos la variable del objeto crud, al que queremos controlar**/
        this.crud.setLocationRelativeTo(null);
        /*este metodo permite que la ventana aparezca en el centro de la pantalla,al colocar el parametro null**/
        this.crud.setDefaultCloseOperation(EXIT_ON_CLOSE);
        /*este metodo permite cerrar todas las ventanas del programa**/
        this.crud.setLayout(null);/*este metodo permite organizar de forma manual los componentes dentro del frame**/
        this.dao_inmueble = dao_inmueble;
        this.dto_inmueble = dto_inmueble;
        this.crud.btb_cargar_tabla.addActionListener(this);
        /*pongo a la escucha el componente y por paramentro le envio un "this", porque estamos construyendo en la misma clase(donde implementamos la interfaz)**/
        this.crud.btb_insert.addActionListener(this);
        this.crud.btb_delete.addActionListener(this);
        this.crud.btb_buscar.addActionListener(this);
        this.crud.btb_update.addActionListener(this);
        this.crud.tabla_datos.addMouseListener(this);
        this.crud.btb_minimizar.addActionListener(this);
        this.crud.btb_cerrar.addActionListener(this);
        this.crud.btn_limpiar_busqueda.addMouseListener(this);
        this.crud.btb_minimizar.addMouseListener(this);
        this.crud.btb_cerrar.addMouseListener(this);
        this.crud.btn_limpiar_busqueda.setVisible(false);
        /*esta metodo permite ocultar/mostrar el componente dentro del formulario, el componente inicializa oculto**/
        this.crud.tabla_datos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        /*este metodo de un jtable,permite solo seleccionar una fila a la vez**/
        this.crud.caja_cod_inm.addFocusListener(this);
        this.crud.caja_localidad.addFocusListener(this);
        this.crud.caja_valor.addFocusListener(this);
        this.crud.caja_direccion.addFocusListener(this);
        this.crud.caja_cant_amb.addFocusListener(this);
        this.crud.caja_metros2.addFocusListener(this);
        this.crud.caja_altura.addFocusListener(this);
        this.crud.addWindowFocusListener(this);
        this.mensaje_Cajas();
        this.agregar_Estilo_Cajas(crud.caja_cod_inm);
        this.agregar_Estilo_Cajas(crud.caja_localidad);
        this.agregar_Estilo_Cajas(crud.caja_direccion);
        this.agregar_Estilo_Cajas(crud.caja_valor);
        this.agregar_Estilo_Cajas(crud.caja_metros2);
        this.agregar_Estilo_Cajas(crud.caja_cant_amb);
        this.agregar_Estilo_Cajas(crud.caja_altura);
        this.setImageLabel_User(crud.lbl_cabecera, "E:\\Material de java\\NetBeansProjects\\Crud_Mvc\\src\\Img\\logo final,inm norte,lbl_1.png");
        this.setImageLabel_User(crud.lbl_formulario, "E:\\Material de java\\NetBeansProjects\\Crud_Mvc\\src\\Img\\lbl_2_inm_1.png");
    }

    @Override
    /*sobreescribo el metodo abstracto de la interfaz ActionListener**/
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == crud.btb_cargar_tabla) {

            if (dao_inmueble.cargar_Datos_Tabla(crud)) {
                JOptionPane.showMessageDialog(null, "Se muestran en la tabla, los registros almacenados en la base de datos");
            } else {
                JOptionPane.showMessageDialog(null, "No sé pueden mostrar los registros en la tabla");
            }
        }

        if (e.getSource() == crud.btb_insert) {
            int inmueble_seleccionado = 0;
            int moneda_seleccionada = 0;
            String seleccion_inmueble = crud.cbx_inmueble.getSelectedItem().toString();/*almaceno dentro de una variable String el componente combobox,para su posterior validacion**/
            String seleccion_moneda = crud.cbx_moneda.getSelectedItem().toString();
            /*verifico que el usuario haya completado todos los campos,antes de realizar el registro a la bd**/
            if (crud.cbx_inmueble.getSelectedIndex() < 1 || crud.cbx_moneda.getSelectedIndex() < 1 || crud.caja_localidad.getText().isEmpty() || crud.caja_cod_inm.getText().isEmpty()
                    || crud.caja_valor.getText().isEmpty() || crud.caja_direccion.getText().isEmpty() || crud.caja_metros2.getText().isEmpty() || crud.caja_cant_amb.getText().isEmpty()
                    || crud.caja_altura.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lo siento, debe completar todos los campos del formulario");
            } /*verifico la opcion seleccionada del usuario,luego, almaceno el valor de su indice en la variable del tipo int**/
            else {
                if (seleccion_inmueble.equalsIgnoreCase("casa")) {
                    inmueble_seleccionado = 1;
                } else {
                    inmueble_seleccionado = 2;
                }

                if (seleccion_moneda.equalsIgnoreCase("pesos argentinos")) {
                    moneda_seleccionada = 1;
                } else {
                    moneda_seleccionada = 2;
                }
                dto_inmueble.set_Codigo_Inmueble(crud.caja_cod_inm.getText());
                dto_inmueble.set_Tipo_Inmueble(inmueble_seleccionado);
                dto_inmueble.setTipo_Moneda(moneda_seleccionada);
                dto_inmueble.set_Valor(Double.parseDouble(crud.caja_valor.getText()));
                dto_inmueble.set_Direccion(crud.caja_direccion.getText());
                dto_inmueble.set_Altura(Integer.parseInt(crud.caja_altura.getText()));
                dto_inmueble.set_Localidad(crud.caja_localidad.getText());
                dto_inmueble.set_Cantidad_Ambientes(Integer.parseInt(crud.caja_cant_amb.getText()));
                dto_inmueble.set_M2(Integer.parseInt(crud.caja_metros2.getText()));

                /*una vez que seteo los valores ingresados por el usuario en las cajas de texto y combobox al objeto dto_inmueble, llamo al metodo insertar_Datos**/
                if (dao_inmueble.insertar_Datos(dto_inmueble)) {
                    JOptionPane.showMessageDialog(null, "El registro se guardo satisfactoriamente");
                    this.limpiar_Cajas();
                } else {
                    JOptionPane.showMessageDialog(null, "No sé pudo guardar el registro en la base de datos");
                    this.limpiar_Cajas();
                }
            }
        }
        /*verifico si el evento ocurre en el boton update,similar al insertar**/
        if (e.getSource() == crud.btb_update) {
            String seleccion_inmueble = crud.cbx_inmueble.getSelectedItem().toString();
            String seleccion_moneda = crud.cbx_moneda.getSelectedItem().toString();
            int inmueble_seleccionado = 0;
            int moneda_seleccionada = 0;

            if (crud.cbx_inmueble.getSelectedIndex() >= 0 || crud.cbx_moneda.getSelectedIndex() >= 0 || crud.caja_localidad.getText().isEmpty() || crud.caja_cod_inm.getText().isEmpty()
                    || crud.caja_valor.getText().isEmpty() || crud.caja_direccion.getText().isEmpty() || crud.caja_altura.getText().isEmpty() || crud.caja_metros2.getText().isEmpty()
                    || crud.caja_cant_amb.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lo siento, debe completar todos los campos del formulario");
            } else {
                if (seleccion_inmueble.equals("casa")) {
                    inmueble_seleccionado = 1;
                } else {
                    inmueble_seleccionado = 2;
                }
                if (seleccion_moneda.equalsIgnoreCase("Pesos Argentinos")) {
                    moneda_seleccionada = 1;
                } else {
                    moneda_seleccionada = 2;
                }
                dto_inmueble.set_Codigo_Inmueble(crud.caja_cod_inm.getText());
                dto_inmueble.set_Tipo_Inmueble(inmueble_seleccionado);
                dto_inmueble.setTipo_Moneda(moneda_seleccionada);
                dto_inmueble.set_Valor(Double.parseDouble(crud.caja_valor.getText()));
                dto_inmueble.set_Direccion(crud.caja_direccion.getText());
                dto_inmueble.set_Altura(Integer.parseInt(crud.caja_altura.getText()));
                dto_inmueble.set_Localidad(crud.caja_localidad.getText());
                dto_inmueble.set_Cantidad_Ambientes(Integer.parseInt(crud.caja_cant_amb.getText()));
                dto_inmueble.set_M2(Integer.parseInt(crud.caja_metros2.getText()));

                if (dao_inmueble.modificar_Datos(dto_inmueble)) {
                    JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente");
                    this.limpiar_Cajas();
                    crud.btb_insert.setEnabled(true);/*habilito el boton**/
                    crud.caja_cod_inm.setEnabled(true);
                    crud.btb_update.setEnabled(false);/*deshabilito el boton**/
                    crud.btb_delete.setEnabled(false);
                    
                    
                } /*ya sea que se actualizaron o no los datos, vamos a llamar el metodo limpiar cajas,para que quite el texto o la seleccion de los componentes**/
                else {
                    JOptionPane.showMessageDialog(null, "El registro no sé pudo actualizar");
                    this.limpiar_Cajas();
                    crud.btb_insert.setEnabled(true);
                    crud.caja_cod_inm.setEnabled(true);
                    crud.btb_update.setEnabled(false);
                    crud.btb_delete.setEnabled(false);
                }
            }
        }

        if (e.getSource() == crud.btb_delete) {

            if (crud.cbx_inmueble.getSelectedIndex() >= 0 || crud.cbx_moneda.getSelectedIndex() >= 0 || crud.caja_localidad.getText().isEmpty() || crud.caja_cod_inm.getText().isEmpty()
                    || crud.caja_valor.getText().isEmpty() || crud.caja_direccion.getText().isEmpty() || crud.caja_metros2.getText().isEmpty() || crud.caja_altura.getText().isEmpty()
                    || crud.caja_cant_amb.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lo siento, debe completar todos los campos del formulario");
            } else {
                dto_inmueble.set_Codigo_Inmueble(crud.caja_cod_inm.getText());/*para obtener o verificar si un componente jtextfield tiene texto,usamos el metodo "getText"**/

                if (dao_inmueble.eliminar_Datos(dto_inmueble)) {
                    JOptionPane.showMessageDialog(null, "El registro se elimino satisfactoriamente");
                    this.limpiar_Cajas();
                    crud.btb_insert.setEnabled(true);
                    crud.caja_cod_inm.setEnabled(true);
                    crud.btb_update.setEnabled(false);
                    crud.btb_delete.setEnabled(false);               
                } else {
                    JOptionPane.showMessageDialog(null, "No sé elimino el registro");
                    this.limpiar_Cajas();
                    crud.btb_insert.setEnabled(true);
                    crud.caja_cod_inm.setEnabled(true);
                    crud.btb_update.setEnabled(false);
                    crud.btb_delete.setEnabled(false);
                }
            }
        }

        if (e.getSource() == crud.btb_buscar) {
            /*genero variables del tipo String para almacenar los datos ingresados por el usuario, realizo las validaciones correspondientes y las envio por parametro**/
            String valor_caja_buscar = crud.caja_buscar.getText();
            String busqueda_seleccionada = crud.cbx_filtro_busqueda.getSelectedItem().toString();
            String valor_busqueda = "";
            /*valido que el usuario haya ingresado algun dato en el componente**/
            if (valor_caja_buscar.equals("")) {
                JOptionPane.showMessageDialog(null, " Lo siento, debe completar el campo de buscar");
            } /*valido la seleccion del usuario en el combobox y la almaceno en la variable a enviar por parametro**/
            else {
                if (busqueda_seleccionada.equalsIgnoreCase("codigo inmueble")) {
                    valor_busqueda = "codigo_inmueble";
                } else if (busqueda_seleccionada.equalsIgnoreCase("localidad")) {
                    valor_busqueda = "localidad";
                } else if (busqueda_seleccionada.equalsIgnoreCase("valor")) {
                    valor_busqueda = "valor";
                } else if (busqueda_seleccionada.equalsIgnoreCase("cantidad")) {
                    valor_busqueda = "cantidad";
                } else if (busqueda_seleccionada.equalsIgnoreCase("casa")) {
                    valor_busqueda = "casa";
                }
                /*llamo al metodo buscar_X_Filtro y le paso 3 parametros, para poder traer los datos solicitados por el usuario y mostrarlos en el jtable(vista)**/
                if (dao_inmueble.buscar_X_Filtro(crud, valor_busqueda, valor_caja_buscar)) {
                    JOptionPane.showMessageDialog(null, "Se muestra el resultado de la busqueda en la tabla de datos");
                    crud.btn_limpiar_busqueda.setVisible(true);/*luego de ejecutar la instruccion del mensaje,hago visible al boton_limpiar_busqueda**/
                } else {
                    JOptionPane.showMessageDialog(null, "Lo siento, no se ha podido obtener el registro de la base de datos");
                    crud.btn_limpiar_busqueda.setVisible(true);
                }
            }
        }

        if (e.getSource() == crud.btb_cerrar) {
            System.exit(0);
            /*cierro la aplicacion**/
        }

        if (e.getSource() == crud.btb_minimizar) {
            crud.setExtendedState(ICONIFIED);
            /*minimizo la ventana de la aplicacion**/
        }
    }

    @Override
    public void mouseClicked(MouseEvent evento_click) /*este evento ocurre cuando hacemos un click en un componente del frame y soltamos el boton del mouse**/
    {
        if (evento_click.getSource() == crud.btn_limpiar_busqueda) {
            crud.caja_buscar.setText("");
            crud.btn_limpiar_busqueda.setVisible(false);
            /*al presionar con el mouse el boton,limpiamos el contenido de la caja_buscar y ocultamos nuevamente el boton**/

        }
        /*en esta instruccion determinamos si el evento ocurre al realizar un click en el componente jtable**/
        if (evento_click.getSource() == crud.tabla_datos && MouseEvent.BUTTON1 == evento_click.getButton()) {
            /*declaramos una variable del tipo int,para almacenar el indice de la fila seleccionada por el usuario en el jtable**/
            int capturar_fila = crud.tabla_datos.getSelectedRow();
            /*seteamos los componentes del formulario, con los valores obtenidos de la fila seleccionada del jtable**/
            crud.caja_cod_inm.setText(crud.tabla_datos.getValueAt(capturar_fila, 0).toString());
            crud.caja_cod_inm.setForeground(Color.BLACK);
            crud.cbx_inmueble.getModel().setSelectedItem(String.valueOf(crud.tabla_datos.getModel().getValueAt(capturar_fila, 1)).trim());
            crud.cbx_moneda.getModel().setSelectedItem(String.valueOf(crud.tabla_datos.getModel().getValueAt(capturar_fila, 2)).trim());
            crud.caja_valor.setText(crud.tabla_datos.getValueAt(capturar_fila, 3).toString());
            crud.caja_valor.setForeground(Color.BLACK);/*llamo al metodo setforeground para modificar el estilo del texto que se encuentra dentro del Jtextfield**/
            crud.caja_direccion.setText(crud.tabla_datos.getValueAt(capturar_fila, 4).toString());
            crud.caja_direccion.setForeground(Color.BLACK);
            crud.caja_altura.setText(crud.tabla_datos.getValueAt(capturar_fila, 5).toString());
            crud.caja_altura.setForeground(Color.BLACK);
            crud.caja_localidad.setText(crud.tabla_datos.getValueAt(capturar_fila, 6).toString());
            crud.caja_localidad.setForeground(Color.BLACK);
            crud.caja_cant_amb.setText(crud.tabla_datos.getValueAt(capturar_fila, 7).toString());
            crud.caja_cant_amb.setForeground(Color.BLACK);
            crud.caja_metros2.setText(crud.tabla_datos.getValueAt(capturar_fila, 8).toString());
            crud.caja_metros2.setForeground(Color.BLACK);
            /*inhabilitamos el componente caja_cod_inm(para que el usuario no pueda editar el codigo del inmueble),hacemos lo mismo con elboton de insertar**/
            crud.caja_cod_inm.setEnabled(false);
            crud.btb_insert.setEnabled(false);
            crud.btb_update.setEnabled(true);
            crud.btb_delete.setEnabled(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /*evento que se desencadena al posicionar el puntero sobre un componente del frame, en este caso, cambiamos el background del componente y el cursor del mouse**/
    @Override
    public void mouseEntered(MouseEvent evento_posicion) {
        if (evento_posicion.getSource() == crud.btb_minimizar) {
            crud.btb_minimizar.setBackground(Color.WHITE);
            crud.btb_minimizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
        if (evento_posicion.getSource() == crud.btb_cerrar) {
            crud.btb_cerrar.setBackground(Color.RED);
            crud.btb_cerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
    }

    /*al quitar el puntero de un componente (botones),le establecemos un nuevo color al boton**/
    @Override
    public void mouseExited(MouseEvent evento_salida) {
        if (evento_salida.getSource() == crud.btb_minimizar) {
            crud.btb_minimizar.setBackground(new Color(51, 51, 51));

        }
        if (evento_salida.getSource() == crud.btb_cerrar) {
            crud.btb_cerrar.setBackground(new Color(51, 51, 51));

        }
    }

    /*evento foco ganado, al entrar/seleccionar un componente(jtextfield),verifica si se encuentra el texto inicial, sí es así, quitael texto y su estilo**/
    @Override
    public void focusGained(FocusEvent evento_foco) {
        if (evento_foco.getSource() == crud.caja_cod_inm) {
            if (crud.caja_cod_inm.getText().equals("Ingrese un codigo válido")) {
                crud.caja_cod_inm.setText("");
                crud.caja_cod_inm.requestFocus();
                this.quitar_Estilos_Cajas(crud.caja_cod_inm);
            } else {
                crud.caja_cod_inm.getText();
            }
        }
        if (evento_foco.getSource() == crud.caja_localidad) {
            if (crud.caja_localidad.getText().equals("Ingrese una localidad ")) {
                crud.caja_localidad.setText("");
                crud.caja_localidad.requestFocus();
                this.quitar_Estilos_Cajas(crud.caja_localidad);
            } else {
                crud.caja_localidad.getText();
            }
        }
        if (evento_foco.getSource() == crud.caja_valor) {
            if (crud.caja_valor.getText().equals("Ingrese un precio ")) {
                crud.caja_valor.setText("");
                crud.caja_valor.requestFocus();
                this.quitar_Estilos_Cajas(crud.caja_valor);
            } else {
                crud.caja_valor.getText();
            }
        }
        if (evento_foco.getSource() == crud.caja_direccion) {
            if (crud.caja_direccion.getText().equals("Ingrese una direccion ")) {
                crud.caja_direccion.setText("");
                crud.caja_direccion.requestFocus();
                this.quitar_Estilos_Cajas(crud.caja_direccion);
            } else {
                crud.caja_direccion.getText();
            }
        }
        if (evento_foco.getSource() == crud.caja_metros2) {
            if (crud.caja_metros2.getText().equals("Ingrese la cantidad total")) {
                crud.caja_metros2.setText("");
                crud.caja_metros2.requestFocus();
                this.quitar_Estilos_Cajas(crud.caja_metros2);
            } else {
                crud.caja_metros2.getText();
            }
        }
        if (evento_foco.getSource() == crud.caja_cant_amb) {
            if (crud.caja_cant_amb.getText().equals("Ingrese los ambientes ")) {
                crud.caja_cant_amb.setText("");
                crud.caja_cant_amb.requestFocus();
                this.quitar_Estilos_Cajas(crud.caja_cant_amb);
            } else {
                crud.caja_cant_amb.getText();
            }
        }
        if (evento_foco.getSource() == crud.caja_altura) {
            if (crud.caja_altura.getText().equals("Ingrese una altura ")) {
                crud.caja_altura.setText("");
                crud.caja_altura.requestFocus();
                this.quitar_Estilos_Cajas(crud.caja_altura);
            } else {
                crud.caja_altura.getText();
            }
        }
    }

    /**evento perdida de foco, al salir de un componente(jtextfield),verifica si se ingreso texto, sino se ingreso,establece texto con el estilo correspondiente**/
    @Override
    public void focusLost(FocusEvent evento_perdida_foco) {
        if (evento_perdida_foco.getSource() == crud.caja_cod_inm) {
            if (crud.caja_cod_inm.getText().trim().length() == 0) {
                this.agregar_Estilo_Cajas(crud.caja_cod_inm);
                crud.caja_cod_inm.setText("Ingrese un codigo válido");
            }
        }
        if (evento_perdida_foco.getSource() == crud.caja_localidad) {
            if (crud.caja_localidad.getText().length() == 0) {
                this.agregar_Estilo_Cajas(crud.caja_localidad);
                crud.caja_localidad.setText("Ingrese una localidad ");
            }
        }
        if (evento_perdida_foco.getSource() == crud.caja_valor) {
            if (crud.caja_valor.getText().length() == 0) {
                this.agregar_Estilo_Cajas(crud.caja_valor);
                crud.caja_valor.setText("Ingrese un precio ");
            }
        }
        if (evento_perdida_foco.getSource() == crud.caja_direccion) {
            if (crud.caja_direccion.getText().length() == 0) {
                this.agregar_Estilo_Cajas(crud.caja_direccion);
                crud.caja_direccion.setText("Ingrese una direccion ");
            }
        }
        if (evento_perdida_foco.getSource() == crud.caja_metros2) {
            if (crud.caja_metros2.getText().trim().length() == 0) {
                this.agregar_Estilo_Cajas(crud.caja_metros2);
                crud.caja_metros2.setText("Ingrese la cantidad total");
            }
        }
        if (evento_perdida_foco.getSource() == crud.caja_cant_amb) {
            if (crud.caja_cant_amb.getText().length() == 0) {
                this.agregar_Estilo_Cajas(crud.caja_cant_amb);
                crud.caja_cant_amb.setText("Ingrese los ambientes ");
            }
        }
        if (evento_perdida_foco.getSource() == crud.caja_altura) {
            if (crud.caja_altura.getText().length() == 0) {
                this.agregar_Estilo_Cajas(crud.caja_altura);
                crud.caja_altura.setText("Ingrese una altura ");
            }
        }
    }

    /*quita el contenido de los componentes del formulario**/
    public void limpiar_Cajas() {
        crud.cbx_inmueble.setSelectedIndex(0);
        crud.cbx_moneda.setSelectedIndex(0);
        crud.caja_altura.setText("");
        crud.caja_cant_amb.setText("");
        crud.caja_cod_inm.setText("");
        crud.caja_direccion.setText("");
        crud.caja_localidad.setText("");
        crud.caja_metros2.setText("");
        crud.caja_valor.setText("");
    }

    /*agrega estilo al texto que se encuentra en un Jtextfield**/
    public void agregar_Estilo_Cajas(JTextField caja_formulario) {
        Font fuente_caja = caja_formulario.getFont();
        fuente_caja = fuente_caja.deriveFont(Font.ITALIC);
        caja_formulario.setFont(fuente_caja);
        caja_formulario.setForeground(Color.GRAY);
    }
    
    /*quita el estilo del texto que se encuentra en un Jtextfield**/
    public void quitar_Estilos_Cajas(JTextField caja_formulario) {
        Font fuente_caja = caja_formulario.getFont();
        fuente_caja = fuente_caja.deriveFont(Font.LAYOUT_RIGHT_TO_LEFT);
        caja_formulario.setFont(fuente_caja);
        caja_formulario.setForeground(Color.BLACK);
    }

    /*permite adaptar(escala) una imagen al tamaño de un jlabel**/
    public void setImageLabel_User(JLabel lbl_crud, String root) {
        ImageIcon img_lbl_user = new ImageIcon(root);
        Icon icono = new ImageIcon(img_lbl_user.getImage().getScaledInstance(lbl_crud.getWidth(), lbl_crud.getHeight(), Image.SCALE_DEFAULT));
        lbl_crud.setIcon(icono);
        this.crud.repaint();
    }

    /***Muestra un mensaje informativo al pasar el puntero por los componentes del formulario**/
    public void mensaje_Cajas() {
        crud.cbx_inmueble.setToolTipText("Debe seleccionar el tipo de inmueble a registrar");
        crud.cbx_moneda.setToolTipText("Debe seleccionar el tipo de moneda a registrar");
        crud.cbx_filtro_busqueda.setToolTipText("Debe presionar y seleccionar el item por el cual desea buscar");
        crud.btb_buscar.setToolTipText("Presione para comenzar la busqueda");
        crud.btb_cargar_tabla.setToolTipText("Presione para mostrar en la tabla, los registros almacenados");
        crud.btb_delete.setToolTipText("Al presionar eliminara un registro");
        crud.btb_insert.setToolTipText("Permite ingresar un nuevo registro");
        crud.btb_update.setToolTipText("Al presionar va a modificar un registro seleccionado");
    }
    
    /*metodos para controlar el foco de la ventana/frame**/
    @Override
    public void windowGainedFocus(WindowEvent evento_ventana) {
        if (evento_ventana.getSource() == crud) {
            this.crud.requestFocus();/*le traslado el foco a la ventana(al abrirla)**/
        }
    }
/*metodo para controlar la perdida de foco de la ventana/frame**/
    @Override
    public void windowLostFocus(WindowEvent e) {
    }
}
