package com.M1S09.Exercicio.controller;

import com.M1S09.Exercicio.entities.Bibliotecario;
import com.M1S09.Exercicio.entities.Livro;
import com.M1S09.Exercicio.service.BibliotecarioService;
import com.M1S09.Exercicio.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecario")
public class BibliotecarioController {
    @Autowired
    private BibliotecarioService service;

    @GetMapping
    public List<Bibliotecario> listarTodos(){
        return service.listarTodos();
    }

    @PostMapping
    public Bibliotecario salvar(@RequestBody Bibliotecario bibliotecario){
        return service.salvar(bibliotecario);
    }
}
