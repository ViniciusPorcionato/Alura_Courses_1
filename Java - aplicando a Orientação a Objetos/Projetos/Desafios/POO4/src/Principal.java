import br.com.vinicius.poo4.modelos.CalculadoraSalaRetangular;
import br.com.vinicius.poo4.modelos.ConversorMoeda;
import br.com.vinicius.poo4.modelos.ConversorTemperaturaPadrao;
import br.com.vinicius.poo4.modelos.TabuadaMultiplicacao;

public class Principal {
    public static void main(String[] args) {

        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(50);

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5,6.8);
        calculadora.calcularPerimetro(7, 10.8, 7, 10.8);

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(5);

        ConversorTemperaturaPadrao conversao = new ConversorTemperaturaPadrao();
        System.out.println(conversao.celsiusParaFahrenheit(20));
        System.out.println(conversao.celsiusParaFahrenheit(50));

    }
}
