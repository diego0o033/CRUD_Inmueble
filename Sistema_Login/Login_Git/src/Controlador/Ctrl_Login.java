
package Controlador;

import Dao.Usuario_Dao;
import Dto.Rol_Dto;
import Dto.Usuario_Dto;
import Vista.Login_Usuario;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
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
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author diego vargas
 */
/*implemento las interfaces Listener de los diferentes componentes que quiero poner a la escucha**/
public class Ctrl_Login implements ActionListener, FocusListener,MouseListener ,WindowFocusListener {

    private Usuario_Dto usudto;
    private Usuario_Dao usudao;
    private Rol_Dto rdto;
    private Login_Usuario logusu;


    /*Inicializo las propiedades del formulario en el constructor**/
    public Ctrl_Login(Usuario_Dto usudto, Usuario_Dao usudao, Rol_Dto rdto, Login_Usuario logusu) {
        this.usudto = usudto;
        this.usudao = usudao;
        this.rdto = rdto;
        this.logusu = logusu;
        this.logusu.btb_login.addActionListener(this);
        this.logusu.btb_registro_nuevo.addActionListener(this);
        this.logusu.caja_usuario.addFocusListener(this);
        this.logusu.caja_passw.addFocusListener(this);
        this.logusu.addWindowFocusListener(this);
        this.logusu.btb_cerrar_log.addMouseListener(this);
        this.setImageLabel_Login(logusu.lbl_inicio_sesion, "E:\\Material de java\\NetBeansProjects\\Login_Git\\src\\Imagenes_Componentes\\principal_250.png");
        this.setImageLabel_Login(logusu.lbl_user, "E:\\Material de java\\NetBeansProjects\\Login_Git\\src\\Imagenes_Componentes\\round-account-button-with-user-inside.png");
        this.setImageLabel_Login(logusu.lbl_pass, "E:\\Material de java\\NetBeansProjects\\Login_Git\\src\\Imagenes_Componentes\\padlock_48.png");
        logusu.setTitle("LOGUEO DE USUARIO");
        logusu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        logusu.setLayout(null);
        logusu.setLocationRelativeTo(null);
        this.agregarEstilo_Ph(logusu.caja_usuario);/*al momento de abrir la ventana de login,cargamos el estilo definido al texto inicial de las cajas (usuario y passw)**/
        this.agregarEstilo_Ph(logusu.caja_passw);
        
        

    }

