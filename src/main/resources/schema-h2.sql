drop table if exists public.atividade;

create table atividade (
	id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
	descricao varchar(500) NOT NULL,
	minutos_necessarios INT
);

drop table if exists public.roteiro;

create table roteiro (
	id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
	nome varchar(45) NOT NULL,
	data_inicio TIMESTAMP,
	data_fim TIMESTAMP
);