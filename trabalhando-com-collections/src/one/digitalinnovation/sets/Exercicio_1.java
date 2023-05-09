package one.digitalinnovation.sets;

import java.util.*;

public class Exercicio_1 {
    public static void main(String[] args) {
        // Crie um conjunto contendo as cores do arco-íris
        Set<String> coresArcoIris =
                new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
        // Exiba todas as cores
        System.out.println(coresArcoIris);
        // Exiba a quantidade de cores que o arco-íris tem
        System.out.println(coresArcoIris.size());
        // Exiba as cores em ordem alfabética
        System.out.println(new TreeSet<>(coresArcoIris));
        // Exiba as cores na ordem inversa da que foi informada
        List<String> listaCoresDoArcoIris = new ArrayList<>(coresArcoIris);
        Collections.reverse(listaCoresDoArcoIris);
        System.out.println(listaCoresDoArcoIris);
        // Exiba todas as cores que começam com a letra "v"
        for (String cor : coresArcoIris) {
            if (cor.startsWith("V")) System.out.println(cor);
        }
        // Remova todas as cores que não começam com a letra "v"
        coresArcoIris.removeIf(cor -> !cor.startsWith("V"));
        System.out.println(coresArcoIris);
        // Limpe o conjunto
        coresArcoIris.clear();
        // Confira se o conjunto está vazio
        System.out.printf("O conjunto está vazio? %s", (coresArcoIris.isEmpty() ? "Sim" : "Não"));
    }
}
