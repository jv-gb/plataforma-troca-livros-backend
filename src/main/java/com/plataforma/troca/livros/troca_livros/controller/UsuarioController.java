package com.plataforma.troca.livros.troca_livros.controller;

import com.plataforma.troca.livros.troca_livros.entity.UsuarioEntity;
import com.plataforma.troca.livros.troca_livros.models.Usuario;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UsuarioController {


    private final UsuarioEntity usuarioEntity;

    public UsuarioController(UsuarioEntity usuarioEntity) {

        this.usuarioEntity = usuarioEntity;
    }

    @PostMapping
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {

        usuarioEntity.salvarUsuario(usuario.getId(), usuario.getEmail(), usuario.getUser(), usuario.getPassword());
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);


    }


}
