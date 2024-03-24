package com.M1S09.Exercicio.repository;

import com.M1S09.Exercicio.entities.Emprestimo;
import com.M1S09.Exercicio.entities.Livro;
import com.M1S09.Exercicio.entities.Membro;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE Emprestimo SET data_devolucao = :dataDevolucao, data_emprestimo = :dataEmprestimo, id_livro = :id_livro, id_membro = :id_membro  WHERE id = :id", nativeQuery = true)
    int update(@Param("id") Long id,
               @Param("dataDevolucao") Date dataDevolucao,
               @Param("dataEmprestimo") Date dataEmprestimo,
               @Param("id_livro") Long id_livro,
               @Param("id_membro") Long id_membro);
}
