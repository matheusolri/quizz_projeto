package br.unicap.eg.quizz.controle;

import br.unicap.eg.quizz.dados.*;
import br.unicap.eg.quizz.modelo.entidades.Conta;
import br.unicap.eg.quizz.modelo.entidades.Pergunta;
import br.unicap.eg.quizz.modelo.excecoes.PerguntaNaoExiste;
import java.util.List;

public class ControladorDePerguntas {
    private final IRepositorioUsuario repositorioUsuario;
    private final ControladorDeUsuario controladorDeUsuario;


    public ControladorDePerguntas(IRepositorioUsuario repositorioUsuario, ControladorDeUsuario controladorDeUsuarios) {
        this.repositorioUsuario = repositorioUsuario;
        this.controladorDeUsuario = controladorDeUsuarios;
    }

    public void adicionarPergunta(Pergunta pergunta) {
        controladorDeUsuario.getUsarioAtual().getConta().adicionarPergunta(pergunta);
        repositorioUsuario.salvarUsuarios(controladorDeUsuario.getUsuarios());
    }


    public void removerPergunta(int numero) throws PerguntaNaoExiste {
        controladorDeUsuario.getUsarioAtual().getConta().removerPergunta(numero);
        repositorioUsuario.salvarUsuarios(controladorDeUsuario.getUsuarios());
    }

    public void editarPergunta(int numero) throws PerguntaNaoExiste{
        controladorDeUsuario.getUsarioAtual().getConta().editarPergunta(numero);
        repositorioUsuario.salvarUsuarios(controladorDeUsuario.getUsuarios());
    }

    public Conta getConta() {
        return controladorDeUsuario.getUsarioAtual().getConta();
    }

    public List<Pergunta> getPergunta() {
        return getConta().getPergunta();
    }


}