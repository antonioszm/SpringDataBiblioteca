package com.M1S09.Exercicio.controller;

import com.M1S09.Exercicio.entities.Bibliotecario;
import com.M1S09.Exercicio.entities.Livro;
import com.M1S09.Exercicio.entities.Membro;
import com.M1S09.Exercicio.service.BibliotecarioService;
import com.M1S09.Exercicio.service.MembroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membro")
public class MembroController {
    @Autowired
    private MembroService service;

    @GetMapping
    public List<Membro> listarTodos(){
        return service.listarTodos();
    }

    @PostMapping
    public Membro salvar(@RequestBody Membro membro){
        return service.salvar(membro);
    }

    @DeleteMapping("/{id}")
    public void removerPorId(@PathVariable Long id){
        service.removerPorId(id);
    }

    @PutMapping
    public int atualizar(@RequestBody Membro membro){
        return service.atualizar(membro);
    }
}
