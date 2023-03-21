package com.api.biblioteca.services;

import com.api.biblioteca.dto.livro.LivroDto;
import com.api.biblioteca.domain.livro.Livro;
import com.api.biblioteca.domain.livro.LivroServiceBase;
import com.api.biblioteca.repository.LivroRepository;
import com.api.biblioteca.utils.mappers.LivroMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class LivroServiceImpl implements LivroServiceBase {

    private final LivroRepository livroRepository;


    public LivroServiceImpl(LivroRepository livroRepository) {
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


    public ResponseEntity<Object> buscarPorId(@PathVariable Long id) {
        Optional <Livro> livroOptional = livroRepository.findById(id);
        if(!livroOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Livro não encontrado");
        }

        return ResponseEntity.status(HttpStatus.OK).body(livroOptional.get());

    }

    public ResponseEntity<Object> atualizarLivro(Long id, LivroDto livroDto) {
        Optional<Livro> livroOptional = livroRepository.findById(id);
        if (!livroOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Livro não encontrado");
        }
        Livro livro = new Livro(
                livroDto.getTituloLivro(),
                livroDto.getClassificacaoLivro(),
                livroDto.getQtdPaginasLivro());
        livro.setId(livroOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(livroRepository.save(livro));
    }


//    @Transactional
//    public ResponseEntity<Object> deletarLivro(@PathVariable Long id) {
//        Optional <Livro> livroOptional = livroRepository.findById(id);
//        if(!livroOptional.isPresent()){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Livro não encontrado");
//        }
//        return ResponseEntity.status(HttpStatus.OK).body(livroRepository.delete(livroOptional.get()));
//    }
}
