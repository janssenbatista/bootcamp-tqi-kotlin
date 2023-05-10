package one.digitalinnovation.maps;

import java.util.*;

public class Exercicio_1 {
    /*
    Dada a população estimada de alguns estados do NE brasileiro, faça:
    Estado = PE - População = 9_616_621
    Estado = AL - População = 3_351_543
    Estado = CE - População = 9_187_103
    Estado = RN - População = 3_534_265
     */
    public static void main(String[] args) {
        // Crie um dicionário e relacione os estados e suas populações
        Map<String, Long> estados = new LinkedHashMap<>();
        estados.put("PE", 9_616_621L);
        estados.put("AL", 3_351_543L);
        estados.put("CE", 9_187_103L);
        estados.put("RN", 3_534_265L);
        // Substitua a população do estado do RN por 3.534.165
        estados.replace("RN", 3_534_165L);
        // Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277
        if (!estados.containsKey("PB"))
            estados.put("PB", 4_039_277L);
        // Exiba os estados e suas populações na ordem que foram informados
        var entries = estados.entrySet();
        for (Map.Entry<String, Long> entry : entries)
            System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        // Exiba os estados e suas populações na ordem alfabética
        System.out.println("Exibindo estados em ordem alfabética:");
        var estados2 = new TreeMap<>(estados);
        var entries2 = estados2.entrySet();
        for (Map.Entry<String, Long> entry : entries2)
            System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        // Exiba os estado com menos população e sua quantidade
        System.out.println("Estado com menor população:");
        var menorPopulacao = Collections.min(estados2.values());
        for (Map.Entry<String, Long> entry : entries2) {
            if (Objects.equals(entry.getValue(), menorPopulacao)) {
                System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
                break;
            }
        }
        // Exiba os estado com maior população e sua quantidade
        System.out.println("Estado com maior população:");
        var maiorPopulacao = Collections.max(estados2.values());
        for (Map.Entry<String, Long> entry : entries2) {
            if (Objects.equals(entry.getValue(), maiorPopulacao)) {
                System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
                break;
            }
        }
        // Exiba a soma da população desses estados
        System.out.println("Soma de população dos estados:");
        Double total = 0.0;
        for (Long populacao : estados.values()) {
            total += populacao;
        }
        System.out.println(total);
        // Exiba a média da população dos estados
        System.out.println("Média da população dos estados:");
        Double media = total / estados2.size();
        System.out.println(media);
        // Remova os estados com a população menor que 4M
        var iterator = entries2.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() < 4_000_000)
                iterator.remove();
        }
        System.out.println("Estados com a população maior que 4M de habitantes:");
        for (var entry : entries2) {
            System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        }
        // Apague o dicionário de estados
        estados.clear();
        // Confira se o dicionário está vazio
        System.out.println("O mapa de estados está vazio? " + (estados.isEmpty() ? "Sim" : "Não"));
    }
}
