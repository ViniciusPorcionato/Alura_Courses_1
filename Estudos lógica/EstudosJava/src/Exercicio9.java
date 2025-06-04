import java.util.Scanner;

public class Exercicio9 {
//    9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
//    e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qauntos reais você tem na carteira ?");
        double carteira = sc.nextDouble();

        double dolar = 3.45;
        double converter = carteira / dolar;

        System.out.printf("Você consegue comprar %.2f dolares", converter);
    }
}
