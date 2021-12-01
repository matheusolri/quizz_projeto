package br.unicap.eg.quizz.view;

import br.unicap.eg.quizz.dados.*;
import br.unicap.eg.quizz.controle.*;
import br.unicap.eg.quizz.modelo.excecoes.FalhaDeAutenticacao;
import br.unicap.eg.quizz.view.cadastro.CadastroDeUsuario;
import br.unicap.eg.quizz.modelo.fachada.*;
import br.unicap.eg.quizz.view.cadastro.CadastroDePergunta;
import br.unicap.eg.quizz.perguntas.ResolvePerguntas;


public class Aplicacao {
    public static void main(String[] args) throws FalhaDeAutenticacao {
        IRepositorioUsuario repositorioUsuario = RepositorioUsuario.getInstance();

        ControladorDeUsuario controladorDeUsuario = new ControladorDeUsuario(repositorioUsuario);
        ControladorDePerguntas controladorDePerguntas = new ControladorDePerguntas (repositorioUsuario, controladorDeUsuario);

        IFachada fachada = new Fachada(controladorDeUsuario, controladorDePerguntas);

        CadastroDeUsuario cadastroDeUsuario = new CadastroDeUsuario(fachada);
        CadastroDePergunta cadastroDePergunta = new CadastroDePergunta(fachada);

        ResolvePerguntas resolvePerguntas = new ResolvePerguntas(fachada);

        Menu menus = new Menu(cadastroDeUsuario, cadastroDePergunta, resolvePerguntas);
        menus.iniciar();
    }
}
