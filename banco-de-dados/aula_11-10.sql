create database clinica;
use clinica;

create table Cidades(
id int primary key not null auto_increment,
nome varchar (70) not null,
estado enum('SP', 'RJ', 'RS', 'MG', 'ES', 'BA', 'MS', 'MT', 'GO', 'PR', 'SC'));

create table PlanoSaude(
id int primary key not null auto_increment,
nome varchar (70) not null);

create table Alergia(
id int primary key not null auto_increment,
nome varchar(50));

create table Paciente(
id int primary key not null auto_increment,
nome varchar(100) not null,
cpf char(14) not null unique,
data_nascimento date not null,
endereco varchar(120) not null,
telefone varchar (20),
sexo enum('F', 'M'),
idCidade int not null,
idPlanoSaude int not null,
idAlergia int not null,
foreign key (idCidade) references Municipios (id),
foreign key (idPlanoSaude) references PlanoSaude(id),
foreign key (idAlergia) references Alergia(id));

alter table Paciente
	add column Email varchar(100);
    
    alter table Paciente
    drop column telefone;
    
    alter table Paciente
    modify column endereco varchar(150) not null;
    
    alter table Paciente
    rename column Data_nascimento to Datanascimento;
    
    create table Especialidade (
    id int primary key not null auto_increment,
    NomeEspecialidade varchar(50) not null);
    
    alter table Paciente 
    add column idEspecialidade int not null,
add constraint paciente_ibfk4 foreign key(idEspecialidade) references Especialidade(id);

show create table Paciente;

alter table Paciente
drop foreign key paciente_ibfk_2;

INSERT INTO Alergia (Nome) VALUES
	('Camarão'),
    ('Amendoim'),
    ('Chocolate'),
    ('Peixe'),
    ('Farinha Branca'),
    ('Nozes'),
    ('Poeira'),
    ('Gato'),
    ('Cachorro');
    
    select * from Alergia;
    
    truncate table Alergia;
    
    delete from Alergia;
    alter table Alergia auto_increment = 1;
    
    
    alter table ALERGIA
    auto_increment = 1;
    
    alter table Cidades
    rename Municipios;
    
    alter table Paciente
    add column CEP char(9);
    
     alter table Paciente
    modify column CEP char(9) not null;
    
    alter table Paciente 
		add column DataCadastro datetime default current_timestamp();
    
    INSERT INTO Municipios (Nome, Estado)
VALUES
    ('São Paulo', 'SP'),
    ('Rio de Janeiro', 'RJ'),
    ('Belo Horizonte', 'MG'),
    ('Vitória', 'ES'),
    ('Salvador', 'BA'),
    ('Florianópolis', 'SC'),
    ('Porto Alegre', 'RS'),
    ('Campinas', 'SP'),
    ('Niterói', 'RJ'),
    ('Belo Horizonte', 'MG'),
    ('Santos', 'SP'),
    ('Curitiba', 'ES'),
    ('Guarulhos', 'SP'),
    ('São Gonçalo', 'RJ'),
    ('Contagem', 'MG'),
    ('Serra', 'ES'),
    ('Feira de Santana', 'BA'),
    ('Joinville', 'SC'),
    ('Caxias do Sul', 'RS'),
    ('Osasco', 'SP');
    
    select * from Municipios;
     select * from Alergia;
      select * from Especialidade;
       select * from PlanoSaude;
        select * from Paciente;
        
        INSERT INTO PlanoSaude (Nome) VALUES
	('Unimed'),
    ('Amil'),
    ('Bradesco saúde'),
    ('Particular'),
    ('Albert Einstein');
    
   INSERT INTO Paciente (nome, cpf,Data_nascimento, endereco, telefone, sexo, idCidade, idPlanoSaude, idAlergia) VALUES
