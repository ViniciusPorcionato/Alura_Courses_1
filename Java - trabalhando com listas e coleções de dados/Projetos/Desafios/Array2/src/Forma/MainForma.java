package Forma;

import java.util.ArrayList;

public class MainForma {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(5);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5);

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);


        for (Forma forma : listaFormas){
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
