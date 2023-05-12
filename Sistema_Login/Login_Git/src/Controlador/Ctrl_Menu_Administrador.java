
package Controlador;

import Dto.Rol_Dto;
import Dto.Usuario_Dto;
import Vista.Menu_Administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author diego vargas
 */
public class Ctrl_Menu_Administrador implements ActionListener {

    private Menu_Administrador vista_menu_adm;

    public Ctrl_Menu_Administrador(Usuario_Dto usudto, Rol_Dto rdto) {
        vista_menu_adm = new Menu_Administrador();
        vista_menu_adm.menu_usuario2.addActionListener(this);
        vista_menu_adm.setTitle("MENÚ ADMINISTRADOR");
        vista_menu_adm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vista_menu_adm.setLayout(null);
        vista_menu_adm.setLocationRelativeTo(null);
        vista_menu_adm.usua_lbl.setText(usudto.getUsuario_sistema());/*mostramos el nombre de usuario en el label,obtenido a partir del logueo exitoso**/
        vista_menu_adm.rol_lbl.setText(rdto.getDescripcion_rol());/*mostramos el rol del usuario en el label,obtenido a partir del logueo exitoso**/
        Calendar c = Calendar.getInstance();/*obtenemos una instancia del objeto calendario**/
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");/*instanciamos al objeto SimpleDateFormat y le pasamos por parametro el tipo de formato para mostrar la fecha**/
        vista_menu_adm.lbl_fecha.setText(sdf.format(c.getTime()));/*le establecemos la fecha  formateada obtenida del objeto tipo calendar y lo mostramos en el label**/
        vista_menu_adm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista_menu_adm.menu_usuario2)/*si ocurre un evento en el item menu_usuario2, instanciamos un nuevo Ctrl_formulario_Alta y vemos la vista alta_usuario**/ {
            Ctrl_Formulario_Alta_Usuario ctrl_faltausuario = new Ctrl_Formulario_Alta_Usuario();
            JOptionPane.showMessageDialog(null, "En breve se encontrara finalizado el siguiente formulario.....");
        }
    }
}
