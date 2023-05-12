
package Dao;

import Dto.Rol_Dto;
import Dto.Usuario_Dto;
import Conexion.Conex_Bd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
 

public class Usuario_Dao {

    /*insertamos un nuevo usuario, si el nombre de usuario no existe en la bd**/
    public boolean insertar_usario(Usuario_Dto usudto) {
        Connection connec = null;
        PreparedStatement pres = null;
        ResultSet rs = null;

        try {
            connec = Conex_Bd.devolver_Conexion();
            String sent_sql = "select count(*) from t_usuario where usuario_sis= ?";/*contamos la cantidad de usuarios con el nombre ingresado (en el caso de que existan)**/
            pres = connec.prepareStatement(sent_sql);
            pres.setString(1, usudto.getUsuario_sistema());/*enviamos el nombre de usuario elegido a la bd, para verificar si ya se encuentra almacenado**/
            rs = pres.executeQuery();
            if (rs.next())/*verificamos si trajo alguna fila de datos**/ {
                if (rs.getInt(1) > 0)/*validamos la existencia del nombre de usuario en nuestra bd, si ya existe, no lo podremos almacenar**/ {
                    JOptionPane.showMessageDialog(null, "El nombre de usuario ya se encuentra en uso, no se puede almacenar el nombre de usuario ",
                            "Usuario existente en BD", JOptionPane.WARNING_MESSAGE);
                } else /*si el nombre no existe en nuestra bd, almacenamos el nuevo usuario con toda su informacion**/ {
                    String sent_sql_2 = "insert into t_usuario(nombre,apellido,usuario_sis,password,email,fecha_alta,id_rol)";
                    sent_sql_2 += "values (?,?,?,?,?,?,?)";
                    PreparedStatement pres2;
                    pres2 = connec.prepareStatement(sent_sql_2);
                    pres2.setString(1, usudto.getNombre());
                    pres2.setString(2, usudto.getApellido());
                    pres2.setString(3, usudto.getUsuario_sistema());
                    pres2.setString(4, usudto.getPassword());
                    pres2.setString(5, usudto.getEmail());
                    pres2.setDate(6, usudto.getFecha_alta());
                    pres2.setInt(7, usudto.getId_rol());
                    pres2.execute();
                    return true;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error,los datos no fueron insertados en la bd" + ex.getMessage());

        } finally {
            try/*intentamos cerrar los objetos PreparedStatement y ResultSet, una vez finalizada la consulta**/ {
                if (pres != null) {
                    pres.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "se genero un error y nose pudo cerrar la conexion" + e.getMessage());
            }
        }
        return false;
    }

    /*metodo para realizar un login,si el login es correcto, podremos ingresar al sistema con un rol especifico**/
    public boolean Loguear(Usuario_Dto usudto, Rol_Dto rdto) {
        Connection connec = null;
        PreparedStatement pst = null;
        ResultSet rset = null;

        try {
            connec = Conex_Bd.devolver_Conexion();

            String sent_sql = "select u.usuario_sis, u.password,r.descripcion_rol "
                    + "from t_usuario as u inner join t_rol as r on u.id_rol=r.id_rol where u.usuario_sis=?";

            pst = connec.prepareStatement(sent_sql);
            pst.setString(1, usudto.getUsuario_sistema());/*envio el nombre de usuario a consultar, comprobamos la existencia del usuario en la bd**/
            rset = pst.executeQuery();

            if (rset.next())/*si obtenemos una fila de datos,continuamos con la obtencion de los datos del login**/ {
                if (usudto.getPassword().equals(rset.getString(2)))/*validamos la contraseña ingresada por el usuario,con la almacenada en la bd**/ {
                    usudto.setUsuario_sistema(rset.getString(1));
                    usudto.setPassword(rset.getString(2));
                    rdto.setDescripcion_rol(rset.getString(3));
                    JOptionPane.showMessageDialog(null, "Ha ingresado correctamente al sistema");
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, " no se encontro ningun registro en la bd con la contraseña ingresada, ingrese nuevamente la contraseña");
                }
            } else {
                JOptionPane.showMessageDialog(null, " no se encontro ningun registro en la bd con el nombre de usuario ingresado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se realizo el login" + ex.getMessage());
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (rset != null) {
                    rset.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "se genero un error y nose pudo cerrar la conexion" + e.getMessage());
            }
        }
        return false;
    }
}
