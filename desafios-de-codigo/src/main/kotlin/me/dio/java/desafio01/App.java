package me.dio.java.desafio01;

import java.util.Scanner;
// Resolução do Desafio 01
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch(number) {
            case 1:
                System.out.println("Pare! O sinal esta vermelho.");
                break;
            case 2:
                System.out.println("Atencao! O sinal esta amarelo.");
                break;
            case 3:
                System.out.println("Siga em frente! O sinal esta verde.");
                break;
            default:
                System.out.println("Valor invalido! Digite 1, 2 ou 3 para indicar a cor do semaforo.");
        }
        scanner.close();
    }
}
