
package Dao;

import Conexion.Conex_Bd;
import Dto.Dto_Inmueble;
import Vista.Crud_Inmueble;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author diego vargas
 */
public class Dao_Inmueble {

    /*Metodo para insertar datos a la bd, recibe por parametro un objeto del tipo dto**/
    public boolean insertar_Datos(Dto_Inmueble dtoinm) {
        /*objeto sentencia preparada, permite ejecutar nuestra consulta con la bd, va a recibir la consulta sql por parametro**/
        PreparedStatement pst = null;
        PreparedStatement pst_1=null;
        Connection con = null;/*declaro una variable del tipo conexion y la inicializo en "null"**/
        ResultSet rs= null;
        /*utilizo la sentencia try/catch, por sí ocurre una posible excepcion al intentar querer insertar los datos a la bd**/
        try {
            con = Conex_Bd.devolver_Conexion();
            String sent_sql = "select count(*) from inmueble where codigo_inmueble= ?";
            pst = con.prepareStatement(sent_sql);
            pst.setString(1, dtoinm.getCodigo_Inmueble());/*enviamos el codigo del inmueble elegido a la bd, para verificar si ya se encuentra almacenado**/
            rs = pst.executeQuery();
            if (rs.next())/*verificamos si trajo alguna fila de datos**/ {
                if (rs.getInt(1) > 0)/*validamos la existencia del codigo de inmueble en nuestra bd, si ya existe, no lo podremos almacenar**/ {
                    JOptionPane.showMessageDialog(null, "El codigo del inmueble ya se encuentra en uso, no se puede almacenar el codigo de inmueble ingresado ",
                            "Codigo de Inmueble existente en BD", JOptionPane.WARNING_MESSAGE);
                }else{
                    con = Conex_Bd.devolver_Conexion();
                    /*a la variable del tipo Connection le almaceno la unica instancia de la conexion a la bd**/
                    /*Almaceno en la variable del tipo String, mi instruccion sql para que se ejecute en mi gestor de bd mysql**/
                    String sent_sql_1 = "insert into inmueble (codigo_inmueble,tipo_inmueble,tipo_moneda,valor,direccion,altura,localidad,cantidad_ambientes,metros_cuadrados)";
                    sent_sql_1 += "values (?,?,?,?,?,?,?,?,?)";
                    /*llamo al metodo prepareStatement(del objeto con) y le paso por argumento la consulta a la bd**/
                    pst_1 = con.prepareStatement(sent_sql_1);           
                    /*seteo los datos de forma ordenada, del objeto dto recibido por parametro (los datos que quiero registrar),y enviar a traves del objeto pst**/
                    pst_1.setString(1, dtoinm.getCodigo_Inmueble());
                    pst_1.setInt(2, dtoinm.get_Tipo_Inmueble());
                    pst_1.setInt(3, dtoinm.get_Tipo_Moneda());
                    pst_1.setDouble(4, dtoinm.get_Valor());
                    pst_1.setString(5, dtoinm.get_Direccion());
                    pst_1.setInt(6, dtoinm.get_Altura());
                    pst_1.setString(7, dtoinm.getLocalidad());
                    pst_1.setInt(8, dtoinm.get_Cantidad_Ambientes());
                    pst_1.setInt(9, dtoinm.get_M2());
                    pst_1.execute();
                    /*una vez finalizada la carga de datos para almacenar, ejecuto mi sentencia a la bd**/
                    return true;
                    /*si ejecutamos con exito la consulta, retornamos verdadera la instruccion**/
                    } 
                }
           }catch (SQLException ex) /*si ocurre un error al intentar consultar a la bd, el catch atrapa la excepcion y nos muestra el error**/
        {
            JOptionPane.showMessageDialog(null, "Lo siento, no sé insertaron los datos en la base de datos" + " " + ex.getMessage());
        } /*ejecuto el bloque finally para intentar cerrar la sentencia preparada**/
        finally {
            try {
                if (pst != null && pst_1 != null) {
                    pst.close(); pst_1.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "se genero un error y nose pudo cerrar la conexion"+ " " +  e.getMessage());
            }
        }
        return false;
        /*retornamos false, si no tuvimos exito al realizar la consulta**/
    }

