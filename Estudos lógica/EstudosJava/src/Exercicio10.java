import java.util.Scanner;

public class Exercicio10 {
//    10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
//    mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
//    sabendo que cada litro de tinta pinta uma área de 2metros quadrados.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura em metros:");
        float altura = sc.nextFloat();

        System.out.println("Digite a largura em metros:");
        float largura = sc.nextFloat();

        float area = altura * largura;

        float tinta = area / 2;

        System.out.println("Quantidade em litros de tinta necessária: " + tinta);

    }
}
