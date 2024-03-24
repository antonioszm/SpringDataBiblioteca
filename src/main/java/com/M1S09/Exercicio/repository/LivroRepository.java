package com.M1S09.Exercicio.repository;

import com.M1S09.Exercicio.entities.Livro;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE Livro SET titulo = :titulo, autor = :autor, ano_de_publicacao = :anoDePublicacao WHERE id = :id", nativeQuery = true)
    int update(@Param("id") Long id,
                 @Param("anoDePublicacao") int anoDePublicacao,
                 @Param("autor") String autor,
                 @Param("titulo") String titulo);
}
