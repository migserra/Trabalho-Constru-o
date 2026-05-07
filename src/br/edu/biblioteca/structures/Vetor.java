package br.edu.biblioteca.structures;

public class Vetor<T> {

    private Object[] elementos;
    private int size;

    public Vetor(int capacidade) {
        elementos = new Object[capacidade];
    }

    public void add(T elemento) {
        elementos[size++] = elemento;
    }

    public T get(int index) {
        return (T) elementos[index];
    }
}
