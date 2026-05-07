package br.edu.biblioteca.service;

import br.edu.biblioteca.structures.MinhaPilha;

public class UndoRedoService {

    private MinhaPilha<String> undo = new MinhaPilha<>();
    private MinhaPilha<String> redo = new MinhaPilha<>();

    public void registrarAcao(String acao) {
        undo.push(acao);
    }

    public void desfazer() {

        if (!undo.isEmpty()) {

            String acao = undo.pop();

            redo.push(acao);

            System.out.println("Desfeito: " + acao);
        }
    }

    public void refazer() {

        if (!redo.isEmpty()) {

            String acao = redo.pop();

            undo.push(acao);

            System.out.println("Refeito: " + acao);
        }
    }
}
