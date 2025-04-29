import java.util.Arrays;
import java.util.List;

//Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.
public class Principal2 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        palavras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

//        stream(): Converte a lista em um Stream.
//        map(String::toUpperCase): Usa uma referência de metodo para transformar cada string em sua versão em maiúsculas.
//        forEach(System.out::println): Imprime cada string transformada.
    }
}
