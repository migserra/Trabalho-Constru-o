package br.edu.biblioteca.structures;

import java.util.LinkedList;
import java.util.Queue;

public class MinhaFila<T> {

    private Queue<T> fila = new LinkedList<>();

    public void enqueue(T item) {
        fila.add(item);
    }

    public T dequeue() {
        return fila.poll();
    }
}
