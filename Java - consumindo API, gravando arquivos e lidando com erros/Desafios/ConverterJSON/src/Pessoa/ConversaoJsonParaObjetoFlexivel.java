// Define o pacote onde está a classe
package Pessoa;

// Importa as classes necessárias da biblioteca Gson
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoJsonParaObjetoFlexivel {

    public static void main(String[] args) {

        // String JSON que representa uma pessoa, mas está "incompleta":
        // Faltando o campo "idade"
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        // Cria uma instância de Gson com o modo "leniente" ativado
        // Isso permite que ele aceite pequenas falhas no JSON (como campos faltando)
        Gson gson = new GsonBuilder().setLenient().create();

        // Converte a String JSON para um objeto Pessoa
        // Mesmo com o campo "idade" ausente, a conversão ainda acontece
        // Nesse caso, 'idade' será atribuído com o valor padrão do tipo `int`, que é 0
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        // Imprime o objeto convertido
        // Vai mostrar: Pessoa[nome=Rodrigo, idade=0, cidade=Brasília]
        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
