package br.edu.biblioteca.service;

public class EmprestimoService {

    public void emprestarExemplar() {
        System.out.println("Exemplar emprestado");
    }

    public void devolverExemplar() {
        System.out.println("Exemplar devolvido");
    }

    public void renovar() {
        System.out.println("Empréstimo renovado");
    }

    public double calcularMulta(int dias) {
        return dias * 2.5;
    }
}
