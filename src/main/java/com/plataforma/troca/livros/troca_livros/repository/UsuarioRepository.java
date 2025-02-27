package com.plataforma.troca.livros.troca_livros.repository;

import com.plataforma.troca.livros.troca_livros.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
