drop table if exists public.atividade;

create table atividade (
	id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
	descricao varchar(45),
	minutos_necessarios INT
);