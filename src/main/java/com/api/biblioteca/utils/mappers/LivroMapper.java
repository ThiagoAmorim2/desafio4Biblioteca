package com.api.biblioteca.utils.mappers;

import com.api.biblioteca.dto.livro.LivroDto;
import com.api.biblioteca.domain.livro.Livro;

public class LivroMapper {
    public Livro cadastrarLivroDtoParaLivro(LivroDto livroDto){
    Livro livro = new Livro(
            livroDto.getTituloLivro(),
            livroDto.getClassificacaoLivro(),
            livroDto.getQtdPaginasLivro());
    return livro;
    }
    public LivroDto livroParacadastrasLivroDto(Livro livro){
        LivroDto livroDto = new LivroDto(
                livro.getTitulo(),
                livro.getClassificacao(),
                livro.getQtdPaginas());
        return livroDto;
    }
}
