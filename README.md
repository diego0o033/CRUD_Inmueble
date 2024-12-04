# CRUD_Inmueble 🏠  
## **Proyecto realizado en java con interfaz grafica y conexión a base de datos.**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) 
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)

---

## Descripción del repositorio 📋 
Proyecto realizado en el taller de programación Java para practicar los conceptos trabajados en el laboratorio. Este CRUD permite gestionar inmuebles con funcionalidades de búsqueda, inserción, modificación y validaciones integradas.  

Es un proyecto **Open Source**, lo que significa que puedes modificar y adaptarlo según tus necesidades.

---

## Capturas de Pantalla 📸  

### Pantalla Principal  
**Visualización inicial, conexión a la base de datos y carga de datos:**  
 
 <div style= "display: flex; justify-content: space-around;">
  <img src="https://github.com/user-attachments/assets/e705a015-05d3-4f92-9006-7daca19ed682" alt= "imagen_principal" width="48%">
  <img src="https://github.com/user-attachments/assets/0fce5d03-3464-4ba8-a896-1f8273413056" alt= "estableciendo_conexion_bd" width="48%">
  <img src="https://github.com/user-attachments/assets/db2ae50b-5c3f-49be-bd1d-1ffcf86603a3" alt= "carga_registros" width="96.5%">

 </div>
 
 #### Insertar y modificar datos:

<div style= "display: flex; justify-content: space-around;">
  <img src="https://github.com/user-attachments/assets/981f1607-04c4-4965-855b-4c22e40e7632" alt= "insertar_datos_form_crud" width="48%">
  <img src="https://github.com/user-attachments/assets/3b2b104f-a7cf-483a-857c-0479c61073a4" alt= "modificar_datos_registro" width="48%">
  <img src="https://github.com/user-attachments/assets/73eb9675-1e18-41cf-ab8c-193d176e617a" alt= "modificacion_realizada" width="96.5%">

</div>


### Filtro de Búsqueda  
**Filtra registros por diferentes criterios como localidad o código de propiedad:**
<div style=" display: flex; justify-content: space-around">
  <img src="https://github.com/user-attachments/assets/5983b6b6-788c-4245-bf09-3316e5c2710a" alt="filtro_localidad" width:"48%">
  <img src="https://github.com/user-attachments/assets/f4bbc8c0-57c4-4d00-9834-428bb219ee23" alt="filtro_codigo_propiedad" width:"48%">

</div>

---

## Funcionalidades ⚙️  

- **Conexión a MySQL**: Implementada mediante JDBC y un archivo `.properties` para evitar hardcoding.  
- **Búsquedas avanzadas**: Permite filtrar inmuebles por diversos criterios.  
- **Validaciones integradas**:  
  - Verifica campos vacíos antes de insertar datos.  
  - Evita la duplicación del código de inmuebles.  
- **Modificación fácil**: Al seleccionar un registro, los datos se completan automáticamente en el formulario.  
- **Patrón Singleton**: Utiliza una única conexión para todas las operaciones del CRUD.  


## Características del Proyecto 🛠️  

- **Patrones de diseño**:  
  - MVC  
  - DAO  
  - DTO  
  - Singleton  
- **Conexión con MySQL Workbench**: Compatible con la versión 8.0.28 del conector.  

---

## Herramientas Utilizadas 🛠️  

| Herramienta         | Descripción                                      |  
|----------------------|--------------------------------------------------|  
| **Java SE**          | Para el desarrollo de la aplicación.            |  
| **MySQL Workbench**  | Gestión de la base de datos. [Script CRUD](https://github.com/diego0o033/Script-Crud_Inmueble) |  
| **Librerías**        | Swing, ArrayList, SQL, MySQL JDBC, entre otras. |  

---

## Instalación 🚀  

1. Clona este repositorio:  
   ```bash
   git clone https://github.com/tu_usuario/CRUD_Inmueble.git
