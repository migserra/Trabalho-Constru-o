package br.edu.biblioteca.model;

public class Usuario {

    public enum Tipo {
        ALUNO,
        PROFESSOR,
        SERVIDOR
    }

    private int id;
    private String nome;
    private Tipo tipo;
    private String email;

    public Usuario() {
    }

    public Usuario(int id, String nome, Tipo tipo, String email) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getEmail() {
        return email;
    }
}
