package com.api.biblioteca.domain.livro;

import com.api.biblioteca.dto.livro.LivroDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface LivroServiceBase {

    ResponseEntity<Object> adicionarUmLivro(@RequestBody LivroDto livroNovoDto);
    List<Livro> listarLivros();

    ResponseEntity<Object> buscarPorId(@PathVariable Long id);

    ResponseEntity<Object> atualizarLivro(Long id, LivroDto livroDto);

}
