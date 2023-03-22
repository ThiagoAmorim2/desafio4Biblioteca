package com.api.biblioteca.controllers;

import com.api.biblioteca.dto.livro.LivroDto;
import com.api.biblioteca.domain.livro.Livro;
import com.api.biblioteca.services.LivroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/livro")
public class LivroController {

    @Autowired
    private LivroServiceImpl livroServiceImpl;

    public LivroController(LivroServiceImpl livroServiceImpl) {
        this.livroServiceImpl = livroServiceImpl;
    }

    @GetMapping(value = "/buscar-livros")
    public ResponseEntity<List<Livro>> buscarLivros(){
        return ResponseEntity.ok().body(livroServiceImpl.listarLivros());
    }

    @GetMapping(value = "/buscar-livros/{id}")
    public ResponseEntity<Object> buscarPorId(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(livroServiceImpl.buscarPorId(id));
    }

    @PostMapping(value = "/cadastrar-livro")
    public ResponseEntity<Livro> cadastrarLivro(@RequestBody LivroDto livroDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(livroServiceImpl.adicionarUmLivro(livroDto));
    }

    @PutMapping(value = "/atualizar-livro/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable Long id, @RequestBody LivroDto livroDto) throws Exception {
        return ResponseEntity.ok(livroServiceImpl.atualizarLivro(id, livroDto));
    }

    @DeleteMapping(value = "/buscar-livros/{id}")
    public void deletarLivro(@PathVariable Long id){
        livroServiceImpl.deletarLivro(id);
    }
}
