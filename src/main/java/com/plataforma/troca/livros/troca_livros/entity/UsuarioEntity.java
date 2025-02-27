package com.plataforma.troca.livros.troca_livros.entity;

import com.plataforma.troca.livros.troca_livros.models.novoUsuario;
import com.plataforma.troca.livros.troca_livros.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioEntity {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Transactional
    public novoUsuario salvarUsuario(String email, String user, String password ) {
        novoUsuario produto = new novoUsuario(email,user,password);
        usuarioRepository.save(produto);

        return produto;
    }

}
