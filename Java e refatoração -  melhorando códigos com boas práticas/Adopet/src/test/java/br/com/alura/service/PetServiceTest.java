package br.com.alura.service;

import br.com.alura.client.ClientHttpConfiguration;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.http.HttpResponse;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class PetServiceTest {

    // Cria um mock (objeto simulado) da classe ClientHttpConfiguration para simular interações com o cliente HTTP
    private ClientHttpConfiguration client = mock(ClientHttpConfiguration.class);
    // Instancia o serviço PetService, passando o mock do cliente HTTP como dependência
    private PetService petService = new PetService(client);
    // Cria um mock do HttpResponse<String> para simular a resposta de uma requisição HTTP
    private HttpResponse<String> response = mock(HttpResponse.class);

    @Test
    public void deveVerificarSeDispararRequisicaoPostSeraChamado() throws IOException, InterruptedException {
        // Simula as entradas do usuário: "Teste" (nome do abrigo) e "pets.csv" (nome do arquivo), separadas por uma nova linha
        String userInput = String.format("Teste%spets.csv",
                System.lineSeparator());
        // Converte a string de entrada em bytes e cria um ByteArrayInputStream para simular o System.in
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        // Redireciona o System.in para o ByteArrayInputStream, fazendo o Scanner ler as entradas simuladas
        System.setIn(bais);

        // Configura o mock para retornar uma resposta simulada quando dispararRequisicaoPost for chamado
        when(client.dispararRequisicaoPost(anyString(), any())).thenReturn(response);

        // Executa o metodo a ser testado, que lê as entradas do Scanner e faz a requisição POST
        petService.importarPetAbrigo();
        // Verifica se o metodo dispararRequisicaoPost foi chamado pelo menos uma vez com quaisquer argumentos
        verify(client.dispararRequisicaoPost(anyString(), anyString()), atLeast(1));
    }

}
