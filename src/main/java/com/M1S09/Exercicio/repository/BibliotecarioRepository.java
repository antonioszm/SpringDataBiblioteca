package com.M1S09.Exercicio.repository;

import com.M1S09.Exercicio.entities.Bibliotecario;
import com.M1S09.Exercicio.entities.Livro;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Long> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE Biblotecario SET nome = :nome, email = :email, senha = :senha WHERE id = :id", nativeQuery = true)
    int update(@Param("id") Long id,
               @Param("nome") String nome,
               @Param("email") String telefone,
               @Param("senha") String senha);
}
