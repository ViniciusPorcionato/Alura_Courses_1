public class PrincipalEhPrimo {
    public static void main(String[] args) {
        // Expressão lambda que verifica se um número é primo
        VerificadorPrimo verificador = n -> {
            // Caso especial: números menores ou iguais a 1 não são primos
            if (n <= 1) return false;
            // Verifica divisores de 2 até a raiz quadrada de n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        // Testando com o número 17
        System.out.println("17 é primo? " + verificador.ehPrimo(17));

        // Testando com o número 4
        System.out.println("4 é primo? " + verificador.ehPrimo(4));
    }
}
