import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = sc.nextLine();

        System.out.println("Qual o ano de lançamento: ");
        int ano = sc.nextInt();

        System.out.println("Diga sua avaiação para o filme: ");
        double avaliacao = sc.nextDouble();

        System.out.println(filme + ano + avaliacao);
    }
}
