Sistema de Inventario con Base de Datos (JDBC)

[Descripción]
Este proyecto es un Sistema de Inventario desarrollado en Java, cuya finalidad es proporcionar una solución funcional y confiable para la gestión de productos utilizando una base de datos relacional.
El sistema permite registrar, consultar, actualizar y eliminar productos, manteniendo la información organizada y accesible mediante operaciones CRUD completas. Está diseñado siguiendo una separación básica por capas, lo que facilita el mantenimiento y la escalabilidad del sistema.



[Objetivos]
Ofrecer una solución de gestión de inventario que permita:

1. - Conectarse a una base de datos mediante JDBC
2. - Implementar operaciones CRUD completas
3. - Separar la lógica del sistema en capas (DAO básico)
4. - Manejar errores reales provenientes de la base de datos



Tecnologías Utilizadas
- Java
- JDBC
- MariaDB
- DBeaver
- Base de datos relacional



Requisitos del Sistema

Para poder ejecutar correctamente el sistema, se requiere:

1. - Java JDK 8 o superior
2. - Motor de base de datos MariaDB
3. - Herramienta de administración de base de datos DBeaver
4. - Configuración correcta de la conexión JDBC
5. - Base de datos creada previamente con la tabla correspondiente
6. - IDE de desarrollo (NetBeans, IntelliJ IDEA, Eclipse o similar)



Arquitectura de la Base de Datos

>Nombre de la base de datos:  
inventory_db

>Gestor de base de datos:  
MariaDB

>Herramienta utilizada para la administración de la base de datos:  
DBeaver

>Tabla principal:  
products

>Estructura de la tabla:
- id – Identificador único del producto
- name – Nombre del producto
- price – Precio del producto
- quantity – Cantidad disponible
- category – Categoría del producto



Estructura del Proyecto

El sistema está organizado en una estructura por capas que permite una mejor separación de responsabilidades y facilita el mantenimiento del código.

>model/
- Contiene las clases que representan las entidades del sistema  
- Ejemplo: Product.java

>dao/
- Contiene las clases encargadas del acceso a datos
- Implementa las operaciones CRUD utilizando JDBC  
- Ejemplo: ProductDAO.java

>db/
- Contiene la configuración y conexión a la base de datos  
- Ejemplo: ConnectionDB.java

>service/
- Contiene la lógica de negocio del sistema  
- Intermedia entre la capa DAO y la aplicación principal  
- Ejemplo: ProductService.java

>Main.java
- Punto de entrada del sistema
- Ejecuta y prueba las funcionalidades del inventario



[[Funcionalidades]]

Registro de Productos
El sistema permite registrar nuevos productos en la base de datos.  
La información es almacenada de forma estructurada para su posterior gestión dentro del inventario.

-----

Listado de Productos
- Visualización de todos los productos registrados
- Permite conocer el estado general del inventario

-----

Búsqueda de Productos por ID
- Consulta específica de un producto mediante su identificador
- Retorna la información detallada del producto solicitado

-----

Actualización de Productos
- Modificación de los datos de un producto existente
- Permite actualizar nombre, precio, cantidad o categoría

-----

Eliminación de Productos
- Eliminación permanente de productos del inventario
- Función orientada a la administración y control del sistema

-----
 
Enfoque del Sistema
El sistema aplica un enfoque estructurado que incluye:
- Separación por capas (model, dao, service)
- Acceso a datos mediante JDBC
- Manejo de errores provenientes de la base de datos
- Administración de la base de datos mediante DBeaver

-----

Escalabilidad y Proyección
El diseño del sistema permite su evolución hacia:
1. - Implementación de validaciones avanzadas
2. - Integración con interfaces gráficas o aplicaciones web
3. - Manejo de reportes de inventario
4. - Uso en sistemas empresariales de mayor escala



{{Uso del Sistema}}
Este proyecto puede utilizarse como:
1. - Sistema básico de inventario
2. - Ejemplo práctico de CRUD con JDBC y MariaDB
3. - Proyecto académico para el aprendizaje de bases de datos y arquitectura en capas



{{Equipo de Desarrolladores}}
Este sistema fue diseñado y desarrollado por:

- Daniel Gonzalez
- Balnia Miranda
