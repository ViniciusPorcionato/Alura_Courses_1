import java.util.Scanner;

public class Exercicio13 {
//    13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
//    seu novo salário, com 15% de aumento.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário do funcinário: ");
        double salario = sc.nextDouble();

        double  salarioAumento = salario + (salario * 0.15);

        System.out.printf("Salário antigamente: %.2f | Salário com aumento: %.2f" , salario, salarioAumento);
    }

}
