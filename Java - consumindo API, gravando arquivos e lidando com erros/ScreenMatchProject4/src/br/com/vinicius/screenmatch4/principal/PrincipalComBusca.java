package br.com.vinicius.screenmatch4.principal;

import br.com.vinicius.screenmatch4.modelos.Titulo;
import br.com.vinicius.screenmatch4.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca{
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do filme que deseja: ");
        var nomeFilme = sc.nextLine();

        var endereco = "http://www.omdbapi.com/?t="+nomeFilme+"&apikey=cf1ccee2";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class );
        System.out.println(meuTituloOmdb);


        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println(meuTitulo);

    }
}
