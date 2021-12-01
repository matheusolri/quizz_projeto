package br.unicap.eg.quizz.view.cadastro;

import java.util.Scanner;
import java.util.regex.Pattern;
import br.unicap.eg.quizz.modelo.entidades.*;
import br.unicap.eg.quizz.modelo.excecoes.*;
import br.unicap.eg.quizz.modelo.fachada.*;

public class CadastroDeUsuario extends Cadastro {
    private static final String EXPRESSAO_REGULAR_PARA_VALIDAR_EMAILS = "^[a-z0-9_\\-.]+@[a-z0-9_\\-]+\\.[a-z0-9_\\-]+(\\.[a-z0-9_\\-]+)*$";

    private final IFachada fachada;

    public CadastroDeUsuario(IFachada fachada) {
        this.fachada = fachada;
    }

    public void cadastrarUsuario() {
        Scanner input = new Scanner(System.in);
        int pontuacao =0;
        System.out.print("Nome: ");
        String nome = input.nextLine();
        String email = lerEmail();
        String senha = lerSenha();
        int codigo;
        System.out.println("Informe o tipo de usuário a ser cadastrado.");
        System.out.println("1 - Professor");
        System.out.println("2 - Aluno)");
        System.out.print("Tipo: ");
        int numero = lerNumero();
        while (numero != 1 && numero != 2) {
            System.out.println("Tipo de usuário não existe.");
            System.out.println("Informe o tipo de usuário a ser cadastrado.");
            System.out.println("1 - Professor");
            System.out.println("2 - Aluno)");
            System.out.print("Tipo: ");
            numero = lerNumero();
        }

        Usuario usuario;
        if (numero == 1) {
            codigo = 1;
            usuario = new Aluno(nome, email, senha, codigo, pontuacao);
        } else {
            codigo = 2;
            usuario = new Professor(nome, email, senha, codigo, pontuacao);
        }
        try {
            fachada.adicionarUsuario(usuario);
            System.out.println();
            System.out.println("Usuário cadastrado com sucesso.");
        } catch (UsuarioJaExiste e) {
            System.out.println("O email informado já esta cadastrado.");
        }
    }

    public boolean entrar() {
        Scanner input = new Scanner(System.in);

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Senha: ");
        String senha = input.nextLine();

        System.out.println("Informe o tipo de usuário:");
        System.out.println("1 - Professor");
        System.out.println("2 - Aluno");
        System.out.print("Opção: ");
        int codigo = input.nextInt();

        System.out.println();
        try {
            fachada.entrar(email, senha);
            System.out.println("Bem vindo(a) " + fachada.getUsuarioAtual().getNome());
            System.out.println();
            return true;
        } catch (FalhaDeAutenticacao excecao) {
            System.out.println("Usuário e/ou senha e/ou codigo incorretos.");
            System.out.println();
            return false;
        }

    }

    public void sair() {
        System.out.println();
        System.out.println("Até logo " + fachada.getUsuarioAtual().getNome());
        fachada.sair();
    }

    private String lerEmail() {
        Scanner input = new Scanner(System.in);

        System.out.print("Email: ");
        String email = input.nextLine();

        while (!validaEmail(email)) {
            System.out.println("Email inválido.");
            System.out.print("Digite novamente: ");
            email = input.nextLine();
        }

        return email;
    }

    private String lerSenha() {
        Scanner input = new Scanner(System.in);

        System.out.println("A senha deve ter pelo menos 6 caracteres e deve conter letras, números e símbolos.");
        System.out.print("Senha: ");
        String senha = input.nextLine();

        while (!validaSenha(senha)) {
            System.out.println();
            System.out.println("Senha inválida.");
            System.out.println("A senha deve ter pelo menos 6 caracteres e deve conter letras, números e símbolos.");
            System.out.print("Senha: ");
            senha = input.nextLine();
        }
        return senha;
    }

    private boolean validaSenha(String senha) {
        if (senha.length() < 6) return false;

        boolean contemLetras = false;
        boolean contemNumeros = false;
        boolean contemSimbolos = false;

        for (int i = 0; i < senha.length(); i++) {
            if (Character.isLetter(senha.charAt(i))) {
                contemLetras = true;
            }
            if (Character.isDigit(senha.charAt(i))) {
                contemNumeros = true;
            }
            if (!Character.isLetterOrDigit(senha.charAt(i))) {
                contemSimbolos = true;
            }
        }

        return contemLetras && contemNumeros && contemSimbolos;
    }

    public boolean validaEmail(String email) {
        Pattern padrao = Pattern.compile(EXPRESSAO_REGULAR_PARA_VALIDAR_EMAILS, Pattern.CASE_INSENSITIVE);
        return padrao.matcher(email).find();
    }

    public void getPontuacao() {
        Usuario usuarioAtual = fachada.getUsuarioAtual();

        System.out.println(usuarioAtual);
    }

    public void exibirInformacoesDoUsuario() {
        Usuario usuarioAtual = fachada.getUsuarioAtual();

        System.out.println(usuarioAtual);
    }
}