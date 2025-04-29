package br.com.alura.service;

// Importa as classes necessárias para o teste, incluindo configurações do cliente HTTP, modelo de domínio Abrigo, e ferramentas de teste como JUnit e Mockito
import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.domain.Abrigo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.http.HttpResponse;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// Declara a classe de teste para o serviço AbrigoService
public class AbrigoServiceTest {
    // Cria um mock (objeto simulado) da classe ClientHttpConfiguration para simular interações com o cliente HTTP
    private ClientHttpConfiguration client = mock(ClientHttpConfiguration.class);
    // Instancia o serviço AbrigoService, passando o mock do cliente HTTP como dependência
    private AbrigoService abrigoService = new AbrigoService(client);
    // Cria um mock do HttpResponse<String> para simular a resposta de uma requisição HTTP
    private HttpResponse<String> response = mock(HttpResponse.class);
    // Cria uma instância de Abrigo com dados de teste (nome, telefone e e-mail)
    private Abrigo abrigo = new Abrigo("Teste", "61981880392", "abrigo_alura@gmail.com");

    // Anota o metodo como um teste JUnit
    @Test
    // Declara o metodo de teste que verifica se a requisição GET é disparada corretamente
    public void deveVerificarQuandoHaAbrigo() throws IOException, InterruptedException {
        // Define o ID do abrigo como 0 para o teste
        abrigo.setId(0L);
        // Define a string esperada para a mensagem de "Abrigos cadastrados"
        String expectedAbrigosCadastrados = "Abrigos cadastrados:";
        // Define a string esperada para o formato "ID - Nome" do abrigo
        String expectedIdENome = "0 - Teste";

        // Cria um ByteArrayOutputStream para capturar a saída do console (System.out)
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // Cria um PrintStream para redirecionar a saída do console para o ByteArrayOutputStream
        PrintStream printStream = new PrintStream(baos);
        // Redireciona a saída padrão do sistema (System.out) para o PrintStream criado
        System.setOut(printStream);

        // Configura o mock do HttpResponse para retornar uma string JSON simulando uma lista com o objeto abrigo
        when(response.body()).thenReturn("[{"+abrigo.toString()+"}]");
        // Configura o mock do cliente HTTP para retornar o mock do HttpResponse quando dispararRequisicaoGet for chamado com qualquer string
        when(client.dispararRequisicaoGet(anyString())).thenReturn(response);

        // Chama o metodo listarAbrigo do serviço, que deve realizar a requisição GET e exibir os abrigos no console
        abrigoService.listarAbrigo();

        // Divide a saída capturada do console em linhas, usando o separador de linha do sistema
        String[] lines = baos.toString().split(System.lineSeparator());
        // Obtém a primeira linha da saída (esperada: "Abrigos cadastrados:")
        String actualAbrigosCadastrados = lines[0];
        // Obtém a segunda linha da saída (esperada: "0 - Teste")
        String actualIdENome = lines[1];

        // Verifica se a primeira linha da saída corresponde à string esperada
        Assertions.assertEquals(expectedAbrigosCadastrados, actualAbrigosCadastrados);
        // Verifica se a segunda linha da saída corresponde à string esperada
        Assertions.assertEquals(expectedIdENome, actualIdENome);
    }

    @Test
    public void deveVerificarQuandoNaoHaAbrigo() throws IOException, InterruptedException {
        abrigo.setId(0L);
        String expected = "Não há abrigos cadastrados:";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        when(response.body()).thenReturn("[]");
        when(client.dispararRequisicaoGet(anyString())).thenReturn(response);

        abrigoService.listarAbrigo();

        String[] lines = baos.toString().split(System.lineSeparator());
        String actual = lines[0];

        Assertions.assertEquals(expected, actual);
    }
}