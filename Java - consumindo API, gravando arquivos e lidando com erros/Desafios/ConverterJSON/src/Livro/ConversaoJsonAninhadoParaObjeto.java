// Define o pacote onde essa classe está localizada
package Livro;

// Importa a biblioteca Gson, usada para conversão entre JSON e objetos Java

import com.google.gson.Gson;

public class ConversaoJsonAninhadoParaObjeto {
    public static void main(String[] args) {

        // String JSON representando um livro, com um objeto "editora" aninhado
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\","
                + "\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        // Cria uma instância do Gson para fazer a conversão
        Gson gson = new Gson();

        // Converte o JSON para um objeto do tipo Livro
        // O Gson entende automaticamente que "editora" é um objeto do tipo Editora
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        // Imprime o objeto convertido
        // Como usamos records, o metodo toString já vem pronto e imprime tudo de forma organizada:
        // Exemplo: Livro[titulo=Aventuras do Java, autor=Akemi, editora=Editora[nome=TechBooks, cidade=São Paulo]]
        System.out.println("Objeto Livro: " + livro);
    }
}
