import java.util.Scanner;

public class Exercicio2 {
//    2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas para ela
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();

        System.out.println("Olá " + nome + ", é um prazer te conhecer");
    }
}
