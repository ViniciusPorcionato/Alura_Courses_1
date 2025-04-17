// Declara o pacote onde está essa classe
package GitHub;

// Importações necessárias: Gson para manipular JSON e pacotes de rede para realizar requisições HTTP
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

// Classe principal com método main para executar o programa
public class PrincipalGitHub {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Pede ao usuário para digitar seu nome de usuário do GitHub
        System.out.println("Digite seu usuário do GitHub: ");
        String user = sc.nextLine(); // Lê o nome digitado

        // Monta a URL da API do GitHub com o nome de usuário fornecido
        var endereco = "https://api.github.com/users/" + user;

        try {
            // Cria um cliente HTTP para fazer a requisição
            HttpClient client = HttpClient.newHttpClient();

            // Cria a requisição GET para a URL da API
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco)) // Define o endereço
                    .header("Accept", "application/vnd.github.v3+json") // Define o tipo de resposta esperada
                    .build(); // Constrói a requisição

            // Envia a requisição e armazena a resposta como uma string
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Verifica se o status da resposta é 404 (usuário não encontrado)
            if (response.statusCode() == 404){
                // Lança uma exceção personalizada se o usuário não for encontrado
                throw new ErroConsultaGitHubException("⚠️ Usuário '" + user + "' não foi encontrado no GitHub.");
            }

            // Armazena o corpo da resposta HTTP (o JSON retornado pela API) em uma variável.
            String json = response.body();
            // Cria uma instância de Gson para desserializar o JSON em um objeto Java.
            Gson gson = new GsonBuilder().create();
            // Converte o JSON em um objeto da classe UserOmdb, mapeando os campos do JSON para o record.
            UserOmdb usuario = gson.fromJson(json, UserOmdb.class);
            // Cria uma instância da classe User, passando o objeto UserOmdb para o construtor.
            User meuUsuario = new User(usuario);

            // Exibe as informações do usuário de forma formatada usando printf.
            System.out.printf("Usuário: %s%nID: %d%nTipo: %s%nBio: %s%nAvatar: %s%n",
                    // Obtém o nome do usuário através do getter.
                    meuUsuario.getNomeUser(),
                    // Obtém o ID do usuário.
                    meuUsuario.getId(),
                    // Obtém o tipo do usuário (ex.: "User" ou "Organization").
                    meuUsuario.getTipoUsuario(),
                    // Obtém a biografia do usuário.
                    meuUsuario.getBio(),
                    // Obtém a URL do avatar do usuário.
                    meuUsuario.getUrlImagem());

            // Captura e trata erros de entrada/saída e interrupção da requisição
        } catch (IOException | InterruptedException e) {
            System.out.println("❌ Ocorreu um erro durante a consulta à API do GitHub.");
            e.printStackTrace(); // Exibe detalhes do erro

            // Captura e trata erros personalizados de usuário não encontrado
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage()); // Exibe a mensagem da exceção
        }
    }
}
