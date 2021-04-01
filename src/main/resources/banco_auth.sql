create table usuario(
	codigo serial primary key,
	nome varchar(50),
	email varchar(50),
	senha varchar(20)
);

insert into usuario (nome, email, senha) values('Danilo','a@a.com','123123');
insert into usuario (nome, email, senha) values('Ryan','r@r.com','321321');