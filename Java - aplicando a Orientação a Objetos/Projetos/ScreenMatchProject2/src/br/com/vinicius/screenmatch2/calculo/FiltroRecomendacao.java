package br.com.vinicius.screenmatch2.calculo;

public class FiltroRecomendacao {

    // Metodo: Filtra e recomenda com base na classificação
    public void filtrar(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) { // Se a classificação for 4 ou mais
            System.out.println("Está entre os preferidos"); // Recomenda como favorito
        } else if (classificavel.getClassificacao() >= 2) { // Se for 2 ou mais, mas menos que 4
            System.out.println("Muito bem avaliado no momento"); // Recomenda como bem avaliado
        } else { // Se for menos que 2
            System.out.println("Coloque na sua lista para assistir depois"); // Sugere adiar
        }
    }
}