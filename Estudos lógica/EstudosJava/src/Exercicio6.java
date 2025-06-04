import java.util.Scanner;

public class Exercicio6 {
//    6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
//    sucessor.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("O antecessor de " + num + " é " + (num - 1) );
        System.out.println("O sucessor de " + num + " é " + (num + 1) );
    }
}
