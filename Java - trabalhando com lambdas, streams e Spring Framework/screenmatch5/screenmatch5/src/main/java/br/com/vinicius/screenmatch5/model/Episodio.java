package br.com.vinicius.screenmatch5.model;

import java.time.DateTimeException;
import java.time.LocalDate;

// Classe que representa um episódio no domínio da aplicação
public class Episodio {
    private Integer temporada;         // Número da temporada à qual o episódio pertence
    private String titulo;             // Título do episódio
    private Integer numero;            // Número do episódio dentro da temporada
    private Double avaliacao;          // Avaliação do episódio (ex.: 8.5)
    private LocalDate dataLancamento;  // Data de lançamento do episódio

    // Construtor que converte um DadosEpisodio em um Episodio
    public Episodio(Integer numeroTemporada, DadosEpisodio dadosEpisodio) {
        this.temporada = numeroTemporada;  // Define o número da temporada
        this.titulo = dadosEpisodio.titulo();  // Obtém o título do DTO
        this.numero = dadosEpisodio.numero();  // Obtém o número do episódio do DTO
        try {
            // Tenta converter a avaliação de String para Double
            this.avaliacao = Double.valueOf(dadosEpisodio.avaliacao());
        } catch (NumberFormatException e) {
            // Se a conversão falhar (ex.: "N/A"), define a avaliação como 0.0
            this.avaliacao = 0.0;
        }

        try {
            // Tenta converter a data de lançamento de String para LocalDate
            this.dataLancamento = LocalDate.parse(dadosEpisodio.dataLancamento());
        } catch (DateTimeException e) {
            // Se a conversão falhar (ex.: formato inválido), define como null
            this.dataLancamento = null;
        }
    }

    // Getters e setters para acessar e modificar os atributos
    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    // Sobrescreve o método toString para facilitar a visualização do objeto
    @Override
    public String toString() {
        return "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numero=" + numero +
                ", avaliacao=" + avaliacao +
                ", dataLancamento=" + dataLancamento;
    }
}