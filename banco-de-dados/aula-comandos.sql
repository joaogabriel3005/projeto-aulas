CREATE DATABASE tidev2b;
CREATE DATABASE tidevsesisenai;
USE tidev2b;
USE tidevsesisenai;
DROP DATABASE tidevsesisenai;
DROP DATABASE tidev2b;
USE sys;
CREATE TABLE clientes(
id INT,
nome VARCHAR(100),
endereco VARCHAR(150)
);
INSERT INTO clientes VALUES (1, 'ALEX', 'Alumínio, bairro colibri, n129');
INSERT INTO clientes (nome,id) VALUES ('ALEXANDRE', 2);
SELECT * FROM clientes;
SELECT endereco FROM clientes;
CREATE DATABASE senai;
USE senai
CREATE TABLE funcionarios (
id INT,
nome VARCHAR(100),
salario DECIMAL(10,2),
admissao DATE,
sexo ENUM('F', 'M'),
cadastro TIMESTAMP DEFAULT current_timestamp()
);
INSERT INTO funcionarioS VALUE (1,'marcaos', 4496.50,'23/-10-30', 'M', NULL);
SELECT * FROM funcionarios;
INSERT INTO funcionarios (id, nome, admissao) VALUES (2, 'joao', '2023-05-30');

INSERT INTO funcionarioS VALUE (3,'juvenal', 3500.80,'2025/-11-30', 'M');
SELECT * FROM funcionarios;

INSERT INTO funcionarioS VALUE (4,'monise', 3590.70,'2022/-10-30', 'F');
SELECT * FROM funcionarios;

INSERT INTO funcionarioS VALUE (5,'claudia', 3990.50,'2023/-04-10', 'F');
SELECT * FROM funcionarios;

INSERT INTO funcionarioS VALUE (6,'marcela', 3500.80,'23/-10-30', 'F');
SELECT * FROM funcionarios;
