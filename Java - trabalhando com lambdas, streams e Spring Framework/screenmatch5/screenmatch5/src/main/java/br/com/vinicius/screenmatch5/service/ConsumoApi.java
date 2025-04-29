package br.com.vinicius.screenmatch5.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Classe responsável por consumir dados de uma API externa via requisições HTTP
public class ConsumoApi {
    // Metodo que faz uma requisição GET para o endereço fornecido e retorna o JSON da resposta
    public String obterDados(String endereco) {
        // Cria um novo HttpClient para realizar a requisição
        HttpClient client = HttpClient.newHttpClient();

        // Constrói a requisição HTTP com o endereço (URI) fornecido
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))  // Define a URI da API
                .build();                   // Finaliza a construção da requisição (metodo GET por padrão)

        HttpResponse<String> response = null;
        try {
            // Envia a requisição e obtém a resposta como String (corpo em JSON)
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            // Lança uma RuntimeException se houver erro de I/O (ex.: falha de conexão)
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            // Lança uma RuntimeException se a thread for interrompida durante a requisição
            throw new RuntimeException(e);
        }

        // Obtém o corpo da resposta (JSON) e retorna
        String json = response.body();
        return json;
    }
}