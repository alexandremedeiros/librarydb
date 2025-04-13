package io.github.alexandremedeiros.libraryapi.repository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.github.alexandremedeiros.libraryapi.model.Autor;

@SpringBootTest
public class AutorRepositoryTest {
	
	@Autowired
	private AutorRepository repository;

	@Test
	public void salvarTest() {
		Autor autor = new Autor();
		autor.setNome("Zé");
		autor.setNacionalidade("Brasileira");
		autor.setDataNascimento(LocalDate.of(1950, 3, 20));
		
		repository.save(autor);
	}
	
	
	@Test
	public void atualizarTest() {
		var id = UUID.fromString("70f6a0e9-8b6d-4e0b-804b-62338b9d9716");
		
		Optional<Autor> autorPresente = repository.findById(id);
		
		if (autorPresente.isPresent()) {
			Autor autorEncontrado = autorPresente.get();
			autorEncontrado.setNome("Zé Alteradooooo....");
			repository.save(autorEncontrado);
		}
	}

}
