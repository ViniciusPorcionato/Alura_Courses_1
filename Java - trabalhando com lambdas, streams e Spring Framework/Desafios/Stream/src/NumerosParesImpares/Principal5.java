package NumerosParesImpares;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal5 {
    public static void main(String[] args) {
        // Cria uma lista imutável de números inteiros usando Arrays.asList
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Inicia um stream a partir da lista de números
        // Usa Collectors.partitioningBy para dividir os números em dois grupos:
        // - Chave true: números pares (n % 2 == 0)
        // - Chave false: números ímpares
        // O resultado é um Map<Boolean, List<Integer>> com duas entradas
        Map<Boolean, List<Integer>> particionados = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        // Imprime os números pares (chave true)
        System.out.println("Pares: " + particionados.get(true));
        // Imprime os números ímpares (chave false)
        System.out.println("Ímpares: " + particionados.get(false));
        // Resultado esperado:
        // Pares: [2, 4, 6]
        // Ímpares: [1, 3, 5]
    }
}
