package com.api.biblioteca.controllers;

import com.api.biblioteca.aplication.LivroDto;
import com.api.biblioteca.domain.livro.Livro;
import com.api.biblioteca.domain.livro.RepositorioDeLivros;
import com.api.biblioteca.infra.services.LivroService;
import com.api.biblioteca.infra.mappers.LivroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/livro")
public class LivroController {

    @Autowired
    private LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping(value = "/buscarlivros")
    public String buscarLivros(){
        return "Bateu aqui";
    }

    @PostMapping(value = "/cadastrar-livro")
    public void cadastrarLivro(@RequestBody LivroDto livroDto){
        LivroMapper livroMapper = new LivroMapper();
        Livro livro = livroMapper.cadastrarLivroDtoParaLivro(livroDto);
        livroService.adicionarUmLivro(livro);
    }
}
