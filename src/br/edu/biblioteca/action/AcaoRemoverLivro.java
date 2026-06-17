package br.edu.biblioteca.action;

public class AcaoRemoverLivro implements Acao {

    @Override
    public void executar() {
        System.out.println("Livro removido");
    }

    @Override
    public void desfazer() {
        System.out.println("Livro restaurado");
    }

    @Override
    public String descricao() {
        return "Remoção de livro";
    }
}
