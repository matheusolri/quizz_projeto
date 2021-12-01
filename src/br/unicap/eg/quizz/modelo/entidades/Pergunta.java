package br.unicap.eg.quizz.modelo.entidades;

import java.io.Serializable;

public class Pergunta implements Serializable{
    private final Categoria categoria;
    private final String pergunt;
    private final String resposta1;
    private final String resposta2;
    private final String resposta3;
    private final String resposta4;
    private final String resposta5;
    private final int respostaCorreta;

    public Pergunta(String pergunt, String resposta1, String resposta2, String resposta3, String resposta4, String resposta5, int respostaCorreta, Categoria categoria) {
        this.pergunt = pergunt;
        this.categoria = categoria;
        this.resposta1=resposta1;
        this.resposta2=resposta2;
        this.resposta3=resposta3;
        this.resposta4=resposta4;
        this.resposta5=resposta5;
        this.respostaCorreta=respostaCorreta;
    }

    public String getResposta1() {
        return resposta1;
    }
    public String getResposta2() {
        return resposta2;
    }
    public String getResposta3() {
        return resposta3;
    }
    public String getResposta4() {
        return resposta4;
    }
    public String getResposta5() {
        return resposta5;
    }
    public int getRespostaCorreta(){ return respostaCorreta; }

    @Override
    public String toString() {
        return "Pergunta" + pergunt +"\n"
                + "Categoria: "  +  "\n"
                + categoria+ "\n"
                + "Respostas: "  +  "\n"
                + resposta1+ "\n"
                + resposta2+ "\n"
                + resposta3+ "\n"
                + resposta4+ "\n"
                + resposta5+ "\n"
                + "Resposta Correta: "  +  "\n"
                + respostaCorreta;
    }
}