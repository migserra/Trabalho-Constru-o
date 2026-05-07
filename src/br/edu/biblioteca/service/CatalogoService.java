package br.edu.biblioteca.service;

import br.edu.biblioteca.model.Livro;
import br.edu.biblioteca.structures.Vetor;

public class CatalogoService {

    private Vetor<Livro> livros = new Vetor<>(100);

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public Livro buscar(int index) {
        return livros.get(index);
    }

    public void listar() {

        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i).getTitulo());
        }
    }
}
