package br.com.vinicius.screenmatch4.principal;

import br.com.vinicius.screenmatch4.excecao.ErroDeConversaoDeAnoException;
import br.com.vinicius.screenmatch4.modelos.Titulo;
import br.com.vinicius.screenmatch4.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (!busca.equalsIgnoreCase("Sair")) {

            System.out.println("Digite o nome do filme que deseja: ");
            var nomeFilme = sc.nextLine();


            if (nomeFilme.equalsIgnoreCase("Sair")){
                break;
            }

            var endereco = "http://www.omdbapi.com/?t=" + nomeFilme.replace(" ", "+") + "&apikey=cf1ccee2";
            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo convertido");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);


            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(titulos);

        try (FileWriter escrita = new FileWriter("filmes.json")) {
            escrita.write(gson.toJson(titulos));
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

    }
}
