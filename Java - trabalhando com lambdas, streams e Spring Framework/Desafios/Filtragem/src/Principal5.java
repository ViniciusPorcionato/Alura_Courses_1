import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Dada a lista de sublistas de números inteiros abaixo, extraia todos os números primos em uma única lista e os ordene em ordem crescente.
public class Principal5 {
    public static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        // Extrai números primos, ordena e coleta em uma lista
        List<Integer> primos = listaDeNumeros.stream()
                .flatMap(List::stream) // Achata as sublistas em um único stream
                .filter(Principal5::isPrimo) // Filtra números primos
                .sorted() // Ordena em ordem crescente
                .collect(Collectors.toList());

        System.out.println(primos);
    }

    // Função auxiliar para verificar se um número é primo
    private static boolean isPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}