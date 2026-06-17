package br.edu.biblioteca.action;

public class AcaoReservar implements Acao {

    @Override
    public void executar() {
        System.out.println("Reserva realizada");
    }

    @Override
    public void desfazer() {
        System.out.println("Reserva cancelada");
    }

    @Override
    public String descricao() {
        return "Reserva de livro";
    }
}
