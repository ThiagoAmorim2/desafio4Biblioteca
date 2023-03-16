package com.api.biblioteca.domain.livro;

public class Livro {
    private String titulo;
    private String classificacao;
    private Integer qtdPaginas;


    public Livro(String titulo, String classificacao, Integer qtdPaginas) {
        this.titulo = titulo;
        this.classificacao = classificacao;
        this.qtdPaginas = qtdPaginas;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public String getClassificacao() {
        return this.classificacao;
    }

    public Integer getQtdPaginas() {
        return this.qtdPaginas;
    }

}
