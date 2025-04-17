package Divisor;

import java.util.Scanner;

public class PrincipalDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numerador = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int denominador = sc.nextInt();

        try {
            int divisao;
            divisao = numerador / denominador;
            System.out.println("Resultado da divisão: " + divisao);
        }catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero não permitida " + e.getMessage());
        }
    }
}
