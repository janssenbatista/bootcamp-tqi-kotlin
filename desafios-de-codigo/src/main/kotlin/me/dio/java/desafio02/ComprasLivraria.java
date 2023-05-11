package me.dio.java.desafio02;

import java.util.Scanner;

public class ComprasLivraria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instancia 2 objetos do tipo "Livro" com os dados de entrada.
        Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do teclado
        Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());

        var valorTotalDaCompra = (livro1.preco * livro1.quantidade) + (livro2.preco * livro2.quantidade);
        var numeroDeLivrosComprados = livro1.quantidade + livro2.quantidade;

        System.out.printf("Valor total da compra: %.2f%n", valorTotalDaCompra);
        System.out.printf("Numero de livros comprados: %d%n", numeroDeLivrosComprados);
        System.out.printf("Obrigado por comprar na nossa livraria!%n");

    }

    static class Livro {
        String nome;
        double preco;
        int quantidade;

        Livro(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }
    }
}
