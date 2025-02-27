package com.plataforma.troca.livros.troca_livros.repository;
import com.plataforma.troca.livros.troca_livros.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository  extends JpaRepository<Livro, Long>{
}
