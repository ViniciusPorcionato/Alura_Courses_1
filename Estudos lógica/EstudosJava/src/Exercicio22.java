import java.util.Scanner;

public class Exercicio22 {
//    22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//    situação em relação ao alistamento militar.
//            - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
//    alistamento.
// - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
//    alistamento.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano de seu nascimento: ");
        int anoNascimento = sc.nextInt();

        int idade = 2025 - anoNascimento;

        if (idade < 18){
            System.out.println("Falta " + (18 - idade) + " anos para o alistamento");
        }else{
            System.out.println("Já se passou " + (idade - 18) + " anos do alistamento");
        }

    }
}
