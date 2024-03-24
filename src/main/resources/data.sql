INSERT INTO Livro (id, titulo, autor, ano_de_publicacao)
VALUES(1, 'Um estudo em vermelho', 'Árthur Conan Doyle', 1888);

INSERT INTO Membro (id, nome, endereco, telefone)
VALUES(1, 'Antonio', 'Itacoribi', '55+ (48) 991545454');

INSERT INTO Visitantes (id, nome, telefone)
VALUES(1, 'Julia', '55+ (11) 99129313');

INSERT INTO Bibliotecario (id, nome, email, senha)
VALUES(1, 'José', 'jose@email.com.br', 1010101110);

INSERT INTO Emprestimos (id, data_devolucao, data_emprestimo, id_livro, id_membro)
VALUES(1, '2024-03-24', '2024-04-12', 1, 1);


