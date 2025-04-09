import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int quantidadeNotas = 0;


        while (nota != -1){
            System.out.println("Diga sua avaliação para o filme ou digite -1 para encerrar: ");
            nota = sc.nextDouble();

            if (nota != -1){
                mediaAvaliacao += nota;
                quantidadeNotas++;
            }
        }

        System.out.printf("Média de notas é: %.2f", mediaAvaliacao / quantidadeNotas);
    }
}
