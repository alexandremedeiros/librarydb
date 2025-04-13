package io.github.alexandremedeiros.libraryapi.model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(name = "isbn", nullable = false)
	private String isbn;
	
	@Column(name = "titulo", nullable = false)
	private String titulo;
	
	@Column(name = "data_publicacao", nullable = false)
	private LocalDate dataPublicacao;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "genero", nullable = false)
	private GeneroLivro genero;
	
	@Column(name = "preco", precision = 18, scale = 2)
	private Double preco;
	
	@ManyToOne
	@JoinColumn(name = "id_autor")
	private Autor autor;
	
	
	public Livro() {
	}
	

	public Livro(UUID id, String isbn, String titulo, LocalDate dataPublicacao, GeneroLivro genero, Double preco,
			Autor autor) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.dataPublicacao = dataPublicacao;
		this.genero = genero;
		this.preco = preco;
		this.autor = autor;
	}



	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public GeneroLivro getGenero() {
		return genero;
	}

	public void setGenero(GeneroLivro genero) {
		this.genero = genero;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", isbn=" + isbn + ", titulo=" + titulo + ", dataPublicacao=" + dataPublicacao
				+ ", genero=" + genero + ", preco=" + preco + ", autor=" + autor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
