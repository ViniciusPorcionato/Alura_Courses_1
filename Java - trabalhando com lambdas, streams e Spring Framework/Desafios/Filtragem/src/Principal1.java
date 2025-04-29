import java.util.Arrays;
import java.util.List;


//Dada a lista de números inteiros abaixo, filtre apenas os números pares e imprima-os.
public class Principal1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

//        stream(): Converte a lista em um Stream.
//        filter(n -> n % 2 == 0): Usa uma Lambda Expression para selecionar apenas números divisíveis por 2 (pares).
//        forEach(System.out::println): Imprime cada número par.
    }
}
