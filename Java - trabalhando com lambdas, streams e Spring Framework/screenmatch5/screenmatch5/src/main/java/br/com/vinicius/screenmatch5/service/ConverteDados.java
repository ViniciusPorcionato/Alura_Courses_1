package br.com.vinicius.screenmatch5.service;

import br.com.vinicius.screenmatch5.model.DadosSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// Classe que converte JSON em objetos Java, implementando a interface IConverteDados
public class ConverteDados implements IConverteDados {
    // Instância do ObjectMapper para desserialização de JSON
    private ObjectMapper mapper = new ObjectMapper();

    // Metodo que converte um JSON (String) em um objeto do tipo especificado
    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            // Desserializa o JSON para um objeto da classe especificada
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            // Lança uma RuntimeException se houver erro na conversão do JSON
            throw new RuntimeException(e);
        }
    }
}