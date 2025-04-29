public class PrincipalVerificadorPalindromo {
    public static void main(String[] args) {
        // Expressão lambda que verifica se uma string é palíndromo
        VerificadorPalindromo verificador = str -> {
            // Converte a string para minúsculas e remove espaços/acentos
            String limpa = str.toLowerCase().replaceAll("[^a-z0-9]", "");
            // Cria um StringBuilder com a string limpa e a reverte
            String reverso = new StringBuilder(limpa).reverse().toString();
            // Compara a string original limpa com a reversa
            return limpa.equals(reverso);
        };

        // Testando com "Radar"
        System.out.println("Radar é palíndromo? " + verificador.verificarPalindromo("Radar"));

        // Testando com "Hello"
        System.out.println("Hello é palíndromo? " + verificador.verificarPalindromo("Hello"));
    }
}
