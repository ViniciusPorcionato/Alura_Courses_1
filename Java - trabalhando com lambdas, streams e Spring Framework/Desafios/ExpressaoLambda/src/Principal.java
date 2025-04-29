public class Principal {
    public static void main(String[] args) {
        // Expressão lambda que multiplica dois números inteiros
        Multiplicador multiplicador = (a,b) -> a *b;

        // Testando a lambda com valores 5 e 3
        int resultado = multiplicador.multiplicacao(5,3);

        // Exibe o resultado (5 * 3 = 15)
        System.out.println("Resultado: " + resultado);
    }

}
