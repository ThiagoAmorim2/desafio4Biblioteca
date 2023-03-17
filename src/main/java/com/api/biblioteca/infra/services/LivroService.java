package com.api.biblioteca.infra.services;

import com.api.biblioteca.aplication.LivroDto;
import com.api.biblioteca.domain.livro.Livro;
import com.api.biblioteca.domain.livro.RepositorioDeLivros;
import com.api.biblioteca.infra.mappers.LivroMapper;
import com.api.biblioteca.infra.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LivroService implements RepositorioDeLivros {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @Override
    @Transactional
    public Livro adicionarUmLivro(Livro livroNovo){
        livroRepository.save(livroNovo);
        return livroNovo;
    }

}