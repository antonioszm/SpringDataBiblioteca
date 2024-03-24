package com.M1S09.Exercicio.repository;

import com.M1S09.Exercicio.entities.Membro;
import com.M1S09.Exercicio.entities.Visitante;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Long> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE Visitante SET nome = :nome, telefone = :telefone WHERE id = :id", nativeQuery = true)
    int update(@Param("id") Long id,
               @Param("nome") String nome,
               @Param("telefone") String telefone);
}
