import java.util.Arrays;
import java.util.List;

public class MultiplicaPor3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.replaceAll(n -> n * 3);
        System.out.println(numeros);  // Resultado: [3, 6, 9, 12, 15]
    }
}
