package br.com.vinicius.poo4.modelos;

import br.com.vinicius.poo4.interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {


    @Override
    public double celsiusParaFahrenheit(double tempCelsius) {
        double tempConvertida = (tempCelsius * 9 /5) + 32;
        return tempConvertida;
    }

    @Override
    public double fahrenheitParaVelsius(double tempFahrenheit) {
        double tempConvertida = (tempFahrenheit - 32) * 5 /9;
        return tempConvertida;
    }
}
