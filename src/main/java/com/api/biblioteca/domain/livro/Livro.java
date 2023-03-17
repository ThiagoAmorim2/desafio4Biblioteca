package com.api.biblioteca.domain.livro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Livro implements Serializable {

    private static final long serialversionuid = 1L;
    private String titulo;
    private String classificacao;
    private Integer qtdPaginas;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Livro(String titulo, String classificacao, Integer qtdPaginas) {
        this.titulo = titulo;
        this.classificacao = classificacao;
        this.qtdPaginas = qtdPaginas;
    }

    public Livro() {
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void setQtdPaginas(Integer qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
