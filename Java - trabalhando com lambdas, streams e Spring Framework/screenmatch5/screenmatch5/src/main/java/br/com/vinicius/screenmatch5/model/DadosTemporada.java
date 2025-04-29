package br.com.vinicius.screenmatch5.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

// Ignora campos desconhecidos no JSON que não estão mapeados na classe
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada(
        // Mapeia o campo "Season" do JSON para a propriedade "numero"
        @JsonAlias("Season") Integer numero,
        // Mapeia o campo "Episodes" do JSON para a propriedade "episodios", uma lista de DadosEpisodio
        @JsonAlias("Episodes") List<DadosEpisodio> episodios
) {
}