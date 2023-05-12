
package Login_Git_Mvc;

import Controlador.Ctrl_Login;
import Dao.Usuario_Dao;
import Dto.Rol_Dto;
import Dto.Usuario_Dto;
import Vista.Login_Usuario;

/**
 *
 * @author diego vargas
 */
public class Login_Git_Mvc_App {

   
    public static void main(String[] args) {
       Usuario_Dao usudao= new Usuario_Dao();
        Usuario_Dto usudto= new Usuario_Dto();
        Rol_Dto rdto= new Rol_Dto();
        Login_Usuario log_usu= new Login_Usuario();
        
        Ctrl_Login ctrl_log = new Ctrl_Login(usudto,usudao,rdto,log_usu);
        log_usu.setVisible(true);
    }
    
}
