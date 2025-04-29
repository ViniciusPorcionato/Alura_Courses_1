package SomaDosQuadradosPares;

import java.util.Arrays;
import java.util.List;

public class Principal4 {
    public static void main(String[] args) {
        // Cria uma lista imutável de números inteiros usando Arrays.asList
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Inicia um stream a partir da lista de números
        // Filtra os números pares (aqueles cujo resto da divisão por 2 é 0)
        // Mapeia cada número par para seu quadrado (n * n)
        // Soma todos os quadrados usando reduce, convertendo o resultado para int
        int somaQuadradosPares = numeros.stream()
                .filter(n -> n % 2 == 0) // Mantém apenas números pares
                .mapToInt(n -> n * n)    // Calcula o quadrado de cada número
                .sum();                  // Soma os quadrados

        // Imprime o resultado
        System.out.println("Soma dos quadrados dos números pares: " + somaQuadradosPares);
        // Resultado esperado: 56 (2² + 4² + 6² = 4 + 16 + 36 = 56)
    }
}
