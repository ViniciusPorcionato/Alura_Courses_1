package br.com.vinicius.screenmatch5.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Ignora campos desconhecidos no JSON que não estão mapeados na classe
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(
        // Mapeia o campo "Title" do JSON para a propriedade "titulo"
        @JsonAlias("Title") String titulo,
        // Mapeia o campo "Episode" do JSON para a propriedade "numero"
        @JsonAlias("Episode") Integer numero,
        // Mapeia o campo "imdbRating" do JSON para a propriedade "avaliacao"
        @JsonAlias("imdbRating") String avaliacao,
        // Mapeia o campo "Released" do JSON para a propriedade "dataLancamento"
        @JsonAlias("Released") String dataLancamento
) {
}