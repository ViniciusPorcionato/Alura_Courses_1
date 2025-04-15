package br.com.vinicius.screenmatch2.modelos;

import br.com.vinicius.screenmatch2.calculo.Classificavel;

public class Episodio implements Classificavel { // Implementa a interface Classificavel, mas não herda de Titulo
    private int numero; // Número do episódio
    private String nome; // Nome do episódio
    private Serie serie; // Referência à série à qual o episódio pertence
    private int totalVizualizacao; // Total de visualizações do episódio

    // Getter: Retorna o total de visualizações
    public int getTotalVizualizacao() {
        return totalVizualizacao;
    }

    // Setter: Define o total de visualizações
    public void setTotalVizualizacao(int totalVizualizacao) {
        this.totalVizualizacao = totalVizualizacao;
    }

    // Getter: Retorna o número do episódio
    public int getNumero() {
        return numero;
    }

    // Setter: Define o número do episódio
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Getter: Retorna o nome do episódio
    public String getNome() {
        return nome;
    }

    // Setter: Define o nome do episódio
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter: Retorna a série associada
    public Serie getSerie() {
        return serie;
    }

    // Setter: Define a série associada
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override // Implementa o metodo da interface Classificavel
    public int getClassificacao() {
        if (totalVizualizacao > 100) { // Se tiver mais de 100 visualizações
            return 4; // Classificação alta (4 estrelas)
        } else {
            return 2; // Classificação média (2 estrelas)
        }
    }
}