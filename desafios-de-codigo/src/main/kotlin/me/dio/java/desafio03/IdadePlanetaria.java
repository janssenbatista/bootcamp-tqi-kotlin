package me.dio.java.desafio03;

import java.util.Scanner;

public class IdadePlanetaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double idadeTerrestre = scanner.nextDouble();
        String planeta = scanner.next();
        switch (planeta) {
            case "Marte":
                System.out.printf("Idade equivalente em %s: %.2f anos", planeta, (idadeTerrestre / 1.88));
                break;
            case "Venus":
                System.out.printf("Idade equivalente em %s: %.2f anos", planeta, (idadeTerrestre / 0.62));
                break;
            case "Jupiter":
                System.out.printf("Idade equivalente em %s: %.2f anos", planeta, (idadeTerrestre / 11.86));
                break;
            default:
                System.out.println("Planeta invalido.");
        }
        scanner.close();
    }
}
