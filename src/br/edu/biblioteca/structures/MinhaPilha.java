package br.edu.biblioteca.structures;

import java.util.Stack;

public class MinhaPilha<T> {

    private Stack<T> pilha = new Stack<>();

    public void push(T item) {
        pilha.push(item);
    }

    public T pop() {
        return pilha.pop();
    }
}
