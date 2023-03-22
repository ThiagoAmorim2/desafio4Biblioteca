package com.api.biblioteca.domain.livro;

import com.api.biblioteca.dto.livro.LivroDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface LivroServiceBase {

    Livro adicionarUmLivro(@RequestBody LivroDto livroNovoDto);
    List<Livro> listarLivros();

    Livro buscarPorId(@PathVariable Long id) throws Exception;

    Livro atualizarLivro(Long id, LivroDto livroDto) throws Exception;

    void deletarLivro(@PathVariable Long id);

}
