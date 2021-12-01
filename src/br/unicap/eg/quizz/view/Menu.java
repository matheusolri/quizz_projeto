package br.unicap.eg.quizz.view;

import br.unicap.eg.quizz.modelo.excecoes.FalhaDeAutenticacao;
import br.unicap.eg.quizz.view.cadastro.CadastroDeUsuario;
import br.unicap.eg.quizz.view.cadastro.CadastroDePergunta;
import br.unicap.eg.quizz.perguntas.*;
import java.util.Scanner;

public class Menu {
    private final CadastroDeUsuario cadastroDeUsuario;
    private final CadastroDePergunta cadastroDePergunta;
    private final ResolvePerguntas resolvePerguntas;

    public Menu(CadastroDeUsuario cadastroDeUsuario, CadastroDePergunta cadastraPergunta, ResolvePerguntas resolvePerguntas) {
        this.cadastroDePergunta = cadastraPergunta;
        this.cadastroDeUsuario = cadastroDeUsuario;
        this.resolvePerguntas = resolvePerguntas;
    }

    public void iniciar() throws FalhaDeAutenticacao {
        menuInicial();
    }

    private void menuInicial(){
        int opcao;
        do {
            System.out.println("QUIZZ");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Entrar");
            System.out.println("0 - Sair do programa");
            System.out.print("Informe o número da opção: ");
            opcao = lerOpcao();
            System.out.println();
            switch (opcao) {
                case 1:
                    cadastroDeUsuario.cadastrarUsuario();
                    break;
                case 2:
                    boolean entrouComSucesso = cadastroDeUsuario.entrar();
                    menu();
                    break;
                case 0:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
    }

    private void menu() {
        int opcao;
        do {
            System.out.println("Informe o tipo de usuário:");
            System.out.println("1 - Professor");
            System.out.println("2 - Aluno");
            System.out.print("Opção: ");
            opcao=lerOpcao();
            while (opcao != 1 && opcao != 2) {
                System.out.println("Tipo de usuário não existe.");
                System.out.println("Informe o tipo de usuário .");
                System.out.println("1 - Professor");
                System.out.println("2 - Aluno)");
                System.out.println("0 - Voltar");
                System.out.print("Opção: ");
                opcao = lerOpcao();
            }
            System.out.println();

            switch (opcao) {
                case 1:
                    menuProfessor();
                    break;
                case 2:
                    menuAluno();
                    break;
                case 0:
                    menuInicial();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
    }

    private void menuProfessor()  {
        int opcao;
        do {
            System.out.println("QUIZZ");
            System.out.println("1 - Visualizar pontuação");
            System.out.println("2 - Resolver um quizz");
            System.out.println("3 - Sugerir uma questão");
            System.out.println("4 - Informações do usuário");
            System.out.println("5 - Visualizar perguntas cadastradas");
            System.out.println("6 - Remover perguntas");
            System.out.println("7 - Editar perguntas ");
            System.out.println("0 - Sair");
            System.out.print("Informe o número da opção: ");
            opcao = lerOpcao();
            System.out.println();
            switch (opcao) {
                case 1:

                    break;
                case 2:
                    menuPerguntas();
                    break;
                case 3:
                    cadastroDePergunta.cadastrar();
                    break;
                case 4:
                    cadastroDeUsuario.exibirInformacoesDoUsuario();
                    break;
                case 5:
                    cadastroDePergunta.exibir();
                    break;
                case 6:
                    cadastroDePergunta.removerPergunta();
                    break;
                case 7:
                    cadastroDePergunta.editarPergunta();
                    break;
                case 0:
                    cadastroDeUsuario.sair();
                    menuInicial();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
    }

    private void menuPerguntas (){
        int opcao;
        do {
            System.out.println("QUIZZ ------> RESOLVER PERGUNTAS");
            System.out.println("Escolha uma categoria:");
            System.out.println("1 - Banco de dados");
            System.out.println("2 - Calculo");
            System.out.println("3 - Web e Mobile");
            System.out.println("4 - Programação");
            System.out.println("0 - Voltar");
            System.out.print("Informe o número da opção: ");
            opcao = lerOpcao();
            System.out.println();
            switch (opcao) {
                case 1:
                    resolvePerguntas.bandodedados();
                    break;
                case 2:
                    resolvePerguntas.calculo();
                    break;
                case 3:
                    resolvePerguntas.webemobile();
                    break;
                case 4:
                    resolvePerguntas.programação();
                    break;
                case 5:
                    cadastroDePergunta.exibir();
                    break;
                case 0:
                    menuAluno();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
    }

    private void menuAluno()  {
        int opcao;
        do {
            System.out.println("QUIZZ");
            System.out.println("1 - Adicionar sugestão");
            System.out.println("2 - Resolver um quizz");
            System.out.println("3 - Sugerir uma questão");
            System.out.println("4 - Informações do usuário");
            System.out.println("5 - Visualizar suas perguntas cadastradas");
            System.out.println("0 - Sair");
            System.out.print("Informe o número da opção: ");
            opcao = lerOpcao();
            System.out.println();
            switch (opcao) {
                case 1:
                  cadastroDeUsuario.getPontuacao();
                    break;
                case 2:
                    menuPerguntas();
                    break;
                case 3:
                    cadastroDePergunta.cadastrar();
                    break;
                case 4:
                    cadastroDeUsuario.exibirInformacoesDoUsuario();
                    break;
                case 5:
                    cadastroDePergunta.exibir();
                    break;
                case 0:
                    cadastroDeUsuario.sair();
                    menuInicial();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
    }

    private int lerOpcao() {
        Scanner input = new Scanner(System.in);
        int opcao;
        try {
            opcao = input.nextInt();
        } catch (Exception e) {
            opcao = -1;
        }
        input.nextLine();
        return opcao;
    }
}


