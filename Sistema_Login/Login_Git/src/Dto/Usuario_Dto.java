
package Dto;

import java.sql.Date;

/*definimos propiedades del Usuario_Dto**/
public class Usuario_Dto {
    private String nombre;
    private String apellido;
    private String usuario_sistema;
    private String password;
    private String email;
    private Date fecha_alta;
    private int id_rol;
    

    public String getUsuario_sistema() {
        return usuario_sistema;
    }

    public void setUsuario_sistema(String usuario_sistema) {
        this.usuario_sistema = usuario_sistema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
}
