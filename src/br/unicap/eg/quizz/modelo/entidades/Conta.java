package br.unicap.eg.quizz.modelo.entidades;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import br.unicap.eg.quizz.modelo.excecoes.PerguntaNaoExiste;

public abstract class Conta implements Serializable {
    protected final List<Pergunta> pergunta;


    public Conta() {
        pergunta = new ArrayList<>();
    }

    public void adicionarPergunta(Pergunta per) {
        pergunta.add(per);
    }

    public List<Pergunta> getPergunta() {
        return pergunta;
    }

    public List<Pergunta> getPerguntasPorCategoria(Categoria categoria) {

        List<Pergunta> perguntasPorCategoria = new ArrayList<>();

        return perguntasPorCategoria;
    }


    public void removerPergunta ( int numero) throws PerguntaNaoExiste {
        if (numero < 1 || numero > pergunta.size()) {
            throw new PerguntaNaoExiste();
        }
        int indice = numero - 1;
        pergunta.remove(indice);
    }

    public void editarPergunta ( int numero) throws PerguntaNaoExiste {
        if (numero < 1 || numero > pergunta.size()) {
            throw new PerguntaNaoExiste();
        }
        int indice = numero - 1;
        pergunta.remove(indice);
    }
}