import java.util.Scanner;

public class Exercicio12 {
    //    12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
//    PREÇO PROMOCIONAL, com 5% de desconto.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double precoProduto = sc.nextFloat();

        double precoDesconto = precoProduto - (precoProduto * 0.05);

        System.out.printf("Preço do Produto: %.2f | Preço com desconto: %.2f", precoProduto, precoDesconto);

    }
}
