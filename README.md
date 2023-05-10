# CRUD_Inmueble
Proyecto realizado en java con interfaz grafica y conexión a base de datos 
# Crud Inmueble
#### Descripción del repositorio
- Es un proyecto realizado en el taller de programación java, dicho repositorio tiene como finalidad mostrar los temas trabajados en el laboratorio de programacion.Este es un proyecto ** Open Source** por lo que puedes modificar y adaptar según lo necesites. 

----
#### ***A continuación se muestran capturas del CRUD Inmueble:*** 
----


!["Imagen principal"](https://i.postimg.cc/nrgc77gN/img-princ-3.png)

!["Busqueda x filtro"](https://i.postimg.cc/T24PZM1Q/img-filtro-busq-2.png)

!["Insertar registro en bd"](https://i.postimg.cc/HLdWQTvW/img-insertar-Datos.png)

!["Actualizar datos"](https://i.postimg.cc/CxjLBRN6/img-modificar-Datos-2.png)

---
#### Breve descripción sobre el funcionamiento del CRUD:

- A través del JDBC se conecta a la base de datos Mysql(utilizando mysql connector vers. 8.0.28)

- Se utiliza un archivo properties, para la configuracion de la base de datos, de esta forma evitamos hardcodear el codigo de la clase conexion(Conex_Bd), solo modificamos los valores en el archivo properties y ya nos conectamos a nuestra base de datos.

- Permite realizar diversas búsquedas, de acuerdo a la selección que se realice en el filtro de búsqueda.

- A la hora de insertar registros a la base de datos, válida que los campos del formulario se encuentren con valores, de lo contrario, nos avisa que completemos los campos  antes de insertar los datos. También válida que el código de inmueble  no se repita, de esta forma cada registro de un inmueble en nuestra base de datos, es único.

- Al querer modificar un registro, no es necesario cargar los datos en el formulario manualmente, se selecciona una fila de la tabla y automáticamente se completan los valores en los campos del formulario.

- Se utiliza una única conexión para todas las transacciones que se deben realizar en el CRUD, a través de la utilización del patrón de diseño Singleton.
# Caracteristicas:
- Uso de Patrón MVC
- Uso de Patrón DAO
- Uso de Patrón DTO
- Uso de Patrón SINGLETON
- Conexión a base de datos Mysql Workbench

# Herramientas:
* Java SE
* Mysql Workbench :  [Ver repositorio: Script CRUD](https://github.com/diego0o033/Script-Crud_Inmueble)
* Librerias Java:
 * Swing
 * Util
 * ArrayList
 * SQL
* JAR
 * MYSQL JDBC
