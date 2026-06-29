# Gestión de Bases de Datos SQL - Unidad 2

Proyecto práctico desarrollado utilizando MySQL, SQL y Java JDBC como parte del proceso de aprendizaje en gestión de bases de datos relacionales e integración con aplicaciones Java.

## Autor

**Junior Enrique Vega Solano**

---

# Objetivo del Proyecto

Diseñar, implementar y consultar una base de datos relacional denominada **empresa_db**, así como conectarla a una aplicación Java utilizando JDBC.

Este proyecto abarca desde el modelado inicial de la base de datos hasta la construcción de un sistema de consultas mediante Java.

---

# Contenido del Proyecto

## Ejercicio 2.1 - Diseño de Base de Datos

Diseño del esquema relacional de la base de datos **empresa_db**.

Entidades implementadas:

- Usuarios
- Productos
- Pedidos

Aspectos trabajados:

- Claves primarias
- Claves foráneas
- Relaciones entre tablas
- Integridad referencial

---

## Ejercicio 2.2 - Creación de Tablas e Inserción de Datos

Implementación física de la base de datos mediante SQL.

Incluye:

- CREATE DATABASE
- CREATE TABLE
- PRIMARY KEY
- FOREIGN KEY
- INSERT INTO

Se añadieron registros de prueba para validar la estructura creada.

---

## Ejercicio 2.3 - Consultas SQL Básicas

Desarrollo de consultas utilizando:

- SELECT
- WHERE
- ORDER BY

Consultas realizadas:

- Listado de usuarios
- Listado de productos
- Filtros por precio
- Ordenamiento ascendente y descendente

---

## Ejercicio 2.4 - Consultas SQL Avanzadas

Implementación de consultas para combinar y analizar información.

Funciones utilizadas:

- INNER JOIN
- GROUP BY
- COUNT()

Consultas desarrolladas:

- Pedidos con información de usuarios
- Pedidos con información de productos
- Conteo de pedidos por usuario
- Filtrado de pedidos por usuario específico

---

## Ejercicio 2.5 - Conexión con Java mediante JDBC

Desarrollo de una aplicación Java capaz de conectarse a MySQL.

Conceptos aplicados:

- DriverManager
- Connection
- Statement
- ResultSet
- Manejo de excepciones SQL

Archivo principal:

- ConexionBD.java

---

## Ejercicio 2.6 - Sistema de Pedidos

Mini aplicación Java para consultar la base de datos.

Funcionalidades:

- Mostrar productos disponibles
- Mostrar pedidos completos
- Filtrar pedidos por usuario
- Consultas mediante PreparedStatement

Archivos principales:

- ConexionBD.java
- SistemaPedidos.java

---

# Tecnologías Utilizadas

- MySQL Community Server 8.x
- MySQL Workbench
- Java JDK 17 o superior
- JDBC
- IntelliJ IDEA Community Edition
- Git
- GitHub

---

# Estructura del Repositorio

```text
fundamentos-sql-unidad-2/

├── script_sql/
│   ├── U2_gestion_base_de_datos.sql

├── java/
│   ├── ConexionBD.java
│   └── SistemaPedidos.java

└── README.md
```

---

# Aprendizajes Obtenidos

Durante el desarrollo de este proyecto se reforzaron conocimientos relacionados con:

- Diseño de bases de datos relacionales
- Claves primarias y foráneas
- Integridad referencial
- Creación de tablas
- Inserción de datos
- Consultas SQL básicas
- JOIN y GROUP BY
- JDBC
- PreparedStatement
- ResultSet
- Integración entre Java y MySQL

---

# Cómo Ejecutar los Scripts SQL

1. Abrir MySQL Workbench.
2. Crear una nueva conexión.
3. Ejecutar el archivo de creación de base de datos.
4. Ejecutar el archivo de inserción de datos.
5. Ejecutar las consultas de prueba.

---

# Cómo Ejecutar el Proyecto Java

1. Abrir el proyecto en IntelliJ IDEA.
2. Agregar el conector MySQL JDBC al proyecto.
3. Configurar usuario y contraseña de MySQL.
4. Ejecutar la clase `ConexionBD`.
5. Ejecutar la clase `SistemaPedidos`.

---

# Repositorio GitHub

El proyecto completo incluye:

- Scripts SQL.
- Código fuente Java.
- Capturas de evidencia.
- Memoria PDF.
- Documentación del proyecto.

---

# Licencia

Proyecto realizado con fines educativos y de aprendizaje sobre bases de datos SQL y conexión entre Java y MySQL mediante JDBC.
