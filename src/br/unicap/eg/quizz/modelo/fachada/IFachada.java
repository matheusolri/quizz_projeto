package br.unicap.eg.quizz.modelo.fachada;

import br.unicap.eg.quizz.modelo.entidades.*;
import br.unicap.eg.quizz.modelo.excecoes.*;
import java.util.List;

public interface IFachada {
    Usuario getUsuarioAtual();

    void adicionarUsuario(Usuario usuario) throws UsuarioJaExiste;

    void entrar(String email, String senha) throws FalhaDeAutenticacao;

    void sair();

    void adicionarPergunta(Pergunta pergunta);

    void removerPergunta(int numero) throws PerguntaNaoExiste;

    void editarPergunta(int numero) throws PerguntaNaoExiste;

    Usuario getPontuacao();

    List<Pergunta> getPergunta();


}