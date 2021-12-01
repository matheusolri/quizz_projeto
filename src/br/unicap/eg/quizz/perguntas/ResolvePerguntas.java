package br.unicap.eg.quizz.perguntas;

import br.unicap.eg.quizz.modelo.fachada.*;

import java.util.Scanner;

public class ResolvePerguntas {
    private final IFachada fachada;
    Scanner input = new Scanner(System.in);
    public ResolvePerguntas(IFachada fachada) {
        this.fachada = fachada;
    }
    int pontuacao;
    public void bandodedados (){
        System.out.println("QUESTÕES");
        System.out.println("Atenção nossas questões só possuem uma resposta correta!");
        System.out.println("TODAS AS CATEGORIAS POSSUEM 5 QUESTÕES");
        System.out.println("A resposta deverá ser o número exemplo: 1, 2, 3 ou 4");
        System.out.println("*Qual dessas é um famoso gerenciador de banco de dados ?");
        System.out.println("a) TmS");
        System.out.println("b) Base Adimin");
        System.out.println("c) MySql");
        System.out.println("d) Todas estão corretas");
        System.out.println("REPOSTA: ");
        char resposta1 = input.next().charAt(0);
        if(resposta1 ==  'c' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("*Se eu quiser exibir dados de uma TABELA o que eu faço? ?");
        System.out.println("a) SELECT * FROM NOME_DA_TABELA");
        System.out.println("b) DISPLAY_TABELA");
        System.out.println("c) TABELA _DISPLAY ");
        System.out.println("d) Todas estão corretas");
        System.out.println("REPOSTA: ");
        char resposta2 = input.next().charAt(0);
        if(resposta2 ==  'a' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("* Para que serve um banco de dados ? ?");
        System.out.println("a) Para podermos programar sem dá erro");
        System.out.println("b) Armazenar dados ");
        System.out.println("c) Não tem grandes serventia");
        System.out.println("d) Serve para programadores iniciantes busacarem informações sobre programação");
        System.out.println("REPOSTA: ");
        char resposta3 = input.next().charAt(0);
        if(resposta3 ==  'b' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println();
        System.out.println("* O atual professor de Banco de Dados 1 na Unicap é ?");
        System.out.println("a) Waldemar");
        System.out.println("b) Sergio");
        System.out.println("c) Michelle ");
        System.out.println("d) Tarcisio");
        System.out.println("REPOSTA: ");
        char resposta4 = input.next().charAt(0);
        if(resposta4 ==  'd' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("* Qual atividade importante de realizar ates de criar im banco de dados de fato ?");
        System.out.println("a) Criar um planner");
        System.out.println("b) Criar um modelo Er  e um modelo Relacional");
        System.out.println("c) Criar um MVC ");
        System.out.println("d) Nenhuma está correta");
        System.out.println("REPOSTA: ");
        char resposta5 = input.next().charAt(0);
        if(resposta5 ==  'b' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("********SUA PONTUAÇÃO FOI: "+pontuacao+ " ********");

    }



    public void programação (){
        System.out.println("QUESTÕES");
        System.out.println("Atenção nossas questões só possuem uma resposta correta!");
        System.out.println("TODAS AS CATEGORIAS POSSUEM 5 QUESTÕES");
        System.out.println("A resposta deverá ser o número exemplo: 1, 2, 3 ou 4");
        System.out.println("Qual linguagem de progrmacação chamada linguagem mãe ?");
        System.out.println("a) Java");
        System.out.println("b) C");
        System.out.println("c) Phyton");
        System.out.println("d) React");
        System.out.println("REPOSTA: ");
        char resposta1 = input.next().charAt(0);
        if(resposta1 ==  'c' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println(" Como exibimos alguma mensagem em java?");
        System.out.println("a)  System.out.println('Hello world');");
        System.out.println("b) System.out.p();");
        System.out.println("c) System.println(); ");
        System.out.println("d) Todas estão erradas");
        System.out.println("REPOSTA: ");
        char resposta2 = input.next().charAt(0);
        if(resposta2 ==  'd' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("*  Quais são estrutura de repetição?");
        System.out.println("a)Matriz");
        System.out.println("b) vetor ");
        System.out.println("c) While");
        System.out.println("d) If else");
        System.out.println("REPOSTA: ");
        char resposta3 = input.next().charAt(0);
        if(resposta3 ==  'c' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println();
        System.out.println("* Qual uma Boa tecnica para não causar acoplamento no codigo ?");
        System.out.println("a) Padrão de desacoplamento");
        System.out.println("b) Não existe essa tecnica");
        System.out.println("c) MVC ");
        System.out.println("d) Padrão A");
        System.out.println("REPOSTA: ");
        char resposta4 = input.next().charAt(0);
        if(resposta4 ==  'c' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("* O que siguinifica POO ?");
        System.out.println("a) Programação orientada a orbital");
        System.out.println("b) Nenhuma das alternativas ");
        System.out.println("c) Criar um MVC ");
        System.out.println("d) Programação orientada a objeto");
        System.out.println("REPOSTA: ");
        char resposta5 = input.next().charAt(0);
        if(resposta5 ==  'd' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("********SUA PONTUAÇÃO FOI: "+pontuacao+ " ********");
    }

    public void calculo (){
        System.out.println("QUESTÕES");
        System.out.println("Atenção nossas questões só possuem uma resposta correta!");
        System.out.println("TODAS AS CATEGORIAS POSSUEM 5 QUESTÕES");
        System.out.println("A resposta deverá ser o número exemplo: 1, 2, 3 ou 4");
        System.out.println("Quanto é limite de xˆ2 tendendo a 4?");
        System.out.println("a) 2");
        System.out.println("b) 3");
        System.out.println("c) 8");
        System.out.println("d) 16");
        System.out.println("REPOSTA: ");
        char resposta1 = input.next().charAt(0);
        if(resposta1 ==  'd' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("Qual a derivada de xˆ2?");
        System.out.println("a) xˆ3/3");
        System.out.println("b) 3");
        System.out.println("c) 4");
        System.out.println("d) Todas estão erradas");
        System.out.println("REPOSTA: ");
        char resposta2 = input.next().charAt(0);
        if(resposta2 ==  'a' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("*  Qual o limite de x^3 tendendo a 0 ");
        System.out.println("a)9");
        System.out.println("b) 3 ");
        System.out.println("c) 1");
        System.out.println("d) NDA");
        System.out.println("REPOSTA: ");
        char resposta3 = input.next().charAt(0);
        if(resposta3 ==  'd' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println();
        System.out.println("* O que é limite ? ");
        System.out.println("a) Padrão de desacoplamento");
        System.out.println("b) Não existe essa tecnica");
        System.out.println("c) MVC ");
        System.out.println("d) Padrão A");
        System.out.println("REPOSTA: ");
        char resposta4 = input.next().charAt(0);
        if(resposta4 ==  'c' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("* O que é derivada");
        System.out.println("a) A taxa de variação instantânea de y em relação a x neste ponto.");
        System.out.println("b) A taxa de variação temporária de y  em relação a x neste ponto. ");
        System.out.println("c) A taxa de variação temporária de y  ");
        System.out.println("d) Algo que deriva ");
        System.out.println("REPOSTA: ");
        char resposta5 = input.next().charAt(0);
        if(resposta5 ==  'a' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("********SUA PONTUAÇÃO FOI: "+pontuacao+ " ********");
    }

    public void webemobile (){
        System.out.println("QUESTÕES");
        System.out.println("Atenção nossas questões só possuem uma resposta correta!");
        System.out.println("TODAS AS CATEGORIAS POSSUEM 5 QUESTÕES");
        System.out.println("A resposta deverá ser o número exemplo: 1, 2, 3 ou 4");
        System.out.println("*Principal/principais linguagem/ns que utilizamos para programar para Web ?");
        System.out.println("a) HTML, CSS e java Script");
        System.out.println("b) Assembly");
        System.out.println("c) C#");
        System.out.println("d) JAVA");
        System.out.println("REPOSTA: ");
        char resposta1 = input.next().charAt(0);
        if(resposta1 ==  'a' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("*Para que o design do site fique Bonito temos de  :");
        System.out.println("a) implementar um banco de dados");
        System.out.println("b) saber programar bem em payton");
        System.out.println("c) fazer bom uso do css ");
        System.out.println("d) Todas estão corretas");
        System.out.println("REPOSTA: ");
        char resposta2 = input.next().charAt(0);
        if(resposta2 ==  'c' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("* Qual tag utilizamos para deixar em negrito no HTML ?");
        System.out.println("a)  <B></B>");
        System.out.println("b)  <N></N>");
        System.out.println("c)  <I></I>");
        System.out.println("d)  <N></N>");
        System.out.println("REPOSTA: ");
        char resposta3 = input.next().charAt(0);
        if(resposta3 ==  'a' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println();
        System.out.println("* Como anda o mercado para programadores mobile ?");
        System.out.println("a) anda em queda devido a crise");
        System.out.println("b) com pouquissimas vagas");
        System.out.println("c) nenhuma alternativa ");
        System.out.println("d) Anda em alta devido a crescente em dos aparelhos mobile na população");
        System.out.println("REPOSTA: ");
        char resposta4 = input.next().charAt(0);
        if(resposta4 ==  'd' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("* Boas linguagens de desenvolvimento mobile ?");
        System.out.println("a) flunter e react");
        System.out.println("b)  Html");
        System.out.println("c) C++");
        System.out.println("d) Nenhuma dessas");
        System.out.println("REPOSTA: ");
        char resposta5 = input.next().charAt(0);
        if(resposta5 ==  'a' ){
            pontuacao = pontuacao +10;
        }
        else {
            pontuacao = pontuacao;
        }
        System.out.println();
        System.out.println("********SUA PONTUAÇÃO FOI: "+pontuacao+ " ********");

    }
}
