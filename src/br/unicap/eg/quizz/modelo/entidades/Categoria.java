package br.unicap.eg.quizz.modelo.entidades;

public enum Categoria {
    PROGRAMACACAO("Programação"),
    BANCO_DE_DADOS("Banco de dados"),
    ENGENHARIA_DE_SOFTWARE("Engenharia de software"),
    CALCULO("Cálculo"),
    WEB_MOBILE("Web mobile"),
    FRONT_END("Front end"),
    SISTEMA_OPERACIONAL("Sistema operacional");

    private final String nome;

    Categoria(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
