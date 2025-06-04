import java.util.Scanner;

public class Exercicio16 {
//    16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
//    fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
//    já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
//    quantos dias de vida um fumante perderá e exiba o total em dias.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de cigarros fumados por dia: ");
        int quantidadeCigarroDia = sc.nextInt();

        System.out.println("Digite a qauntidade de anos que você fuma: ");
        int anos = sc.nextInt();

        int totalCigarrosFumados = quantidadeCigarroDia * 365 * anos;
        int minutosPerdidos = totalCigarrosFumados * 10;
        int diasPerdidos = minutosPerdidos / 1440; //minutos em um dia

        System.out.println("Você perderá aproximadamente " + diasPerdidos + " dias de vida.");



    }
}
