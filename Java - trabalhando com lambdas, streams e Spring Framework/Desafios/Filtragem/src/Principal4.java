import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Dada a lista de strings abaixo, remova as duplicatas (palavras que aparecem mais de uma vez) e imprima o resultado.
public class Principal4 {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        // Remove duplicatas e imprime
        List<String> resultado = palavras.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(resultado);

//        stream(): Converte a lista em um Stream.
//        distinct(): Remove duplicatas, mantendo apenas a primeira ocorrência de cada elemento.
//        collect(Collectors.toList()): Coleta os elementos únicos em uma nova lista.
//        System.out.println(resultado): Imprime a lista resultante.
    }
}
