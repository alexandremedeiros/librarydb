package io.github.alexandremedeiros.libraryapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.alexandremedeiros.libraryapi.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, UUID> {

}
