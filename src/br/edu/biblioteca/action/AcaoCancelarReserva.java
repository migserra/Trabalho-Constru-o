package br.edu.biblioteca.action;

public class AcaoCancelarReserva implements Acao {

    @Override
    public void executar() {
        System.out.println("Reserva cancelada");
    }

    @Override
    public void desfazer() {
        System.out.println("Reserva restaurada");
    }

    @Override
    public String descricao() {
        return "Cancelamento de reserva";
    }
}
