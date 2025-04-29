package GrupoString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal2 {
    public static void main(String[] args) {
        // Cria uma lista imutável de palavras usando Arrays.asList
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        // Inicia um stream a partir da lista de palavras
        // Converte a lista em um fluxo de dados para processamento funcional
        // Agrupa as palavras pelo tamanho (length) usando Collectors.groupingBy
        // String::length retorna o tamanho de cada string como chave do agrupamento
        // O resultado é um Map onde a chave é o tamanho (Integer) e o valor é uma lista de palavras com esse tamanho
        Map<Integer, List<String>> agrupadasPorTamanho = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        // Imprime o mapa com as palavras agrupadas por tamanho
        // A saída será no formato {tamanho=[lista de palavras]}
        System.out.println(agrupadasPorTamanho);
        // Resultado esperado: {4=[java, code], 6=[stream, lambda]}
    }
}
