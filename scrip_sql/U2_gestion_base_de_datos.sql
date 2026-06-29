CREATE DATABASE empresa_db;
USE empresa_db;
CREATE TABLE usuarios (
id_usuario INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100),
email VARCHAR(150)
);
CREATE TABLE productos (
id_producto INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100),
precio DECIMAL(10,2)
);
CREATE TABLE pedidos (
id_pedido INT AUTO_INCREMENT PRIMARY KEY,
id_usuario INT,
id_producto INT,
fecha DATE,
FOREIGN KEY (id_usuario)
REFERENCES usuarios(id_usuario),
FOREIGN KEY (id_producto)
REFERENCES productos(id_producto)
);
INSERT INTO usuarios(nombre,email)
VALUES
('Carlos Perez','carlos@gmail.com'),
('Ana Lopez','ana@gmail.com'),
('Luis Mora','luis@gmail.com'),
('María Castro','maria@gmail.com'),
('José Vega','jose@gmail.com');
INSERT INTO productos(nombre,precio)
VALUES
('Teclado',45.99),
('Monitor',180.00),
('Ratón',25.50),
('SSD 1TB',90.00),
('Auriculares',65.00);
INSERT INTO pedidos(id_usuario,id_producto,fecha)
VALUES
(1,1,'2025-01-10'),
(2,2,'2025-01-12'),
(3,3,'2025-01-15'),
(1,4,'2025-01-20'),
(5,5,'2025-01-25');
SELECT * FROM usuarios;
SELECT * FROM productos;
SELECT * FROM pedidos;
SELECT * FROM productos
WHERE precio > 50;
SELECT * FROM productos
WHERE precio < 50;
SELECT * FROM productos
ORDER BY precio DESC;
SELECT * FROM productos
ORDER BY precio ASC;
SELECT * FROM productos;
SELECT pe.id_pedido,
u.nombre,
pe.fecha
FROM pedidos pe
INNER JOIN usuarios u
ON pe.id_usuario=u.id_usuario;
SELECT u.nombre,
p.nombre AS producto,
pe.fecha
FROM pedidos pe
INNER JOIN usuarios u
ON pe.id_usuario=u.id_usuario
INNER JOIN productos p
ON pe.id_producto=p.id_producto;
SELECT u.nombre,
COUNT(*) AS total_pedidos
FROM pedidos pe
INNER JOIN usuarios u
ON pe.id_usuario=u.id_usuario
GROUP BY u.nombre;
SELECT u.nombre,
p.nombre AS producto,
pe.fecha
FROM pedidos pe
INNER JOIN usuarios u
ON pe.id_usuario=u.id_usuario
INNER JOIN productos p
ON pe.id_producto=p.id_producto
WHERE u.nombre='Carlos Perez';