package one.digitalinnovation.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        List<String> perguntas = Arrays.asList(
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        );
        var scanner = new Scanner(System.in);
        var totalRespostasPositivas = 0;
        for (String pergunta : perguntas) {
            System.out.printf("%s (s/n)\n", pergunta);
            var resposta = scanner.next();
            if (resposta.equals("s")) totalRespostasPositivas++;
        }
        switch (totalRespostasPositivas) {
            case 1:
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
            case 5:
                System.out.println("Assasina");
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
