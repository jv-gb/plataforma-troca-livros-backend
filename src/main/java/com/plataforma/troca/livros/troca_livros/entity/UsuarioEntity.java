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
    public void salvarUsuario(long id, String email, String user, String password ) {
        Usuario produto = new Usuario (id, email,user,password);
        usuarioRepository.save(produto);
    }

}
