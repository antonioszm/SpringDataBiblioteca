package com.M1S09.Exercicio.service;

import com.M1S09.Exercicio.entities.Emprestimo;
import com.M1S09.Exercicio.entities.Visitante;
import com.M1S09.Exercicio.repository.EmprestimoRepository;
import com.M1S09.Exercicio.repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository repository;

    public List<Emprestimo> listarTodos(){
        return repository.findAll();
    }

    public Emprestimo salvar(Emprestimo emprestimo){
        return repository.save(emprestimo);
    }

    public void removerPorId(Long id){
        repository.deleteById(id);
    }
}
