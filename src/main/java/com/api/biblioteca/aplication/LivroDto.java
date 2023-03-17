package com.api.biblioteca.aplication;

import com.api.biblioteca.domain.livro.Livro;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LivroDto {
    @JsonProperty(value = "titulo")
    private String tituloLivro;
    @JsonProperty(value = "classificacao")
    private String classificacaoLivro;
    @JsonProperty(value = "qtdPaginas")
    private Integer qtdPaginasLivro;

    public LivroDto(String tituloLivro, String classificacaoLivro, Integer qtdPaginasLivro) {
        this.tituloLivro = tituloLivro;
        this.classificacaoLivro = classificacaoLivro;
        this.qtdPaginasLivro = qtdPaginasLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public String getClassificacaoLivro() {
        return classificacaoLivro;
    }

    public Integer getQtdPaginasLivro() {
        return qtdPaginasLivro;
    }

//    public Livro criarLivro() {
//        return new Livro(tituloLivro, classificacaoLivro, qtdPaginasLivro);
//    }

}

