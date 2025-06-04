import java.util.Scanner;

public class Exercicio7 {
//    7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
//    sua terça parte.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        float num = sc.nextFloat();

        float dobro = num * 2;
        float terco = num / 3;

        System.out.println("O dobro de " + num + " é " + dobro);
        System.out.println("A terça parte de " + num + " é " + terco);

    }
}
