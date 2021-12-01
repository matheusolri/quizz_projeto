package br.unicap.eg.quizz.modelo.fachada;

import br.unicap.eg.quizz.controle.*;
import br.unicap.eg.quizz.modelo.entidades.*;
import br.unicap.eg.quizz.modelo.excecoes.*;
import java.util.List;

public class Fachada implements IFachada {
    private final ControladorDeUsuario controladorDeUsuarios;
    private final ControladorDePerguntas controladorDePerguntas;
    public Fachada(ControladorDeUsuario controladorDeUsuarios, ControladorDePerguntas controladorDePerguntas) {
        this.controladorDePerguntas = controladorDePerguntas;
        this.controladorDeUsuarios = controladorDeUsuarios;
    }
    @Override
    public void adicionarUsuario(Usuario usuario) throws UsuarioJaExiste {
        controladorDeUsuarios.adicionarUsuario(usuario);
    }
    @Override
    public void entrar(String email, String senha) throws FalhaDeAutenticacao {
        controladorDeUsuarios.entrar(email, senha);
    }

    @Override
    public void sair() {
        controladorDeUsuarios.sair();
    }

    @Override
    public Usuario getPontuacao() {
        controladorDeUsuarios.getPontuacao();
        return null;
    }

    @Override
    public Usuario getUsuarioAtual() {
        return controladorDeUsuarios.getUsarioAtual();
    }

    @Override
    public void adicionarPergunta(Pergunta pergunta) {
        controladorDePerguntas.adicionarPergunta(pergunta);
    }

    @Override
    public void removerPergunta(int numero) throws PerguntaNaoExiste {
        controladorDePerguntas.removerPergunta(numero);
    }
    @Override
    public void editarPergunta(int numero) throws PerguntaNaoExiste {
        controladorDePerguntas.editarPergunta(numero);
    }
    @Override
    public List<Pergunta> getPergunta() {
        return controladorDePerguntas.getPergunta();
    }

}