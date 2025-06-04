import java.util.Scanner;

public class Exercicio5 {
    //    5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
//    na tela a sua média na disciplina.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da matéria: ");
        String nomeMateria = sc.nextLine();

        System.out.println("Digite a primeira nota:");
        float nota1 = sc.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.println("A média entre " + nota1 + " e " + nota2 + " é igual a " + media);
    }
}
