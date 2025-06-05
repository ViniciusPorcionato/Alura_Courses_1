import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos segmentos
        System.out.print("Digite o comprimento do primeiro segmento: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo segmento: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro segmento: ");
        double c = scanner.nextDouble();

        // Verificação da desigualdade triangular
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("É possível formar um triângulo com esses segmentos.");
        } else {
            System.out.println("Não é possível formar um triângulo com esses segmentos.");
        }
    }
}
