package com.api.biblioteca.infra.services;

import com.api.biblioteca.aplication.LivroDto;
import com.api.biblioteca.domain.livro.Livro;
import com.api.biblioteca.domain.livro.RepositorioDeLivros;
import com.api.biblioteca.infra.mappers.LivroMapper;
import com.api.biblioteca.infra.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class LivroService implements RepositorioDeLivros {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @Override
    @Transactional
    public ResponseEntity<Object> adicionarUmLivro(@RequestBody LivroDto livroNovoDto){
            LivroMapper livroMapper = new LivroMapper();
            Livro livroNovo = livroMapper.cadastrarLivroDtoParaLivro(livroNovoDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(livroRepository.save(livroNovo));
    }


    @Override
    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }


}
