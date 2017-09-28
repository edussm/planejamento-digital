drop table if exists public.atividade;
drop table if exists public.roteiro;
drop table if exists public.usuario;
drop table if exists public.roteiro_has_atividade;


create table atividade (
	id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
	descricao varchar(500) NOT NULL,
	minutos_necessarios INT
);

create table usuario (
  login VARCHAR(500) PRIMARY KEY NOT NULL,
  nome VARCHAR(200) NOT NULL,
  data_nascimento DATE NULL
);

create table roteiro (
	id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
	nome varchar(45) NOT NULL,
	data_inicio TIMESTAMP,
	data_fim TIMESTAMP,
	usuario_login VARCHAR(500) NOT NULL,
  	FOREIGN KEY (usuario_login)
    REFERENCES public.usuario (login)
);

create table public.roteiro_has_atividade (
  roteiro_id INT NOT NULL,
  atividade_id INT NOT NULL,
  PRIMARY KEY (roteiro_id, atividade_id)
);
