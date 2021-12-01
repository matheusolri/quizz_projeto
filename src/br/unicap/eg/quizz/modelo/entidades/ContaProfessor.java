package br.unicap.eg.quizz.modelo.entidades;

import br.unicap.eg.quizz.modelo.excecoes.PerguntaNaoExiste;

public class ContaProfessor extends Conta{
    @Override
    public void adicionarPergunta(Pergunta pergunta) {
        super.adicionarPergunta(pergunta);
    }
    @Override
    public void removerPergunta(int numero) throws PerguntaNaoExiste {
        super.removerPergunta(numero);
    }
    @Override
    public void editarPergunta(int numero) throws PerguntaNaoExiste {
        super.editarPergunta(numero);
    }

}