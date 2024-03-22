package com.M1S09.Exercicio.controller;

import com.M1S09.Exercicio.entities.Livro;
import com.M1S09.Exercicio.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {
    @Autowired
    private LivroService service;

    @GetMapping
    public List<Livro> listarTodos(){
        return service.listarTodos();
    }

    @PostMapping
    public Livro salvar(@RequestBody Livro livro){
        return service.salvar(livro);
    }
}
