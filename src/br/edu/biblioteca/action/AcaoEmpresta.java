package br.edu.biblioteca.action;

public class AcaoEmpresta implements Acao {

    @Override
    public void executar() {
        System.out.println("Empréstimo realizado");
    }

    @Override
    public void desfazer() {
        System.out.println("Empréstimo desfeito");
    }

    @Override
    public String descricao() {
        return "Ação de empréstimo";
    }
}
