package Concatenar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Principal3 {
    public static void main(String[] args) {
        // Cria uma lista imutável de nomes usando Arrays.asList
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

        // Inicia um stream a partir da lista de nomes
        // Usa Collectors.joining(", ") para concatenar os elementos do stream
        // ", " é o delimitador que separa cada nome na string final
        String resultado = nomes.stream()
                .collect(Collectors.joining(", "));

        // Imprime a string concatenada
        System.out.println(resultado);
        // Resultado esperado: "Alice, Bob, Charlie"
    }
}
