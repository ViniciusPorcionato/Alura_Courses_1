// Define o pacote onde essa classe está localizada
package Pessoa;

// Importa a biblioteca Gson, usada para conversão entre JSON e objetos Java
import com.google.gson.Gson;

public class ConversaoJsonParaObjeto {

    public static void main(String[] args) {

        // Aqui temos uma String em formato JSON representando uma pessoa
        String jsonPessoa = "{\"nome\":\"Vinicius\",\"idade\":19,\"cidade\":\"São Paulo\"}";

        // Cria uma instância do Gson, que é a ferramenta usada para fazer a conversão
        Gson gson = new Gson();

        // Converte a String JSON para um objeto da classe Pessoa usando o metodo fromJson
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        // Imprime o objeto Pessoa convertido
        // Como estamos usando um 'record', o metodo toString já é gerado automaticamente,
        // e o resultado será algo como: Pessoa[nome=Vinicius, idade=19, cidade=São Paulo]
        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
