package br.com.vinicius.poo4.modelos;

import br.com.vinicius.poo4.interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double valor1, double valor2) {
        double area = valor1 * valor2;
        System.out.println("A área do retangulo é: " + area);
    }

    @Override
    public void calcularPerimetro(double valor1, double valor2, double valor3, double valor4) {
        double perimetro = valor1 + valor2 + valor3 + valor4;
        System.out.println("O perimetro do retangulo é: " + perimetro);
    }

}
