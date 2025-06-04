import java.util.Scanner;

public class Exercicio18 {
//    18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
//    dela e depois mostre se ela pode ou não votar.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano do seu nascimento");
        int anoNascimento = sc.nextInt();

        int idade = 2025 - anoNascimento;

        if (idade >= 18){
            System.out.println("Você pode votar");
        }else{
            System.out.println("Você não pode votar");
        }
    }
}
