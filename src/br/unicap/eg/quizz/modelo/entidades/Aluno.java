package br.unicap.eg.quizz.modelo.entidades;

public class Aluno extends Usuario {
    public Aluno(String nome, String email, String senha, int codigo, int pontuacao) {
        super(nome, email, senha, codigo, pontuacao);
    }

    @Override
    protected Conta criarConta() {
        return new ContaAluno();
    }

    @Override
    public void add(int pontuacao) {
        pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Pontuação: " + pontuacao + "\n" +
                "Email: " + email;
    }
}
