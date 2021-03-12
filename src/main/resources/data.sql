insert into Aluno (id, nome, curso, telefone) values (1, 'Felipe', 'Gama Academia', '99999-9999');
insert into Aluno (id, nome, curso, telefone) values (2,'Laís', 'Gama Academia', '12345-7890');
insert into Aluno (id, nome, curso, telefone) values (3,'Lucas', 'Accenture', '98765-1234');
insert into Aluno (id, nome, curso, telefone) values (4,'Gislaine', 'Alura', '99999-9999');
insert into Aluno (id, nome, curso, telefone) values (5,'Maria', 'Accenture', '99999-9999');
insert into Aluno (id, nome, curso, telefone) values (6,'José', 'Dev Media', '99999-9999');
insert into Aluno (id, nome, curso, telefone) values (7,'Luana', 'CodeAcademy', '99999-9999');
insert into Aluno (id, nome, curso, telefone) values (8,'Diego', 'Coursera', '99999-9999');
insert into Aluno (id, nome, curso, telefone) values (9,'Antônia', 'Gama Academia', '99999-9999');
insert into Aluno (id, nome, curso, telefone) values (10,'João', 'Gama Academia', '99999-9999');

insert into Endereco (id,cep, cidade, numero, rua, uf) values (1, '12345-123', 'Rio de Janeiro', '12345', 'Rua dos amigos', 'SP');
insert into Endereco (id,cep, cidade, numero, rua, uf) values (2, '12345-123', 'Rio de Janeiro', '12345', 'Rua dos amigos', 'SP');
insert into Endereco (id,cep, cidade, numero, rua, uf) values (3, '12345-123', 'Rio de Janeiro', '12345', 'Rua dos amigos', 'SP');
insert into Endereco (id,cep, cidade, numero, rua, uf) values (4, '12345-123', 'Rio de Janeiro', '12345', 'Rua dos amigos', 'SP');
insert into Endereco (id,cep, cidade, numero, rua, uf) values (5, '12345-123', 'Rio de Janeiro', '12345', 'Rua dos amigos', 'SP');
insert into Endereco (id,cep, cidade, numero, rua, uf) values (6, '12345-123', 'Rio de Janeiro', '12345', 'Rua dos amigos', 'SP');
insert into Endereco (id,cep, cidade, numero, rua, uf) values (7, '12345-123', 'Rio de Janeiro', '12345', 'Rua dos amigos', 'SP');
insert into Endereco (id,cep, cidade, numero, rua, uf) values (8, '12345-123', 'Rio de Janeiro', '12345', 'Rua dos amigos', 'SP');
insert into Endereco (id,cep, cidade, numero, rua, uf) values (9, '12345-123', 'Rio de Janeiro', '12345', 'Rua dos amigos', 'SP');
insert into Endereco (id,cep, cidade, numero, rua, uf) values (10, '12345-123', 'Rio de Janeiro', '12345', 'Rua dos amigos', 'SP');



insert into disciplina(id, conceito, media, nome, nota1, nota2, nota_apresentacao, nota_trabalho) values(1, 'A', '7', 'legal', 7.0, 10.0, 6.5, 4.3);
insert into disciplina(id, conceito, media, nome, nota1, nota2, nota_apresentacao, nota_trabalho) values(2, 'A', '7', 'legal', 7.0, 10.0, 6.5, 4.3);
insert into disciplina(id, conceito, media, nome, nota1, nota2, nota_apresentacao, nota_trabalho) values(3, 'B', '7', 'legal', 7.0, 10.0, 6.5, 4.3);
insert into disciplina(id, conceito, media, nome, nota1, nota2, nota_apresentacao, nota_trabalho) values(4, 'C', '7', 'legal', 7.0, 10.0, 6.5, 4.3);
insert into disciplina(id, conceito, media, nome, nota1, nota2, nota_apresentacao, nota_trabalho) values(5, 'A', '7', 'CHATA', 7.0, 10.0, 6.5, 4.3);
insert into disciplina(id, conceito, media, nome, nota1, nota2, nota_apresentacao, nota_trabalho) values(6, 'D', '7', 'CHATA', 7.0, 10.0, 6.5, 4.3);
insert into disciplina(id, conceito, media, nome, nota1, nota2, nota_apresentacao, nota_trabalho) values(7, 'F', '7', 'CHATA', 7.0, 10.0, 6.5, 4.3);
insert into disciplina(id, conceito, media, nome, nota1, nota2, nota_apresentacao, nota_trabalho) values(8, 'C', '7', 'CHATA', 7.0, 10.0, 6.5, 4.3);
insert into disciplina(id, conceito, media, nome, nota1, nota2, nota_apresentacao, nota_trabalho) values(9, 'B', '7', 'CHATA', 7.0, 10.0, 6.5, 4.3);
insert into disciplina(id, conceito, media, nome, nota1, nota2, nota_apresentacao, nota_trabalho) values(10, 'F', '7', 'CHATA', 7.0, 10.0, 6.5, 4.3);



insert into aluno_disciplinas(aluno_id, disciplinas_id) values (1,1);
insert into aluno_disciplinas(aluno_id, disciplinas_id) values (2,2);
insert into aluno_disciplinas(aluno_id, disciplinas_id) values (3,3);
insert into aluno_disciplinas(aluno_id, disciplinas_id) values (4,4);
insert into aluno_disciplinas(aluno_id, disciplinas_id) values (5,5);
insert into aluno_disciplinas(aluno_id, disciplinas_id) values (6,6);
insert into aluno_disciplinas(aluno_id, disciplinas_id) values (7,7);
insert into aluno_disciplinas(aluno_id, disciplinas_id) values (8,8);
insert into aluno_disciplinas(aluno_id, disciplinas_id) values (9,9);
insert into aluno_disciplinas(aluno_id, disciplinas_id) values (10,10);

insert into aluno_enderecos(aluno_id, enderecos_id) values (1,1);
insert into aluno_enderecos(aluno_id, enderecos_id) values (2,2);
insert into aluno_enderecos(aluno_id, enderecos_id) values (3,3);
insert into aluno_enderecos(aluno_id, enderecos_id) values (4,4);
insert into aluno_enderecos(aluno_id, enderecos_id) values (5,5);
insert into aluno_enderecos(aluno_id, enderecos_id) values (6,6);
insert into aluno_enderecos(aluno_id, enderecos_id) values (7,7);
insert into aluno_enderecos(aluno_id, enderecos_id) values (8,8);
insert into aluno_enderecos(aluno_id, enderecos_id) values (9,9);
insert into aluno_enderecos(aluno_id, enderecos_id) values (10,10);

