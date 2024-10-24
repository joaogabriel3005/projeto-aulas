create database escola1;
use escola1;
create table Alunos(
 Id_aluno INT,
 Nome Varchar(100),
 Dtdnasc DATE,
 sexo ENUM ('F','M'),
 Endereco VARCHAR(150),
 cidade varchar(100),
 bairro varchar(80),
 estado varchar(2),
 cpf char(11),
 Email varchar(200),
 telefone char(11)
);
insert into Alunos values(4458, 'Joao Gabriel Santos Martinez', '2008-05-30', 'M', 'Rua Francisco Balbino Da Silva N129', 'Aluminio', 'Figueiras', 'SP', 50491514816, 'martinez.jgsantos30@gmail.com', 11939021745);
insert into Alunos values(4459, 'Julio Henrique Silva Sabbi', '2008-03-01', 'M', 'Rua Amazonas N92', 'Aluminio', 'Jardim Progresso', 'SP', 50491514816, 'juliohenriquesilvasabbi@gmail.com', 11956978428);
insert into Alunos values(4422, 'Thiago Ferreira do Nascimento', '2007-09-10', 'M', 'Rua Pernambuco N35', 'Joao Pessoa', 'Pedagio', 'SP', 47486273890, 'thifer331@gmail.com', 11954731022);
insert into Alunos values(4973, 'Breno Hergesel Rodrigues', '2007-11-21', 'M', 'Avenida Theodomiro Carneiro Santiago, N131', 'Sorocaba', 'Vila Industrial', 'SP', 47480928823, 'breno.hergeselr@gmail.com', 11964918213);
INSERT INTO Alunos VALUES ( 123, 'Riki jose nunes de arruda', '2008-05-30', 'm', 'rua pocos de caldas', ' paraiso', 'aluminio',
 'SP', 54457067881, 'riki1arruda@gmail.com', 11963078678);
 select*from alunos where sexo = 'F';
UPDATE Alunos SET cidade = 'malasia' Where sexo = 'M';