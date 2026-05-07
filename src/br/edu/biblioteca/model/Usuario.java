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

}
