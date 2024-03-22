package com.M1S09.Exercicio.service;

import com.M1S09.Exercicio.entities.Livro;
import com.M1S09.Exercicio.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public List<Livro> listarTodos(){
        return repository.findAll();
    }

    public Livro salvar(Livro livro){
        return repository.save(livro);
    }

    public void removerPorId(Long id){
        repository.deleteById(id);
    }
}
