create schema biblioteca;

CREATE TABLE Livro(
       id INT PRIMARY KEY,
       titulo VARCHAR(255),
       autor VARCHAR(255),
       ano_de_publicacao INT
);

CREATE TABLE Membro(
       id INT PRIMARY KEY,
       nome VARCHAR(255),
       endereco VARCHAR(255),
       telefone VARCHAR(255)
);

CREATE TABLE Visitante(
       id INT PRIMARY KEY,
       nome VARCHAR(255),
       telefone VARCHAR(255)
);

CREATE TABLE Bibliotecario(
       id INT PRIMARY KEY,
       nome VARCHAR(255),
       email VARCHAR(255),
       senha VARCHAR(255)
);

CREATE TABLE Emprestimo(
       id INT PRIMARY KEY,
       data_devolucao DATE,
       data_emprestimo DATE,
       id_livro INT,
       id_membro INT,
       FOREIGN KEY (id_livro) REFERENCES Livro (id),
       FOREIGN KEY (id_membro) REFERENCES Membros (id)
);