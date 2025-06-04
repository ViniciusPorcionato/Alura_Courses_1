import java.util.Scanner;

public class Exercicio4 {
//    4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
//    entre eles.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int resultado = num1 + num2;

        System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + resultado);
    }
}
