package one.digitalinnovation.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>(6);
        var scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.printf("Digite o valor da temperatura do mês de %s:\n", getMonthName(i));
            temperaturas.add(scanner.nextDouble());
        }
        scanner.close();
        Double soma =- 0.0;
        for (Double temperatura : temperaturas) {
            soma += temperatura;
        }
        Double mediaSemestral = soma / 6;
        for (int i = 0; i < temperaturas.size(); i++) {
            var temp = temperaturas.get(i);
            if (temp > mediaSemestral) {
                System.out.printf("%s: %s", getMonthName(i), temperaturas.get(i));
            }
        }
    }

    /**
     *
     * @param number between 0 and 5
     * @return a String with the name of month
     * @throws IllegalArgumentException throws when the number is less than 0 or greater than 5
     */
    private static String getMonthName(int number) throws IllegalArgumentException {
        switch (number) {
            case 0:
                return "Janeiro";
            case 1:
                return "Fevereiro";
            case 2:
                return "Março";
            case 3:
                return "Abril";
            case 4:
                return "Maio";
            case 5:
                return "Junho";
            default:
                throw new IllegalArgumentException("Invalid number");
        }
    }
}