    /*sobreescribo el metodo abstracto de la interfaz ActionListener,capturo los eventos de acción**/
    @Override
    public void actionPerformed(ActionEvent boton) {
        if (boton.getSource() == logusu.btb_login) {
           this.limpiar_Lbl(); /*limpiamos los label que informan sino se completo algun campo para realizar el login**/
            /*validamos que el usuario ingrese datos en las cajas de texto, sino lo hace, le mostramos un mensaje en el label correspondiente o en ambos**/
            if (logusu.caja_usuario.getText().equalsIgnoreCase("")|| logusu.caja_usuario.getText().equalsIgnoreCase("Ingrese usuario")) {
                logusu.lbl_user_ing.setText("ESTE CAMPO ES REQUERIDO");
            }
            if (logusu.caja_passw.getText().equalsIgnoreCase("") || logusu.caja_passw.getText().equalsIgnoreCase("Ingrese password")) {
                logusu.lbl_pass_ing.setText("ESTE CAMPO ES REQUERIDO");
            }
            String contras = String.valueOf(logusu.caja_passw.getPassword());/*realizo un parseo,luego, almaceno el pass de la caja de texto en una variable del tipo String **/
            /*valido que el usuario haya ingresado datos en ambas cajas**/
            if (!logusu.caja_usuario.getText().equals("") && !contras.equals("")){ 
                /*valido que el usuario no haya dejado el texto inicial de las cajas**/
                if(logusu.caja_usuario.getText().equalsIgnoreCase("Ingrese usuario") || logusu.caja_passw.getText().equalsIgnoreCase("Ingrese password")){
                
                   JOptionPane.showMessageDialog(null, "Lo siento, debe ingresar datos válidos para hacer el login");
                    }
                else{
                usudto.setUsuario_sistema(logusu.caja_usuario.getText());
                usudto.setPassword(contras);

                if (usudao.Loguear(usudto, rdto)) {
                    if (rdto.getDescripcion_rol().equalsIgnoreCase("administrador")) {
                        logusu.dispose();
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema Administrador");
                        Ctrl_Menu_Administrador c_menu_adm = new Ctrl_Menu_Administrador(usudto, rdto);
                    } else {
                        logusu.dispose();
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema usuario");
                        Ctrl_Menu_Usuario c_menu_usuario = new Ctrl_Menu_Usuario(usudto, rdto);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Lo siento, los datos ingresados para realizar el login, son incorrectos");
                    this.limpiar_Cajas();
                }
            } 
                }else {
                JOptionPane.showMessageDialog(null, "Debe ingresar caracteres en los casilleros");
                this.limpiar_Cajas();
            }
        }
      
            if (boton.getSource() == logusu.btb_registro_nuevo) {
            Ctrl_Registro_Nuevo rnuevo = new Ctrl_Registro_Nuevo(usudto);
        }
    }

    /*dejo los componentes sin texto**/
    private void limpiar_Cajas() {
        logusu.caja_usuario.setText("");
        logusu.caja_passw.setText("");
    }

    /*quito el texto de los JLabel**/
    private void limpiar_Lbl() {
        logusu.lbl_user_ing.setText("");
        logusu.lbl_pass_ing.setText("");
    }

    /*Escalo imagen al tamaño del componente JLabel en el que se encuentre contenida**/
    private void setImageLabel_Login(JLabel lbl_crud, String root) {
        ImageIcon img_lbl_user = new ImageIcon(root);
        Icon icono = new ImageIcon(img_lbl_user.getImage().getScaledInstance(lbl_crud.getWidth(), lbl_crud.getHeight(), Image.SCALE_DEFAULT));
        lbl_crud.setIcon(icono);
        this.logusu.repaint();
    }

    private void agregarEstilo_Ph(JTextField caja_login) {
        Font fuente = caja_login.getFont();
        fuente = fuente.deriveFont(Font.ROMAN_BASELINE);
        caja_login.setFont(fuente);
        caja_login.setForeground(Color.GRAY);
    }

    /*al ganar el foco un JTextfield, coloco un estilo diferente al texto(ingresado)**/
    private void quitarEstilo_Ph(JTextField caja_login) {
        Font fuente = caja_login.getFont();
        fuente = fuente.deriveFont(Font.HANGING_BASELINE);
        caja_login.setFont(fuente);
        caja_login.setForeground(Color.BLACK);
    }

    /*Inicializo las propiedades del formulario en el constructor**/
    @Override
    public void focusGained(FocusEvent evt_foco) {
        if (evt_foco.getSource() == logusu.caja_usuario) {
            
            if (logusu.caja_usuario.getText().equals("Ingrese usuario")) {
                logusu.caja_usuario.setText("");
                logusu.caja_usuario.requestFocus(); /*le asignamos foco al componente JTextfield**/
                quitarEstilo_Ph(logusu.caja_usuario);/*modificamos el estilo del texto inicial**/
            } else {
                logusu.caja_usuario.getText();
            }
        }
        if (evt_foco.getSource() == logusu.caja_passw) {
            
            if (logusu.caja_passw.getText().equals("Ingrese password")) {
                logusu.caja_passw.setText("");
                logusu.caja_passw.requestFocus();/*le asignamos foco al componente JTextfield**/
                logusu.caja_passw.setEchoChar('*');/*mostramos asteriscos para proteger la contraseña ingresada por el usuario**/
                quitarEstilo_Ph(logusu.caja_passw);/*modificamos el estilo del texto inicial**/
            } else {
                logusu.caja_passw.getText();
            }
        }
    }

    /*si al perder foco un componente JTextfield, no se ingreso ningun texto en el componente, dejo el estilo inicial al texto**/
    @Override
    public void focusLost(FocusEvent txt_log) {

        if (txt_log.getSource() == logusu.caja_usuario) {
            if (logusu.caja_usuario.getText().length() == 0) /*validamos que el usuario haya ingresado algun dato**/{
                this.agregarEstilo_Ph(logusu.caja_usuario);/*sino se agrego ningun dato,volvemos a trabajar con el estilo del texto inicial**/
                logusu.caja_usuario.setText("Ingrese usuario");/* ingresamos el texto inicial con su respectivo estilo**/
            }
        }
        if (txt_log.getSource() == logusu.caja_passw) {
           
            if (logusu.caja_passw.getText().length()== 0) {
                this.agregarEstilo_Ph(logusu.caja_passw);
                logusu.caja_passw.setText("Ingrese password");
                logusu.caja_passw.setEchoChar('\u0000');/*hacemos visible el texto inicial**/

            }
        }
    }

    /*le doy foco a la ventana que acabo de abrir**/
    @Override
    public void windowGainedFocus(WindowEvent e) {
        if (e.getSource() == logusu) {
            logusu.requestFocusInWindow();
        }
        
    }

    /*metodo para capturar un evento al perder foco de la ventana**/
    @Override
    public void windowLostFocus(WindowEvent e) {
        
    }
 /*metodo para capturar un evento al realizar click en el componente cerrar**/
    @Override
    public void mouseClicked(MouseEvent evento_mouse) {
        if(evento_mouse.getSource()== logusu.btb_cerrar_log){
            System.exit(0);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }
 /*metodo para verificar cuando el puntero se posiciona sobre el boton de cerrar,al hacerlo, cambia la forma del cursor**/
    @Override
    public void mouseEntered(MouseEvent evento_mouse) {
        if(evento_mouse.getSource()== logusu.btb_cerrar_log){
            
            logusu.btb_cerrar_log.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
