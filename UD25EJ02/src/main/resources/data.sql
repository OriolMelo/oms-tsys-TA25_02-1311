drop table if exists departamentos;

CREATE TABLE departamentos (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre varchar(255) NOT NULL,
  presupuesto decimal(10,0) NOT NULL,
  PRIMARY KEY (codigo)
);

drop table if exists empleados;

CREATE TABLE empleados (
  dni int NOT NULL,
  nombre varchar(255) NOT NULL,
  apellidos varchar(255) NOT NULL,
  departamento int NOT NULL,
  PRIMARY KEY (dni),
  FOREIGN KEY (departamento) REFERENCES departamentos (codigo)
);

INSERT INTO departamentos (nombre, presupuesto) VALUES ('IT',65000),('Accounting',15000),
('Human Resources',240000),('Research',55000);

INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES 
(123234877,'Michael','Rogers',1),
(152934485,'Anand','Manikutty',1),(222364883,'Carol','Smith',2),
(326587417,'Joe','Stevens',3),(332154719,'Mary-Anne','Foster',1),
(332569843,'George','Donnell',4),(546523478,'John','Doe',3),
(631231482,'David','Smith',4),(654873219,'Zacary','Efron',3),
(745685214,'Eric','Goldsmith',3),(845657233,'Luis','López',1),
(845657245,'Elizabeth','Doe',1),(845657246,'Kumar','Swamy',1),
(845657266,'Jose','Pérez',4);