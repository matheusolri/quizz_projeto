package br.unicap.eg.quizz.modelo.entidades;

public class Professor extends Usuario {
    public Professor(String nome, String email, String senha, int codigo, int pontuacao) {
        super(nome, email, senha, codigo, pontuacao);
    }

    @Override
    protected Conta criarConta() {
        return new ContaProfessor();
    }

    @Override
    public void add(int pontuacao) {
        pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Email: " + email;
    }
}