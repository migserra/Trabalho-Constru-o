package br.edu.biblioteca.service;

public class ReservaService {

    public void reservarLivro() {
        System.out.println("Livro reservado");
    }

    public void cancelarReserva() {
        System.out.println("Reserva cancelada");
    }

    public void atenderProximaReserva(String isbn) {
        System.out.println("Próxima reserva atendida: " + isbn);
    }
}
