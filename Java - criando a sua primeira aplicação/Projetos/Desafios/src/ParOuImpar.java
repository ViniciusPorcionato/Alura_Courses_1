import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número e saiba se ele é par ou ímpar: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.printf("O número %d é par", num);
        }else {
            System.out.printf("O número %d é ímpar", num);
        }
    }
}
