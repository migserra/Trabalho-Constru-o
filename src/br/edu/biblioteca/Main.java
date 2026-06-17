package br.edu.biblioteca;

import br.edu.biblioteca.action.AcaoCadastrarLivro;
import br.edu.biblioteca.action.AcaoEmpresta;
import br.edu.biblioteca.model.Livro;
import br.edu.biblioteca.model.Usuario;
import br.edu.biblioteca.repository.LivroRepository;
import br.edu.biblioteca.service.CatalogoService;
import br.edu.biblioteca.service.UsuarioService;
import br.edu.biblioteca.ui.MenuPrincipal;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE BIBLIOTECA ===\n");

        // TESTE UI
        MenuPrincipal menu = new MenuPrincipal();
        menu.exibir();

        System.out.println();

        // TESTE MODEL + SERVICE
        CatalogoService catalogo = new CatalogoService();

        Livro livro1 = new Livro(
                "123456",
                "Java Básico",
                2025
        );

        Livro livro2 = new Livro(
                "654321",
                "Estruturas de Dados",
                2024
        );

        catalogo.cadastrarLivro(livro1);
        catalogo.cadastrarLivro(livro2);

        System.out.println("\n=== LIVROS CADASTRADOS ===");
        catalogo.listar();

        System.out.println();

        UsuarioService usuarioService = new UsuarioService();

        Usuario usuario = new Usuario(
                1,
                "Miguel",
                Usuario.Tipo.ALUNO,
                "miguel@email.com"
        );

        usuarioService.cadastrarUsuario(usuario);

        System.out.println("=== USUÁRIOS CADASTRADOS ===");
        usuarioService.listar();

        System.out.println();

        // TESTE ACTION
        AcaoCadastrarLivro acaoCadastro = new AcaoCadastrarLivro();

        acaoCadastro.executar();

        System.out.println(acaoCadastro.descricao());

        System.out.println();

        AcaoEmpresta acaoEmprestimo = new AcaoEmpresta();

        acaoEmprestimo.executar();

        System.out.println(acaoEmprestimo.descricao());

        System.out.println();

        // TESTE REPOSITORY
        LivroRepository repositorio = new LivroRepository();

        repositorio.salvar();
        repositorio.carregar();

        System.out.println("\n=== TESTES FINALIZADOS ===");
    }
}
