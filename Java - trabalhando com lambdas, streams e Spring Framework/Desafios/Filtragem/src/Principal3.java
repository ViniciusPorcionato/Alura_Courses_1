import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Dada a lista de números inteiros abaixo, filtre os números ímpares, multiplique cada um por 2 e colete os resultados em uma nova lista.
public class Principal3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Filtra ímpares, multiplica por 2 e coleta em uma nova lista
        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(resultado);

//        stream(): Converte a lista em um Stream.
//        filter(n -> n % 2 != 0): Seleciona apenas números ímpares (não divisíveis por 2).
//        map(n -> n * 2): Multiplica cada número ímpar por 2.
//        collect(Collectors.toList()): Coleta os resultados em uma nova lista.
    }
}
