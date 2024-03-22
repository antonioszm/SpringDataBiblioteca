package com.M1S09.Exercicio.service;

import com.M1S09.Exercicio.entities.Membro;
import com.M1S09.Exercicio.entities.Visitante;
import com.M1S09.Exercicio.repository.MembroRepository;
import com.M1S09.Exercicio.repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteService {

    @Autowired
    private VisitanteRepository repository;

    public List<Visitante> listarTodos(){
        return repository.findAll();
    }

    public Visitante salvar(Visitante visitante){
        return repository.save(visitante);
    }
}
