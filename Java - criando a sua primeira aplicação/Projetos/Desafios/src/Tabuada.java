import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número que deseja para imprimir a tabuada: ");
        int numTabuada = sc.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(i + " X " + numTabuada + " = " + numTabuada*i);
        }
    }
}
