package br.edu.biblioteca;

import br.edu.biblioteca.model.Livro;
import br.edu.biblioteca.model.Usuario;
import br.edu.biblioteca.service.CatalogoService;
import br.edu.biblioteca.service.UsuarioService;

public class Main {

    public static void main(String[] args) {

        // Serviços
        CatalogoService catalogo = new CatalogoService();
        UsuarioService usuarioService = new UsuarioService();

        // Criando livro
        Livro livro1 = new Livro(
                "123456",
                "Java Orientado a Objetos",
                2025
        );

        Livro livro2 = new Livro(
                "789101",
                "Estruturas de Dados",
                2024
        );

        // Cadastrando livros
        catalogo.cadastrarLivro(livro1);
        catalogo.cadastrarLivro(livro2);

        // Criando usuário
        Usuario usuario1 = new Usuario(
                1,
                "Miguel",
                Usuario.Tipo.ALUNO,
                "miguel@email.com"
        );

        // Cadastrando usuário
        usuarioService.cadastrarUsuario(usuario1);

        // Exibindo dados
        System.out.println("=== LIVROS CADASTRADOS ===");
        catalogo.listar();

        System.out.println();

        System.out.println("=== USUÁRIOS CADASTRADOS ===");
        usuarioService.listar();
    }
}
