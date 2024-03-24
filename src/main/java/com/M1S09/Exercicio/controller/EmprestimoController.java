package com.M1S09.Exercicio.controller;

import com.M1S09.Exercicio.entities.Bibliotecario;
import com.M1S09.Exercicio.entities.Emprestimo;
import com.M1S09.Exercicio.entities.Visitante;
import com.M1S09.Exercicio.service.EmprestimoService;
import com.M1S09.Exercicio.service.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {
    @Autowired
    private EmprestimoService service;

    @GetMapping
    public List<Emprestimo> listarTodos(){
        return service.listarTodos();
    }

    @PostMapping
    public Emprestimo salvar(@RequestBody Emprestimo emprestimo){
        return service.salvar(emprestimo);
    }

    @DeleteMapping("/{id}")
    public void removerPorId(@PathVariable Long id){
        service.removerPorId(id);
    }
    @PutMapping
    public int atualizar(@RequestBody Emprestimo emprestimo){
        return service.atualizar(emprestimo);
    }
}
