import java.util.Scanner;

public class Exercicio8 {
//    8) Desenvolva um programa que leia uma distância em metros e mostre os valores
//    relativos em outras medidas.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância em metros:");
        double distancia = sc.nextDouble();

        double km = distancia / 1000;
        double hm = distancia / 100;
        double dam = distancia / 10;
        double dm = distancia * 10;
        double cm = distancia * 100;
        double mm = distancia * 1000;

        System.out.printf("""
                A distância de %f corrsponde a:
                %f Km
                %f Hm
                %f Dam
                %.1f dm
                %.1f cm
                %.1f mm
                """, distancia, km, hm, dam, dm, cm, mm);

    }
}
