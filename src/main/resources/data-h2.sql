
--Script para popular as tabelas
INSERT INTO usuario (login, nome,  data_nascimento) 
VALUES ( 'eduardo', 'Eduardo Souza', parsedatetime('19-09-2017 19:00:00', 'dd-MM-yyyy hh:mm:ss'));

INSERT INTO atividade (descricao, minutos_necessarios) VALUES ('Correr', 60);
INSERT INTO atividade (descricao, minutos_necessarios) VALUES ('Nadar', 40);

INSERT INTO roteiro (nome, data_inicio, data_fim, usuario_login) VALUES ('Roteiro I', parsedatetime('19-09-2017 19:00:00', 'dd-MM-yyyy hh:mm:ss'), parsedatetime('19-09-2017 21:00:00', 'dd-MM-yyyy hh:mm:ss'), 'eduardo');
INSERT INTO roteiro (nome, data_inicio, data_fim, usuario_login) VALUES ('Roteiro II', parsedatetime('19-09-2017 21:00:00', 'dd-MM-yyyy hh:mm:ss'), parsedatetime('19-09-2017 22:00:00', 'dd-MM-yyyy hh:mm:ss'), 'eduardo');

INSERT INTO roteiro_has_atividade (roteiro_id, atividade_id) VALUES (1,1);
INSERT INTO roteiro_has_atividade (roteiro_id, atividade_id) VALUES (1,2);