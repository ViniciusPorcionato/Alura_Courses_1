import java.util.Scanner;

public class Exercicio19 {
//    19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//    média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
//    não um bom aproveitamento (se ficou acima da média 7.0)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = sc.nextLine();

        System.out.println("Digite a primeira nota:");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a segunda nota:");
        float nota2 = sc.nextFloat();

        float media = nota1 + nota2 / 2;

        if (media > 7.0){
            System.out.println("O aluno teve um bom aproveitamento!");
        }else{
            System.out.println("O aluno não teve um bom aproveitamento");
        }


    }
}
