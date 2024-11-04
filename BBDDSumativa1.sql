CREATE TABLE Productos (
producto_id NUMBER PRIMARY KEY,
nombre VARCHAR2(255),
precio NUMBER(10, 2),
categoria VARCHAR2(100)
);
CREATE SEQUENCE producto_seq START WITH 1;



CREATE TABLE Clientes (
cliente_id NUMBER PRIMARY KEY,
nombre VARCHAR2(255),
fecha_registro DATE,
ciudad VARCHAR2(100)
);
CREATE SEQUENCE cliente_seq START WITH 1;



CREATE TABLE Ventas (
venta_id NUMBER PRIMARY KEY,
producto_id NUMBER,
cliente_id NUMBER,
fecha DATE,
cantidad NUMBER,
FOREIGN KEY (producto_id) REFERENCES Productos(producto_id),
FOREIGN KEY (cliente_id) REFERENCES Clientes(cliente_id)
);
CREATE SEQUENCE venta_seq START WITH 1;


BEGIN
INSERT INTO Productos (producto_id, nombre, precio, categoria) VALUES (producto_seq.NEXTVAL,
'Televisor 40"', 400, 'Electrónica');
INSERT INTO Productos (producto_id, nombre, precio, categoria) VALUES (producto_seq.NEXTVAL,
'Laptop Pro 15', 1200, 'Electrónica');
INSERT INTO Productos (producto_id, nombre, precio, categoria) VALUES (producto_seq.NEXTVAL,
'Cafetera', 80, 'Electrodomésticos');
INSERT INTO Productos (producto_id, nombre, precio, categoria) VALUES (producto_seq.NEXTVAL,
'Licuadora', 45, 'Electrodomésticos');
END;


BEGIN
INSERT INTO Clientes (cliente_id, nombre, fecha_registro, ciudad) VALUES (cliente_seq.NEXTVAL,
'Juan Pérez', TO_DATE('2020-01-10', 'YYYY-MM-DD'), 'Madrid');
INSERT INTO Clientes (cliente_id, nombre, fecha_registro, ciudad) VALUES (cliente_seq.NEXTVAL,
'Ana Gómez', TO_DATE('2020-03-15', 'YYYY-MM-DD'), 'Barcelona');
INSERT INTO Clientes (cliente_id, nombre, fecha_registro, ciudad) VALUES (cliente_seq.NEXTVAL,
'Luis Rodríguez', TO_DATE('2022-06-25', 'YYYY-MM-DD'), 'Valencia');
END;


BEGIN
INSERT INTO Ventas (venta_id, producto_id, cliente_id, fecha, cantidad) VALUES (venta_seq.NEXTVAL,
1, 1, TO_DATE('2022-10-05', 'YYYY-MM-DD'), 2);
INSERT INTO Ventas (venta_id, producto_id, cliente_id, fecha, cantidad) VALUES (venta_seq.NEXTVAL,
2, 2, TO_DATE('2022-10-06', 'YYYY-MM-DD'), 1);
INSERT INTO Ventas (venta_id, producto_id, cliente_id, fecha, cantidad) VALUES (venta_seq.NEXTVAL,
3, 1, TO_DATE('2022-11-15', 'YYYY-MM-DD'), 3);
INSERT INTO Ventas (venta_id, producto_id, cliente_id, fecha, cantidad) VALUES (venta_seq.NEXTVAL,
1, 3, TO_DATE('2022-11-25', 'YYYY-MM-DD'), 1);
END;

-- CASO 1: 
-- A)
SELECT categoria, UPPER(nombre) AS nombre_mayus, precio
FROM Productos
ORDER BY precio DESC, categoria; -- Listamos los productos por categoría , y los ordenamos por su precio de mayor a menor. Y UPPER para transformar el nombre del producto a mayúsculas.


-- B)
SELECT EXTRACT(YEAR FROM fecha) AS año,
       EXTRACT(MONTH FROM fecha) AS mes,
       AVG(cantidad) AS promedio_ventas_mensuales
FROM Ventas
GROUP BY EXTRACT(YEAR FROM fecha), EXTRACT(MONTH FROM fecha)
ORDER BY promedio_ventas_mensuales DESC
FETCH FIRST 1 ROWS ONLY; -- Mostramos el mes y año con mayor cantidad de ventas y hacemos un promedio. Además, con FETCH FIRST 1 ROW ONLY, mostramos sólo una consulta, la con mayor número de ventas.


-- C)
SELECT v.cliente_id, 
       CONCAT(CONCAT(UPPER(c.nombre), ' de '), c.ciudad) AS cliente_info,
       SUM(p.precio * v.cantidad) AS total_gasto
FROM Ventas v
JOIN Productos p ON v.producto_id = p.producto_id
JOIN Clientes c ON v.cliente_id = c.cliente_id
WHERE v.fecha >= ADD_MONTHS(SYSDATE, -12)
  AND c.fecha_registro >= ADD_MONTHS(SYSDATE, -12)
GROUP BY v.cliente_id, c.nombre, c.ciudad
ORDER BY total_gasto DESC
FETCH FIRST 1 ROWS ONLY; -- Identificamos al cliente con mayor número de compras. A la vez, establecemos un filtro: Aplican todos los clientes registrados hace menos de un año. 
-- Es debido al filtro de registro menor a un año, que la consulta se devuelve vacía. Ya que el último cliente registrado (Luis Rodriguez) fué hace 2 años.



-- CASO 2:

CREATE TABLE Empleados (
empleado_id NUMBER PRIMARY KEY,
nombre VARCHAR2(255),
departamento VARCHAR2(100),
fecha_contratacion DATE,
salario NUMBER(10, 2)
);
CREATE SEQUENCE empleado_seq START WITH 1

BEGIN
INSERT INTO Empleados (empleado_id, nombre, departamento, fecha_contratacion, salario) VALUES
(empleado_seq.NEXTVAL, 'Carlos Martínez', 'Finanzas', TO_DATE('2010-04-01', 'YYYY-MM-DD'), 3000);
INSERT INTO Empleados (empleado_id, nombre, departamento, fecha_contratacion, salario) VALUES
(empleado_seq.NEXTVAL, 'María López', 'Recursos Humanos', TO_DATE('2012-07-15', 'YYYY-MM-DD'),
2500);
END;

-- A)
SELECT 
    departamento,
    AVG(salario) AS salario_promedio,
    MAX(salario) AS salario_maximo,
    MIN(salario) AS salario_minimo
FROM 
    Empleados
GROUP BY 
    departamento; -- Determinamos salario mínimo, máximo y el promedio, categorizados por Departamento
    
    
-- B)
SELECT 
    departamento,
    MAX(salario) AS salario_maximo
FROM 
    Empleados
GROUP BY 
    departamento; -- Ordenamos los salarios máximos por cada departamento
    
    
-- C)
SELECT 
    empleado_id,
    nombre,
    departamento,
    fecha_contratacion,
    salario,
    FLOOR(MONTHS_BETWEEN(SYSDATE, fecha_contratacion)) AS antiguedad
FROM 
    Empleados
WHERE 
    FLOOR(MONTHS_BETWEEN(SYSDATE, fecha_contratacion)) > 120;  -- Mostramos a los empleados con más de 10 años en la empresa (120 meses)