    /*metodo para modificar datos de un objeto almacenado,recibimos por parametro el objeto dto que deseamos modificar**/
    public boolean modificar_Datos(Dto_Inmueble dtoinm) {
        PreparedStatement pstm = null;
        Connection con = null;

        try {
            con = Conex_Bd.devolver_Conexion();

            String sent_sql = "update inmueble set codigo_inmueble=?, tipo_inmueble=?, tipo_moneda=?, valor=?, direccion=?, altura=?, localidad=?,cantidad_ambientes=?,metros_cuadrados=? ";
            sent_sql += "where codigo_inmueble = '" + dtoinm.getCodigo_Inmueble() + "'";

            pstm = con.prepareStatement(sent_sql);
            pstm.setString(1, dtoinm.getCodigo_Inmueble());
            pstm.setInt(2, dtoinm.get_Tipo_Inmueble());
            pstm.setInt(3, dtoinm.get_Tipo_Moneda());
            pstm.setDouble(4, dtoinm.get_Valor());
            pstm.setString(5, dtoinm.get_Direccion());
            pstm.setInt(6, dtoinm.get_Altura());
            pstm.setString(7, dtoinm.getLocalidad());
            pstm.setInt(8, dtoinm.get_Cantidad_Ambientes());
            pstm.setInt(9, dtoinm.get_M2());
            pstm.executeUpdate();/*para ejecutar nuestra sentencia preparada a la bd**/
            return true;
            /*si tuvimos exito, retornamos verdadero**/
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " no sé actualizaron los datos en la base de datos"+ " " +  ex.getMessage());
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "se genero un error y no sé pudo cerrar la conexion " + " " + e.getMessage());
            }
        }
        return false;
    }

  /*metodo para quitar un objeto de la bd,el objeto a eliminar en este caso es un dto_inmueble, el cual lo vamos a eliminar de acuerdo a su codigo**/
    public boolean eliminar_Datos(Dto_Inmueble dtoinm) {
        PreparedStatement pste = null;
        Connection con = null;

        try {
            con = Conex_Bd.devolver_Conexion();

            String sent_sql = "delete from inmueble where codigo_inmueble = '" + dtoinm.getCodigo_Inmueble() + "'";
            pste = con.prepareStatement(sent_sql);
            pste.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no sé pudo realizar la consulta en la base de datos, registro sin modificaciones " + " " +  ex);
        } finally {
            try {
                if (pste != null) {
                    pste.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " no sé pudo realizar el cierre de la conexion" + " " +  e.getMessage());
            }
        }

        return false;
    }

    /*metodo para buscar registros en la bd, va a buscar, de acuerdo a la seleccion que haya realizado el usuario combobox) y lo que haya colocado en la caja de texto*/
    public boolean buscar_X_Filtro(Crud_Inmueble cinmueble, String filtro_busqueda, String valor_caja_buscar) {
        PreparedStatement psb = null;
        Connection con = null;
        ResultSet rs = null;
       /*el objeto ResultSet proporciona varios metodos para obtener los datos de las columnas(en la bd) que corresponden a una fila en cuestion**/
        DefaultTableModel modelo = new DefaultTableModel();
        /*declaro e instancio un objeto DefaultTableModel(esquema logico del jtable)**/
        /*defino en un arreglo de objetos los encabezados/identificadores de columna del objeto jtable**/
        modelo.setColumnIdentifiers(new Object[]{"Cod.inmueble", "Inmueble ", "Moneda ", "Valor", "Direccion", "Altura", "Localidad", "Cant.ambientes", "metros_2"});
        /*llamo al metodo setRowCount para establecer que comience a contabilizar desde la fila 0**/
        modelo.setRowCount(0);
        String datos_filas[] = new String[9];
        /*declaramos y creamos un array(tipo String)definimos el tamaño de acuerdo a la cantidad de columnas que tiene la tabla en nuestra bd**/
        try {

            con = Conex_Bd.devolver_Conexion();
            /*armamos el query para traer los datos almacenados en la bd y mostrarlos en el jtable,traemos datos de varias tablas, por eso utilizamos inner join**/
            String sent_sql = ("select codigo_inmueble,descripcion_inmueble,descripcion_moneda,valor,direccion,altura,localidad,cantidad_ambientes,metros_cuadrados "
                    + "FROM inmueble inner join tipo_inmueble on tipo_inmueble= tipo_inmueble.id_tipo_inmueble "
                    + "inner join tipo_moneda on tipo_moneda= tipo_moneda.id_tipo_moneda "
                    + " WHERE " + filtro_busqueda + " like '%" + valor_caja_buscar + "%'");

            psb = con.prepareStatement(sent_sql);
            rs = psb.executeQuery();
            /*al utilizar el objeto ResultSet, va a ser el encargado de ejecutar la consulta a la bd con la sentencia preparada**/
            while (rs.next()) /*el ResultSet almacena toda la informacion de la consulta,utilizamos el ciclo while para extraer varias filas**/
            {
                /*le pasamos al array de string, todos los registros por columna, ordenadas de la primera a la ultima columna, a cada posicion del array**/
                datos_filas[0] = rs.getString(1);
                datos_filas[1] = rs.getString(2);
                datos_filas[2] = rs.getString(3);
                datos_filas[3] = rs.getString(4);
                datos_filas[4] = rs.getString(5);
                datos_filas[5] = rs.getString(6);
                datos_filas[6] = rs.getString(7);
                datos_filas[7] = rs.getString(8);
                datos_filas[8] = rs.getString(9);
                modelo.addRow(datos_filas);
                /*utilizamos el metodo addRow del modelo para pasarle por parametro el array con la informacion extraida del objeto rs**/
            }
            cinmueble.tabla_datos.setModel(modelo);
            /*llamamos al jtable de la vista y le establecemos el modelo con la informacion consultada en la bd**/
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lo siento, no sé pudo realizar la consulta a la base de datos " + ex.getMessage());
        } finally {
            try {
                if (psb != null) {
                    psb.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lo siento, no sé pudo cerrar la conexión" + " " +  e.getMessage());
            }
        }
        return false;
    }

    /*este metodo nos permite traer todos los registros almacenados en nuestra tabla inmueble de la bd y mostrarlos en el jtable de la vista*/
    public boolean cargar_Datos_Tabla(Crud_Inmueble cinmueble) {
        PreparedStatement pst = null;
        Connection con = null;
        ResultSet rs = null;

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Cod.inmueble", "Inmueble ", "Moneda ", "Valor", "Direccion", "Altura", "Localidad", "Cant.ambientes", "metros_2"});
        modelo.setRowCount(0);
        String datos_filas[] = new String[9];

        try {
            con = Conex_Bd.devolver_Conexion();
          /*es otra manera de armar el query,con el operador \n hacemos un salto de linea y marcamos la continuidad del query con la concatenacion del operador +**/
            String sent_sql = "select codigo_inmueble,descripcion_inmueble,descripcion_moneda,valor,direccion,altura,localidad,cantidad_ambientes,metros_cuadrados \n"
                    + "from inmueble inner join tipo_inmueble on tipo_inmueble= tipo_inmueble.id_tipo_inmueble \n"
                    + "inner join tipo_moneda on tipo_moneda= tipo_moneda.id_tipo_moneda order by codigo_inmueble asc";
            pst = con.prepareStatement(sent_sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                datos_filas[0] = rs.getString(1);
                datos_filas[1] = rs.getString(2);
                datos_filas[2] = rs.getString(3);
                datos_filas[3] = rs.getString(4);
                datos_filas[4] = rs.getString(5);
                datos_filas[5] = rs.getString(6);
                datos_filas[6] = rs.getString(7);
                datos_filas[7] = rs.getString(8);
                datos_filas[8] = rs.getString(9);
                modelo.addRow(datos_filas);
            }
            cinmueble.tabla_datos.setModel(modelo);

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lo siento, no sé pudo realizar la consulta a la base de datos " + " " +  ex.getMessage());
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocurrio un error, no sé ha podido cerrar la conexión" + " " +  e.getMessage());
            }
        }
        return false;
    }
}
