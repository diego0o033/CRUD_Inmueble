
package crud_mvc_git;

import Controlador.Ctrl_Crud_Inmueble;
import Dao.Dao_Inmueble;
import Dto.Dto_Inmueble;
import Vista.Crud_Inmueble;

/**
 *
 * @author diego vargas
 */
public class Crud_Mvc_Git_App {

    
    public static void main(String[] args) {
        /*****declaro e instancio los objetos con los que necesito trabajar en el controlador del crud*********/
        Crud_Inmueble crud= new Crud_Inmueble();
        Dao_Inmueble dao_inmueble= new Dao_Inmueble();
        Dto_Inmueble dto_inmueble = new Dto_Inmueble();
        
        Ctrl_Crud_Inmueble ccinmueble= new Ctrl_Crud_Inmueble(crud,dao_inmueble, dto_inmueble);
        crud.setVisible(true); /*****llamo al metodo setVisible del objeto crud, para mostrar la ventana con sus componentes al correr la aplicación*********/
    }
    
}
