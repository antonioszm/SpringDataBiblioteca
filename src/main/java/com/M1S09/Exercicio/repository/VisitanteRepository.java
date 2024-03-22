package com.M1S09.Exercicio.repository;

import com.M1S09.Exercicio.entities.Membro;
import com.M1S09.Exercicio.entities.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Long> {
}
