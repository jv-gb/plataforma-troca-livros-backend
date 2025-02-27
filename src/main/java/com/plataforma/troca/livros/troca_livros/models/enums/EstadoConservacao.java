package com.plataforma.troca.livros.troca_livros.models.enums;

public enum EstadoConservacao {
    EXCELENTE("Excelente"),
    BOM("Bom"),
    REGULAR("Regular"),
    RUIM("Ruim"),
    DANIFICADO("Danificado");

    final String estado;

     EstadoConservacao(String estado) {
        this.estado = estado;
    }

    public String getDescricao() {
        return estado;
    }

}