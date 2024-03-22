package com.M1S09.Exercicio.service;

import com.M1S09.Exercicio.entities.Bibliotecario;
import com.M1S09.Exercicio.entities.Membro;
import com.M1S09.Exercicio.repository.BibliotecarioRepository;
import com.M1S09.Exercicio.repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroService {

    @Autowired
    private MembroRepository repository;

    public List<Membro> listarTodos(){
        return repository.findAll();
    }

    public Membro salvar(Membro membro){
        return repository.save(membro);
    }

    public void removerPorId(Long id){
        repository.deleteById(id);
    }
}
