package io.github.alexandremedeiros.libraryapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.alexandremedeiros.libraryapi.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, UUID> {

}
