package br.edu.biblioteca.model;

public class Livro {

    private String isbn;
    private String titulo;
    private int ano;

    public Livro() {
    }

    public Livro(String isbn, String titulo, int ano) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }
}
