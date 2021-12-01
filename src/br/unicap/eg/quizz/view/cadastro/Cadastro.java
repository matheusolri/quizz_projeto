package br.unicap.eg.quizz.view.cadastro;

import br.unicap.eg.quizz.modelo.entidades.*;
import java.util.Scanner;

public abstract class Cadastro {

    protected Categoria lerCategoria() {
        Categoria[] categoriasDisponiveis = Categoria.values();

        System.out.println("Categorias:");
        for (int i = 0; i < categoriasDisponiveis.length; i++) {
            System.out.println((i + 1) + ". " + categoriasDisponiveis[i]);
        }

        System.out.print("Escolha a categoria: ");
        int numero = lerNumero();
        while (numero < 1 || numero > categoriasDisponiveis.length) {
            System.out.println("A categoria não existe.");
            System.out.print("Digite novamente: ");
            numero = lerNumero();
        }

        return categoriasDisponiveis[numero - 1];
    }

    protected int lerNumero() {
        Scanner input = new Scanner(System.in);
        int numero;
        try {
            numero = input.nextInt();
        } catch (Exception e) {
            numero = -1;
        }
        input.nextLine();
        return numero;
    }

}
