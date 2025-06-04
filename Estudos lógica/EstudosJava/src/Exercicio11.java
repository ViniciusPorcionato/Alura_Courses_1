import java.util.Scanner;

public class Exercicio11 {
//    11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
//    segundo grau e mostre o valor de Delta.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite valores para A:");
        int a = sc.nextInt();
        System.out.println("Digite valores para B:");
        int b = sc.nextInt();
        System.out.println("Digite valores para C:");
        int c = sc.nextInt();

        double delta = (b*b) -4 * a *c;

        System.out.println("Delta é igual a : " + delta);
    }
}
