import java.util.Scanner;

public class Exercicio17 {
//    17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
//    o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a velocidade do carro: ");
        int velocidade = sc.nextInt();

        if (velocidade > 80) {
            int excesso = velocidade - 80;
            int multa = excesso * 5;
            System.out.println("Você foi multado!");
            System.out.println("Valor da multa: R$" + multa);
        } else {
            System.out.println("Velocidade dentro do limite. Dirija com segurança!");
        }
    }
}
