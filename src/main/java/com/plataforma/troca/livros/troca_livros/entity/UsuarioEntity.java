package com.plataforma.troca.livros.troca_livros.entity;

import com.plataforma.troca.livros.troca_livros.models.Usuario;
import com.plataforma.troca.livros.troca_livros.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioEntity {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Transactional
    public Usuario salvarUsuario(String email, String user, String password ) {
        Usuario usuario = new Usuario(email,user,password);
        usuarioRepository.save(usuario);

        return usuario;
    }

}
