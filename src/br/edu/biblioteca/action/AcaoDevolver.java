package br.edu.biblioteca.action;

public class AcaoDevolver implements Acao {

    @Override
    public void executar() {
        System.out.println("Livro devolvido");
    }

    @Override
    public void desfazer() {
        System.out.println("Devolução desfeita");
    }

    @Override
    public String descricao() {
        return "Ação de devolução";
    }
}
