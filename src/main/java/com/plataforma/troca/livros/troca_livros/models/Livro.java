package com.plataforma.troca.livros.troca_livros.models;

import com.plataforma.troca.livros.troca_livros.models.enums.EstadoConservacao;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Livro {
    @Id
    long id;
    String titulo;
    String autor;
    int edicao;
    @Enumerated(EnumType.STRING)
    EstadoConservacao estado;

    public Livro(String titulo, String autor, int edicao, EstadoConservacao estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.estado = estado;
    }


    public Livro() {

    }
}
