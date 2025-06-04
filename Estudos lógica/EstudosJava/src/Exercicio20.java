import java.util.Scanner;

public class Exercicio20 {
    //20) Desenvolva um programa que leia um n&uacute;mero inteiro e mostre se ele &eacute; PAR ou
    //ÍMPAR.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número e descubra se ele é par ou ímpar: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("O número %d é par", numero);
        } else {
            System.out.printf("O número %d é impar", numero);
        }
    }
}
