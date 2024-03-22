package com.M1S09.Exercicio.controller;

import com.M1S09.Exercicio.entities.Membro;
import com.M1S09.Exercicio.entities.Visitante;
import com.M1S09.Exercicio.service.MembroService;
import com.M1S09.Exercicio.service.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitante")
public class VisitanteController {
    @Autowired
    private VisitanteService service;

    @GetMapping
    public List<Visitante> listarTodos(){
        return service.listarTodos();
    }

    @PostMapping
    public Visitante salvar(@RequestBody Visitante visitante){
        return service.salvar(visitante);
    }
}
