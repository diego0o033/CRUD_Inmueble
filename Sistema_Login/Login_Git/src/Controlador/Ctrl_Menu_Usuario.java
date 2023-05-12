
package Controlador;

import Dto.Rol_Dto;
import Dto.Usuario_Dto;
import Vista.Menu_Usuario;
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
/**Similar al menu administrador*/
public class Ctrl_Menu_Usuario implements ActionListener {

    private Menu_Usuario musuario;

    public Ctrl_Menu_Usuario(Usuario_Dto usudto, Rol_Dto rdto) {
        musuario = new Menu_Usuario();
        musuario.alta_cliente.addActionListener(this);
        musuario.setTitle("MENÚ USUARIO");
        musuario.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        musuario.setLayout(null);
        musuario.setLocationRelativeTo(null);
        musuario.musua_lbl.setText(usudto.getUsuario_sistema());
        musuario.mrol_lbl.setText(rdto.getDescripcion_rol());
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        musuario.musua_fecha_lbl.setText(sdf.format(c.getTime()));
        musuario.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == musuario.alta_cliente) {
            Ctrl_Formulario_Alta_Cliente ctrl_falta_cliente = new Ctrl_Formulario_Alta_Cliente();
            JOptionPane.showMessageDialog(null, "En breve se encontrara finalizado el siguiente formulario.....");
        }
    }

}
