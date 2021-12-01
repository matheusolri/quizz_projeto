package br.unicap.eg.quizz.view.cadastro;

import java.util.List;
import java.util.Scanner;
import br.unicap.eg.quizz.modelo.entidades.Categoria;
import br.unicap.eg.quizz.modelo.excecoes.PerguntaNaoExiste;
import br.unicap.eg.quizz.modelo.entidades.Pergunta;
import br.unicap.eg.quizz.modelo.fachada.*;

public class CadastroDePergunta extends Cadastro {

    private final IFachada fachada;

    public CadastroDePergunta(IFachada fachada) {
        this.fachada = fachada;
    }

    public static final int TIPO_USUARIO = 1;

    public void cadastrar() {
        cadastrarPergunta(TIPO_USUARIO);
    }

    private void cadastrarPergunta(int tipo) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pergunta: ");
        String pergunt = input.nextLine();

        Categoria categoria= lerCategoria();

        System.out.println("Resposta 1: ");
        String resposta1 = input.nextLine();
        System.out.println("Resposta 2: ");
        String resposta2 = input.nextLine();
        System.out.println("Resposta 3: ");
        String resposta3 = input.nextLine();
        System.out.println("Resposta 4: ");
        String resposta4 = input.nextLine();
        System.out.println("Resposta 5: ");
        String resposta5 = input.nextLine();
        System.out.println("Resposta Correta: ");
        int respostaCorreta = input.nextInt();

        Pergunta pergunta = new Pergunta(pergunt, resposta1, resposta2, resposta3, resposta4, resposta5, respostaCorreta, categoria);
        fachada.adicionarPergunta(pergunta);

        System.out.println();
        System.out.println("Pergunta cadastrada com sucesso.");
    }

    public void removerPergunta() {
        List<Pergunta> pergunta = fachada.getPergunta();

        if (pergunta.isEmpty()) {
            System.out.println("Nenhuma pergunta cadastrada.");
            return;
        }
        while (true) {
            for (int i = 0; i < pergunta.size(); i++) {
                Pergunta perguntaa = pergunta.get(i);
                System.out.println(i + 1);
                System.out.println(pergunta);
                System.out.println();
            }
            System.out.print("Informe o número da pergunta a ser removida: ");
            int numero = lerNumero();
            try {
                fachada.removerPergunta(numero);
                System.out.println();
                System.out.println("Pergunta removida com sucesso.");
                break;
            } catch (PerguntaNaoExiste e) {
                System.out.println("Pergunta não existe");
            }
        }
    }

    public void editarPergunta(){
        List<Pergunta> pergunta = fachada.getPergunta();

        if (pergunta.isEmpty()) {
            System.out.println("Nenhuma pergunta cadastrada.");
            return;
        }
        while (true) {
            for (int i = 0; i < pergunta.size(); i++) {
                Pergunta perguntaa = pergunta.get(i);
                System.out.println(i + 1);
                System.out.println(pergunta);
                System.out.println();
            }
            System.out.print("Informe o número da pergunta a ser editada: ");
            int numero = lerNumero();
            Scanner input = new Scanner(System.in);

            try {
                fachada.editarPergunta(numero);
                System.out.print("Pergunta: ");
                String pergunt = input.nextLine();

                Categoria categoria= lerCategoria();

                System.out.println("Resposta 1: ");
                String resposta1 = input.nextLine();
                System.out.println("Resposta 2: ");
                String resposta2 = input.nextLine();
                System.out.println("Resposta 3: ");
                String resposta3 = input.nextLine();
                System.out.println("Resposta 4: ");
                String resposta4 = input.nextLine();
                System.out.println("Resposta 5: ");
                String resposta5 = input.nextLine();
                System.out.println("Resposta correta: ");
                int respostaCorreta = input.nextInt();
                Pergunta perguntaa = new Pergunta(pergunt, resposta1, resposta2, resposta3, resposta4, resposta5, respostaCorreta, categoria);
                fachada.adicionarPergunta(perguntaa);
                System.out.println();
                System.out.println("Pergunta editada com sucesso.");
                break;
            } catch (PerguntaNaoExiste e) {
                System.out.println("Pergunta não existe");
            }
        }
    }
    public void exibir() {
        List<Pergunta> perguntas = fachada.getPergunta();

        if (perguntas.isEmpty()) {
            System.out.println("Nenhuma pergunta cadastrada.");
            return;
        }
        for (Pergunta pergunta : perguntas) {
            System.out.println(pergunta);
            System.out.println();
            System.out.println();
        }
    }
}

