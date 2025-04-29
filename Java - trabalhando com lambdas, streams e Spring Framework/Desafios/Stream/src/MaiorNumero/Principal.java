package MaiorNumero;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Principal {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10,20,30,40,50,60);

        Optional<Integer> maiorNumero = numeros.stream()
                .max(Integer::compare);

        System.out.println(maiorNumero.get());
    }
}
