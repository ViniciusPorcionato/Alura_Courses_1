package br.com.vinicius.screenmatch4.modelos;

public class Serie extends Titulo {
    private int temporadas; // Número de temporadas da série
    private boolean ativa; // Indica se a série ainda está em produção
    private int episodiosPorTemporada; // Quantidade de episódios por temporada
    private int minutosPorEpidosio; // Duração de cada episódio (typo: deveria ser minutosPorEpisodio)
    private int totalVizualizacao; // Total de visualizações da série (parece não ser usado no momento)

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    // Getter: Retorna o total de visualizações
    public int getTotalVizualizacao() {
        return totalVizualizacao;
    }

    // Setter: Define o total de visualizações
    public void setTotalVizualizacao(int totalVizualizacao) {
        this.totalVizualizacao = totalVizualizacao;
    }

    // Setter: Define o número de temporadas
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    // Setter: Define se a série está ativa
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    // Setter: Define o número de episódios por temporada
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    // Setter: Define a duração de cada episódio
    public void setMinutosPorEpidosio(int minutosPorEpidosio) {
        this.minutosPorEpidosio = minutosPorEpidosio;
    }

    // Getter: Retorna o número de temporadas
    public int getTemporadas() {
        return temporadas;
    }

    // Getter: Retorna se a série está ativa
    public boolean isAtiva() {
        return ativa;
    }

    // Getter: Retorna o número de episódios por temporada
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    // Getter: Retorna a duração de cada episódio
    public int getMinutosPorEpidosio() {
        return minutosPorEpidosio;
    }

    @Override // Sobrescreve o metodo de Titulo para calcular a duração total
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpidosio; // Calcula a duração total da série
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "( " + this.getAnoDeLancamento() + " )";
    }
}
