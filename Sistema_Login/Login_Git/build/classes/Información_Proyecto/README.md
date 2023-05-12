# Sistema_Login
#### Descripción del repositorio
- Es un proyecto realizado en el taller de programación java, dicho repositorio tiene como finalidad, autenticar a diferentes tipos de usuarios y de mostrar un menú, según el rol del usuario que ingresó al sistema.Este es un proyecto ** Open Source** por lo que puedes modificar y adaptar según lo necesites. 

----
#### ***A continuación se muestran capturas del Sistema_Login*** 
----
[![img-inicial.png](https://i.postimg.cc/hGXjkdJ7/img-inicial-1.png)

!["Registro nuevo"](https://i.postimg.cc/MpKXY4q5/img-reg-nuev.png)

!["Menú administrador"](https://i.postimg.cc/7YNf0D8b/menu-adm.png)

---
#### Breve descripción del Sistema_Login:

- A través del JDBC se conecta a la base de datos Mysql(utilizando mysql connector vers. 8.0.28)

- Se utiliza un archivo properties, para la configuracion de la base de datos, de esta forma evitamos hardcodear el codigo de la clase conexion(Conex_Bd), solo modificamos los valores en el archivo properties y ya nos conectamos a nuestra base de datos.

- Permite autenticar diferentes tipos de usuario y mostrar diferentes pantallas, de acuerdo al rol del usuario.

- Válida que los campos de usuario y contraseña tengan valores.

- Al querer registrar un nuevo usuario, válida que el nombre de usuario no se encuentre registrado en la bd, si existe un nombre de usuario ya registrado,nos va a solicitar que lo modifiquemos, de lo contrario, no lo vamos a poder almacenar.

- Se utiliza una única conexión para todas las transacciones que se deben realizar en el CRUD, a través de la utilización del patrón de diseño Singleton.
# Caracteristicas:
- Uso de Patrón MVC
- Uso de Patrón DAO
- Uso de Patrón DTO
- Uso de Patrón SINGLETON
- Conexión a base de datos Mysql Workbench

# Herramientas:
* Java SE
* Mysql Workbench :  [Ver repositorio: Script Sistema_Login](https://github.com/diego0o033/Script_Sistema_Login)
* Librerias Java:
 * Swing
 * Util
 * JAR
 * MYSQL JDBC