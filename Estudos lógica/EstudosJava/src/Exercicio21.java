import java.util.Scanner;

public class Exercicio21 {
//    21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
//    BISSEXTO.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0){
            System.out.println("O ano " + ano + " é bissexto");
        }else{
            System.out.println("O ano " + ano + " não é bissexto");
        }
    }
}
