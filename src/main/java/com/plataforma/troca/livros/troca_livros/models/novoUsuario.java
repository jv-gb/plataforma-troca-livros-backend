package com.plataforma.troca.livros.troca_livros.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class novoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String User;
    private String Password;

    public novoUsuario(String email, String user, String password) {
        this.id = id;
        this.email = email;
        User = user;
        Password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public novoUsuario() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
