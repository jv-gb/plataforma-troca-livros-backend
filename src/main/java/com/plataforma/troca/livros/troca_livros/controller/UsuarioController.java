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

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrarUsuario(@RequestBody Usuario usuario) {
        try {
            Usuario novoUsuario = usuarioEntity.salvarUsuario(usuario.getEmail(), usuario.getUser(), usuario.getPassword());
            return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }
    @PostMapping("/login")
    public ResponseEntity<?> fazerLogin(@RequestBody Usuario usuario) {
        try {
            Usuario usuarioLogado = usuarioEntity.verificarLogin(usuario.getEmail(), usuario.getPassword());
            return ResponseEntity.ok(usuarioLogado);
        } catch (IllegalArgumentException e) {
            e.printStackTrace(); // Adicione isso para ver detalhes no console
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace(); // Adicione isso para capturar erros inesperados
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno no servidor.");
        }
    }

}
