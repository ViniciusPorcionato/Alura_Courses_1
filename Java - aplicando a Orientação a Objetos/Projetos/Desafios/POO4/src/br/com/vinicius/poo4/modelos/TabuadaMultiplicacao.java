package br.com.vinicius.poo4.modelos;

import br.com.vinicius.poo4.interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 0; i < 11; i++) {
            System.out.println(i + " X " + numero + " = " + numero*i);
        }
    }
}
