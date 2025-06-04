import java.util.Scanner;

public class Exercicio3 {
    //    3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
//    final uma mensagem.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite seu salário:");
        double salario = sc.nextDouble();

        System.out.println("O funcionario(a) " + nome + " tem um salário de " + salario + " em Junho");
    }
}
