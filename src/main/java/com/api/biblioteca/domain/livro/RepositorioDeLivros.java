package com.api.biblioteca.domain.livro;

import com.api.biblioteca.aplication.LivroDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RepositorioDeLivros {

    ResponseEntity<Object> adicionarUmLivro(@RequestBody LivroDto livroNovoDto);
    List<Livro> listarLivros();

//    boolean existsByLivro(String titulo);

}
