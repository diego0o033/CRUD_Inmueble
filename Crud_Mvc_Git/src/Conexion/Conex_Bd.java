package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

public class Conex_Bd {

    /*declaramos una variable del tipo Connection y la inicializamos en "null", le colocamos el atrbuto "static" para que sea variable de clase **/
    private static Connection conec = null;

    /*declaramos el metodo "static" para que sea un metodo de la clase, y que para hacer uso del mismo metodo, no tengamos que crear una nueva instancia de la clase**/
    public static Connection devolver_Conexion() {
        /*utilizamos la sentencia try/catch, ya que puede ocurrir una excepcion a la hora de intentar realizar la conexion a nuestro motor de base de datos**/
        try {
            if (conec == null) /*preguntamos si la variable conec es null, la primera vez que realizamos la conexion, va a ser así,procedemos a realizar la conexion**/
            {
                Runtime.getRuntime().addShutdownHook(new MishDwnHook());
                /*utilizo el metodo addShutdownHook para crear un enlace de cierre de la jvm, de esta forma,cierro correctamente la jvm**/
                ResourceBundle rb = ResourceBundle.getBundle("Conexion.Datos_Conexion");
                /*con el objeto ResourceBundle puedo obtener el properties con la config a la bd**/
                String driver = rb.getString("driver");
                String url = rb.getString("url");
                String user = rb.getString("user");
                String pass = rb.getString("pass");
                Class.forName(driver);
                /*la clase "Class" por medio de su metodo forName nos permite levantar el driver a la memoria**/
                conec = DriverManager.getConnection(url, user, pass);
                /*por medio del metodo estático getConnection obtengo una instancia del objeto Connection**/
                JOptionPane.showMessageDialog(null, "Se establecio la conexion a la BD");
                /*notifico al usuario, que la conexion se realizo con exito**/
            }
            return conec;
            /*retorno la unica conexion, ya sea que, la establecí por primera vez, o sí ya la habia realizado,siempre devuelvo la misma  y unica instancia de conexion**/
        } catch (ClassNotFoundException | SQLException ex) /*si ocurre algun problema a la hora de intentar la conexion a la bd,tratamos la excepción **/
        {
            ex.printStackTrace(System.out);
            throw new RuntimeException("no se pudo realizar la conexion con la bd", ex);
            /* mostramos el/los causantes por el cual no se establecio la conexion*/
        }
    }

    /*creamos una inner class para llamarla en el metodo addShutdownHook y así poder cerrar de forma correcta la conexion de la jvm**/
    static class MishDwnHook extends Thread {

        /*sobreescribimos el metodo run, para poder cerrar la conexion correctamente*/
        @Override
        public void run() {
            try {
                Connection conn = Conex_Bd.devolver_Conexion();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                throw new RuntimeException("error:" + ex.getMessage());/* en el caso de no poder cerrar la conexion, mostramos el/los causantes* por no poder finalizarla**/
            }
        }
    }

}
