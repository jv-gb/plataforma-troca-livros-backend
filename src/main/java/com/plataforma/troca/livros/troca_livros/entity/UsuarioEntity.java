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

       if (usuarioRepository.findByEmail(email) != null || usuarioRepository.findByUser(user) != null) {
            throw new IllegalArgumentException("Usuário ou e-mail já cadastrado.");
        }

        Usuario usuario = new Usuario(email,user,password);
        usuarioRepository.save(usuario);

        return usuario;
    }

    public Usuario verificarLogin(String email, String password) {
        Usuario usuario = usuarioRepository.findByEmail(email);

        if (usuario == null || !usuario.getPassword().equals(password)) {
            throw new IllegalArgumentException("E-mail ou senha incorretos.");
        }

        return usuario;
    }


}
