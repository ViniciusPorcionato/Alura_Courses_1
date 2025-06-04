import java.util.Scanner;

public class Exercicio15 {
//    15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
//    salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
//    por hora trabalhada.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de dias trabalhados no mês: ");
        int diasTrabalhados = sc.nextInt();

        int horasTrabalhadas = diasTrabalhados * 8;
        double salario = horasTrabalhadas * 25;

        System.out.println("Salário do mês: R$" + salario);
    }
}
