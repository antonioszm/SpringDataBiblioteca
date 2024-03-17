package com.M1S09.Exercicio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "id_livro", nullable = false)
    private Livro id_livro;
    @ManyToOne
    @JoinColumn(name = "id_membro", nullable = false)
    private Membro id_membro;
    private Date dataEmprestimo;
    private Date dataDevolucao;

}
