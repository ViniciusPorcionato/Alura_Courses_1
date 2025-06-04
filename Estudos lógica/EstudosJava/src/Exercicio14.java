import java.util.Scanner;

public class Exercicio14 {
//    14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
//    um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
//    quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
//    sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de KM percorridos: ");
        float km = sc.nextFloat();

        System.out.println("Digite a quantidade de dias carro foi alugado: ");
        int dias = sc.nextInt();

        double valorKm = km * 0.20;
        double valorDias = dias * 90;

        double valorTotal = valorDias + valorKm;

        System.out.println("Valor total: R$" + valorTotal);
    }
}
