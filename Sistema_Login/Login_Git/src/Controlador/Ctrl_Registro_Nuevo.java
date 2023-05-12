
package Controlador;

import Dao.Usuario_Dao;
import Dto.Usuario_Dto;
import Vista.Registro_Nuevo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author diego vargas
 */
public class Ctrl_Registro_Nuevo implements ActionListener {

    private Registro_Nuevo rnuevo;
    private Usuario_Dto usudto;
    private Usuario_Dao usudao;
/*inicializamos los componentes del frame**/
    public Ctrl_Registro_Nuevo(Usuario_Dto usudto) {
        rnuevo = new Registro_Nuevo();
        rnuevo.btb_guardar_registro.addActionListener(this);
        this.usudto = usudto;
        usudao = new Usuario_Dao();
        rnuevo.setTitle("REGISTRO DE USUARIO");
        rnuevo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        rnuevo.setLayout(null);
        rnuevo.setLocationRelativeTo(null);
        rnuevo.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rnuevo.btb_guardar_registro) {
            /*declaro 2 variables del tipo String y parseo los datos que ingreso el usuario en las cajas de texto, para luego validar los datos ingresados**/
            String guardar_password = String.valueOf(rnuevo.caja_pass.getPassword());
            String confirmar_password = String.valueOf(rnuevo.caja_conf_pass.getPassword());
            /*valido que no haya ningun campo sin completas en el formulario**/
            if (rnuevo.caja_nombre.getText().isEmpty() || rnuevo.caja_ape.getText().isEmpty() || rnuevo.caja_usu.getText().isEmpty()
                    || guardar_password.isEmpty() || confirmar_password.isEmpty() || rnuevo.caja_email.getText().isEmpty() || rnuevo.combo_roles.getSelectedIndex() < 1 || rnuevo.jdc_fecha_alta == null) {
                JOptionPane.showMessageDialog(null, "Lo siento, debes completar todos los campos del formulario", "vuelve a completar los datos", JOptionPane.WARNING_MESSAGE);
                this.rnuevo.requestFocus();
            } else {
                /*valido que las contraseñas ingresadas por el usuario coincidan**/
                if (guardar_password.equalsIgnoreCase(confirmar_password)) {
                    Date fecha_jdc = rnuevo.jdc_fecha_alta.getDate();
                    /*almacenamos la fecha seleccionada por el usuario en el jdatechooser del form, en la variable del tipo util.date**/
                    long fecha_formato = fecha_jdc.getTime();
                    /*declaramos una variable del tipo long para almacenar la variable fecha_jdc con un formato legible(la obtenida del jdatechooser)**/
                    java.sql.Date registrar_fecha = new java.sql.Date(fecha_formato);/*instanciamos un objeto del tipo sql.date y pasamos por parametro la fecha que vamos a guardar en la bd**/
                    String seleccion_rol = rnuevo.combo_roles.getSelectedItem().toString();/*almacenamos en la variable del tipo String el componente combobox, para su posterior validacion**/
                    int rol_elegido = 0;
                    /*valido la seleccion del usuario en el combobox del formulario, y almaceno su valor indice en la variable del tipo int**/
                    if (seleccion_rol.equals("admin")) {
                        rol_elegido = 1;
                    } else {
                        rol_elegido = 2;
                    }
                    usudto.setNombre(rnuevo.caja_nombre.getText());
                    usudto.setApellido(rnuevo.caja_ape.getText());
                    usudto.setUsuario_sistema(rnuevo.caja_usu.getText());
                    usudto.setPassword(guardar_password);
                    usudto.setEmail(rnuevo.caja_email.getText());
                    usudto.setFecha_alta(registrar_fecha);
                    usudto.setId_rol(rol_elegido);

                    if (usudao.insertar_usario(usudto)) {
                        JOptionPane.showMessageDialog(null, "Se ha registrado el usuario en la base de datos de nuestro sistema");
                        this.limpiar_cajas();/*limpio los componentes del formulario**/
                        this.rnuevo.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(null, "Lo siento, no se ha podido registrar el usuario en nuestro sistema");
                        this.limpiar_cajas();/*limpio los componentes del formulario**/
                        this.rnuevo.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden, vuelve a ingresarlas");
                    this.limpiar_cajas();/*limpio los componentes del formulario**/
                }
            }
        }
    }
/*Con este metodo limpiamos/quitamos el texto de los componentes del formulario**/ 
    private void limpiar_cajas() {
        rnuevo.caja_nombre.setText("");
        rnuevo.caja_ape.setText("");
        rnuevo.caja_usu.setText("");
        rnuevo.caja_pass.setText("");
        rnuevo.caja_conf_pass.setText("");
        rnuevo.caja_email.setText("");
        rnuevo.jdc_fecha_alta.setDate(null);
        rnuevo.combo_roles.setSelectedItem("Seleccione");

    }

}
