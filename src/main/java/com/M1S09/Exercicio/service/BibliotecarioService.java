package com.M1S09.Exercicio.service;

import com.M1S09.Exercicio.entities.Bibliotecario;
import com.M1S09.Exercicio.entities.Livro;
import com.M1S09.Exercicio.entities.Membro;
import com.M1S09.Exercicio.repository.BibliotecarioRepository;
import com.M1S09.Exercicio.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecarioService {

    @Autowired
    private BibliotecarioRepository repository;

    public List<Bibliotecario> listarTodos(){
        return repository.findAll();
    }

    public Bibliotecario salvar(Bibliotecario bibliotecario){
        return repository.save(bibliotecario);
    }

    public void removerPorId(Long id){
        repository.deleteById(id);
    }

    public int atualizar(Bibliotecario bibliotecario){
        return repository.update(bibliotecario.getId(), bibliotecario.getNome(), bibliotecario.getEmail(), bibliotecario.getSenha());
    }
}
