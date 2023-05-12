package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

public class Conex_Bd {
 
    private static Connection conec = null;

    public static Connection devolver_Conexion() 
    {
        try 
        { 
            if (conec == null)
            {
                Runtime.getRuntime().addShutdownHook(new MiShDwnHook());
                ResourceBundle rb = ResourceBundle.getBundle("Conexion.Datos_Conexion");
                String driver= rb.getString("driver");
                String url= rb.getString("url");
                String user= rb.getString("user");
                String pass= rb.getString("pass");
                Class.forName(driver);
                conec = DriverManager.getConnection(url, user, pass);
                JOptionPane.showMessageDialog(null, "Se establecio la conexion a la BD");
             } 
          return conec;  
        }         
       
        catch (ClassNotFoundException| SQLException ex) 
                {
                    ex.printStackTrace(System.out);
                    throw new RuntimeException("no se pudo realizar la conexion con la bd", ex);
                } 
    }
    
    static class MiShDwnHook extends Thread {

        @Override
        public void run() {
            try 
            {
                conec = Conex_Bd.devolver_Conexion();
                conec.close();
            } 
            catch (SQLException ex) 
            {
                ex.printStackTrace(System.out);
                throw new RuntimeException(ex);
            }
        }
    }
}
