import java.util.Scanner;

public class Exercicio23 {
//    23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
//    para todos, mas especialmente para mulheres. Faça um programa que leia nome,
//    sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
//    que:
//    - Homens ganham 5% de desconto
// - Mulheres ganham 13% de desconto

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.print("Digite seu sexo:");
        String sexo = sc.nextLine();

        System.out.print("Digite o valor da compra:");
        double preco = sc.nextDouble();

        double valorTotal;
        if (sexo.toLowerCase().equals("feminino")) {
            valorTotal = preco - (preco * 0.13);
            System.out.printf("Valor da compra: R$ " + valorTotal);
        }else if (sexo.toLowerCase().equals("masculino")){
            valorTotal = preco - (preco * 0.05);
            System.out.printf("Valor da compra: R$ " + valorTotal);
        }else{
            System.out.println("Falha ao processar desconto !");
        }

    }
}
