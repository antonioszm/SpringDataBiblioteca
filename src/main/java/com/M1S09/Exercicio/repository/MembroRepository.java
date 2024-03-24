package com.M1S09.Exercicio.repository;

import com.M1S09.Exercicio.entities.Bibliotecario;
import com.M1S09.Exercicio.entities.Membro;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<Membro, Long> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE Membro SET nome = :nome, endereco = :endereco, telefone = :telefone WHERE id = :id", nativeQuery = true)
    int update(@Param("id") Long id,
               @Param("nome") String nome,
               @Param("endereco") String endereco,
               @Param("telefone") String telefone);
}
