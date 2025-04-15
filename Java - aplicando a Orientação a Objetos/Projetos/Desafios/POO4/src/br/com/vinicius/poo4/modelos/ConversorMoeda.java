package br.com.vinicius.poo4.modelos;

import br.com.vinicius.poo4.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.94;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em R$ é : R$" + valorReal);
    }
}
