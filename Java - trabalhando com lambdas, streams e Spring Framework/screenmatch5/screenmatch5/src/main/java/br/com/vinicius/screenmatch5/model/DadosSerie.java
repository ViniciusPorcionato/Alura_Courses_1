package br.com.vinicius.screenmatch5.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Ignora campos desconhecidos no JSON que não estão mapeados na classe
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(
        // Mapeia o campo "Title" do JSON para a propriedade "titulo"
        @JsonAlias("Title") String titulo,
        // Mapeia o campo "Year" do JSON para a propriedade "ano"
        @JsonAlias("Year") String ano,
        // Mapeia o campo "Genre" do JSON para a propriedade "genero"
        @JsonAlias("Genre") String genero,
        // Mapeia o campo "totalSeasons" do JSON para a propriedade "totalTemporadas"
        @JsonAlias("totalSeasons") Integer totalTemporadas,
        // Mapeia o campo "imdbRating" do JSON para a propriedade "avaliacao"
        @JsonAlias("imdbRating") String avaliacao
) {
}