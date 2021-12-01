package br.unicap.eg.quizz.modelo.entidades;
import java.io.Serializable;
public abstract class Usuario implements Serializable {
    protected final Conta conta;
    protected final String nome;
    protected final String email;
    private final String senha;
    private final int codigo;
    public final int pontuacao;

    public Usuario(String nome, String email, String senha, int codigo, int pontuacao) {
        this.conta = criarConta();
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.codigo = codigo;
        this.pontuacao = pontuacao;
    }

    protected abstract Conta criarConta();

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int getCodigo (){ return codigo; }

    public int getPontuacao(){ return pontuacao; }

    public Conta getConta() {
        return conta;
    }

    public abstract void add(int pontuacao);
}