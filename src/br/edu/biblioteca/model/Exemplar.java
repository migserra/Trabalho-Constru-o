package br.edu.biblioteca.model;

public class Exemplar {

    public enum Status {
        DISPONIVEL,
        EMPRESTADO,
        RESERVADO,
        INATIVO
    }

    private int id;
    private String isbnLivro;
    private Status status;

}
