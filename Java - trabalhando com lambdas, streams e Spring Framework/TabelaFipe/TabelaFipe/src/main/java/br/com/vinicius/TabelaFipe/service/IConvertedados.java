package br.com.vinicius.TabelaFipe.service;

import java.util.List;

public interface IConvertedados {
    <T> T obterDados(String json, Class<T> classe);

    <T>List<T> obterLista(String json, Class<T> classe);
}