('Ana Maria', '123.456.789-00', '1985-06-15', 'Rua das Flores, 123', '(11) 99999-0000', 'F', 1, 2, 3),
('Bruno Silva', '234.567.890-11', '1990-11-23', 'Avenida Central, 45', '(21) 98888-1111', 'M', 2, 3, 4),
('Carla Souza', '345.678.901-22', '1978-03-08', 'Travessa do Bosque, 89', '(31) 97777-2222', 'F', 3, 4, 5),
('Daniel Ferreira', '456.789.012-33', '2000-09-17', 'Rua Ametista, 21', '(41) 96666-3333', 'M', 4, 5, 6),
('Elaine Costa', '567.890.123-44', '1982-01-30', 'Rua das Acácias, 72', '(71) 95555-4444', 'F', 5, 1, 7),
('Felipe Ramos', '678.901.234-55', '1995-05-20', 'Rua do Sol, 11', '(48) 94444-5555', 'M', 6, 2, 8),
('Gabriela Torres', '789.012.345-66', '1989-08-11', 'Rua do Campo, 47', '(51) 93333-6666', 'F', 7, 3, 9),
('Henrique Lima', '890.123.456-77', '1993-12-05', 'Avenida das Palmeiras, 95', '(27) 92222-7777', 'M', 8, 4, 1),
('Isabela Araújo', '901.234.567-88', '1987-04-13', 'Rua do Parque, 56', '(71) 91111-8888', 'F', 9, 5, 2),
('Jorge Almeida', '012.345.678-99', '1991-10-28', 'Rua Rio Branco, 87', '(11) 90000-9999', 'M', 10, 1, 3),
('Karen Santos', '123.456.789-10', '1986-07-25', 'Rua das Magnólias, 13', '(21) 98888-1010', 'F', 11, 2, 4),
('Leonardo Costa', '234.567.890-21', '1994-03-03', 'Avenida das Pedras, 45', '(31) 97777-1111', 'M', 12, 3, 5),
('Mariana Vieira', '345.678.901-32', '1998-02-14', 'Rua Flor de Lis, 62', '(41) 96666-1212', 'F', 13, 4, 6),
('Nelson Barros', '456.789.012-43', '1977-11-11', 'Rua da Lua, 27', '(71) 95555-1313', 'M', 14, 5, 7),
('Olivia Xavier', '567.890.123-54', '1992-06-19', 'Avenida do Sol, 34', '(48) 94444-1414', 'F', 15, 1, 8),
('Pedro Neves', '678.901.234-65', '1981-05-21', 'Rua Esperança, 78', '(51) 93333-1515', 'M', 16, 2, 9),
('Quitéria Alves', '789.012.345-76', '1988-09-29', 'Avenida Primavera, 19', '(27) 92222-1616', 'F', 17, 3, 1),
('Ricardo Gomes', '890.123.456-87', '1997-12-08', 'Rua Santa Luzia, 44', '(71) 91111-1717', 'M', 18, 4, 2),
('Sabrina Moura', '901.234.567-98', '1984-03-23', 'Rua das Amendoeiras, 51', '(11) 90000-1818', 'F', 19, 5, 3),
('Thiago Duarte', '012.345.678-09', '1999-08-30', 'Avenida Atlântica, 31', '(21) 98888-1919', 'M', 20, 1, 4),
('Ursula Pires', '123.456.789-01', '1996-04-04', 'Rua São João, 87', '(31) 97777-2020', 'F', 1, 2, 5),
('Vicente Rocha', '234.567.890-12', '1993-07-15', 'Rua Boa Vista, 45', '(41) 96666-2121', 'M', 2, 3, 6),
('Wanda Oliveira', '345.678.901-23', '1985-10-10', 'Rua dos Girassóis, 34', '(71) 95555-2222', 'F', 3, 4, 7),
('Xavier Lopes', '456.789.012-34', '1983-09-21', 'Avenida do Oceano, 56', '(48) 94444-2323', 'M', 4, 5, 8),
('Yasmin Souza', '567.890.123-45', '1994-05-05', 'Rua da Paz, 71', '(51) 93333-2424', 'F', 5, 1, 9),
('Zeca Ferreira', '678.901.234-56', '1986-02-18', 'Avenida Central, 89', '(27) 92222-2525', 'M', 6, 2, 1),
('Amanda Silva', '789.012.345-67', '1992-12-13', 'Rua Independência, 42', '(71) 91111-2626', 'F', 7, 3, 2),
('Brenda Luz', '890.123.456-78', '1987-08-20', 'Rua Principal, 54', '(11) 90000-2727', 'F', 8, 4, 3),
('Carlos Prado', '901.234.567-89', '1979-11-11', 'Avenida Flores, 36', '(21) 98888-2828', 'M', 9, 5, 4);

drop table Paciente;

describe Paciente;
select * from Alergia;
select * from Paciente;

    
    select
		p.nome as Paciente,
        p.Data_nascimento as Datanascimento,
        p.sexo,
        m.nome as cidade,
        ps.nome as PlanoSaude,
        a.nome as Alergia
        from Paciente p
        join Municipios m on p.idCidade = m.id
        join PlanoSaude ps on p.idPlanoSaude = ps.id
        join Alergia a on p.idAlergia = a.id;