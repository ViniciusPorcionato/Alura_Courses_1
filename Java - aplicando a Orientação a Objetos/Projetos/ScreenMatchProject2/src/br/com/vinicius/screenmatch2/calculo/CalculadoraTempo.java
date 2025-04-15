package br.com.vinicius.screenmatch2.calculo;

import br.com.vinicius.screenmatch2.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal; // Armazena o tempo total acumulado em minutos

    //Getter: Retorna o tempo total acumulado
    public int getTempoTotal() {
        return tempoTotal;
    }

    // Metodo para adicionar a duração de um título ao tempo total
    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos(); // Chama getDuracaoEmMinutos do objeto passado (polimorfismo)
        // Se for Filme: usa o valor fixo de duracaoEmMinutos
        // Se for Serie: calcula com base em temporadas, episódios e minutos
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos(); // Metodo comentado: específico para Filme (desnecessário com polimorfismo)
//    }

    //Sobrecarga de métodos
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos(); // Mtodo comentado: específico para Serie (desnecessário com polimorfismo)
//    }
}