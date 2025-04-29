package br.com.vinicius.screenmatch5.service;

// Interface que define o contrato para conversão de JSON em objetos Java
public interface IConverteDados {
    // Metodo genérico para converter uma String JSON em um objeto do tipo especificado
    <T> T obterDados(String json, Class<T> classe);
}