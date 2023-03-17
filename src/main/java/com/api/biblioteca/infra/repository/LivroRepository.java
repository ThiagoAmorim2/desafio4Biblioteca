package com.api.biblioteca.infra.repository;

import com.api.biblioteca.aplication.LivroDto;
import com.api.biblioteca.domain.livro.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
