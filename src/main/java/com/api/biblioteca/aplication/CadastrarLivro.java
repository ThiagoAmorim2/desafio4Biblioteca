//package com.api.biblioteca.aplication;
//
//import com.api.biblioteca.domain.livro.Livro;
//import com.api.biblioteca.domain.livro.RepositorioDeLivros;
//import com.api.biblioteca.infra.services.LivroService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class CadastrarLivro {
//
//    private LivroService livroService;
//
//    public Livro executar(LivroDto livroDto){
//        Livro novoLivro = livroDto.criarLivro();
//        return livroService.adicionarUmLivro(novoLivro);
//    }
//}
