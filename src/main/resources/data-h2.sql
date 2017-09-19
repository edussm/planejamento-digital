
--Script para popular tabela de atividades
INSERT INTO atividade (descricao, minutos_necessarios) VALUES ('Correr', 60);
INSERT INTO atividade (descricao, minutos_necessarios) VALUES ('Nadar', 40);

INSERT INTO roteiro (nome, data_inicio, data_fim) VALUES ('Roteiro I', parsedatetime('19-09-2017 19:00:00', 'dd-MM-yyyy hh:mm:ss'), parsedatetime('19-09-2017 21:00:00', 'dd-MM-yyyy hh:mm:ss'));
INSERT INTO roteiro (nome, data_inicio, data_fim) VALUES ('Roteiro II', parsedatetime('19-09-2017 21:00:00', 'dd-MM-yyyy hh:mm:ss'), parsedatetime('19-09-2017 22:00:00', 'dd-MM-yyyy hh:mm:ss'));