package br.com.vinicius.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosVeiculo(@JsonAlias("codigo") String codigo,
                           @JsonAlias("nome") String nome) {
}
