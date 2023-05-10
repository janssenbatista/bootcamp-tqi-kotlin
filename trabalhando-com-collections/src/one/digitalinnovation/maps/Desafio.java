package one.digitalinnovation.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Desafio {
    /*
        Faça um programa que simule um lançamento de dados.
     */
    public static void main(String[] args) {
        Map<Integer, Integer> numeros = new HashMap<>();
        // Lance o dado 100 vezes e armazene
        for (int i = 0; i < 100; i++) {
            int numero = getRandomNumber(1, 6);
            if (numeros.containsKey(numero)) {
                int valor = numeros.get(numero);
                numeros.replace(numero, valor + 1);
            } else {
                numeros.put(numero, 1);
            }

        }
        // Mostre quantas vezes cada valor foi inserido
        var entries = numeros.entrySet();
        for (var entry : entries) {
            System.out.printf("O número %d foi inserido %d vezes\n",
                    entry.getKey(), entry.getValue());
        }
    }

    private static int getRandomNumber(int min, int max) {
        int bound = max - min + 1;
        return new Random().nextInt(bound) + min;
    }
}
