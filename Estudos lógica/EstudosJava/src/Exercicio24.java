import java.util.Scanner;

public class Exercicio24 {
//    24) Faça um algoritmo que pergunte a distância que um passageiro deseja
//    percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
//    viagens até 200Km e R$0.45 para viagens mais longas.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a distância em KM, que vc deseja percorrer? ");
        int km = sc.nextInt();

        double valor;

        if (km > 200){
            valor = km * 0.45;
            System.out.println("A passagem custa: R$" + valor);
        }else{
            valor = km * 0.50;
            System.out.println("A passagem custa: R$" + valor);
        }
    }
}
