package br.com.vinicius.TabelaFipe.principal;

// Declaração do pacote onde a classe está localizada.

import br.com.vinicius.TabelaFipe.model.DadosVeiculo;
import br.com.vinicius.TabelaFipe.model.Modelos;
import br.com.vinicius.TabelaFipe.model.Veiculo;
import br.com.vinicius.TabelaFipe.service.ConsumoApi;
import br.com.vinicius.TabelaFipe.service.ConverteDados;

// Importação das classes necessárias para o funcionamento do programa, incluindo modelos de dados e serviços.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Importação de classes do Java para manipulação de listas, entrada de dados, ordenação e streams.

public class Principal {
    // Declaração da classe Principal, que contém a lógica principal do programa.

    private Scanner sc = new Scanner(System.in);
    // Cria um objeto Scanner para capturar entrada do usuário via console.

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";
    // Define a URL base da API da Tabela FIPE, usada para consultar dados de veículos.

    private ConsumoApi consumoApi = new ConsumoApi();
    // Instancia um objeto da classe ConsumoApi, responsável por fazer requisições HTTP à API.

    private ConverteDados conversor = new ConverteDados();
    // Instancia um objeto da classe ConverteDados, que converte JSON em objetos Java.

    public void exibeMenu() {
        // Metodo que exibe o menu e gerencia a interação com o usuário.

        var menu = """
                *** OPÇÕES ***
                Carro
                Moto
                Caminhão
                
                Digite uma das opções para consultar:
                """;
        // Define um menu em formato de string usando text block (Java 15+), listando as opções disponíveis.

        System.out.println(menu);
        // Exibe o menu no console.

        var opcao = sc.nextLine();
        // Lê a opção digitada pelo usuário (ex.: "Carro", "Moto" ou "Caminhão").

        String endereco = "";
        // Inicializa uma variável para armazenar o endereço da API que será consultado.

        if (opcao.toLowerCase().contains("carr")) {
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }
        // Verifica a opção digitada (ignorando maiúsculas/minúsculas) e define o endereço da API correspondente:
        // - Se contém "carr", consulta marcas de carros.
        // - Se contém "mot", consulta marcas de motos.
        // - Caso contrário, consulta marcas de caminhões.

        var json = consumoApi.obterDados(endereco);
        // Faz uma requisição à API usando o endereço construído e armazena a resposta JSON.

        var marcas = conversor.obterLista(json, DadosVeiculo.class);
        // Converte o JSON em uma lista de objetos do tipo DadosVeiculo, que representa as marcas.

        marcas.stream()
                .sorted(Comparator.comparing(DadosVeiculo::codigo))
                .forEach(System.out::println);
        // Cria um stream da lista de marcas, ordena pelo código da marca (usando Comparator) e imprime cada marca no console.

        System.out.println("Informe o código da marca para consulta: ");
        // Solicita que o usuário digite o código da marca desejada.

        var codigoMarca = sc.nextLine();
        // Lê o código da marca digitado pelo usuário.

        endereco = endereco + "/" + codigoMarca + "/modelos";
        // Atualiza o endereço da API para consultar os modelos da marca selecionada, adicionando o código da marca e "/modelos".

        json = consumoApi.obterDados(endereco);
        // Faz uma nova requisição à API para obter os modelos da marca.

        var modeloLista = conversor.obterDados(json, Modelos.class);
        // Converte o JSON em um objeto do tipo Modelos, que contém a lista de modelos da marca.

        System.out.println("\nModelos dessa marca: ");
        // Exibe uma mensagem indicando que os modelos serão listados.

        modeloLista.modelos().stream()
                .sorted(Comparator.comparing(DadosVeiculo::codigo))
                .forEach(System.out::println);
        // Cria um stream da lista de modelos, ordena pelo código do modelo e imprime cada modelo no console.

        System.out.println("\nDigite um trecho do nome do carro a ser buscado: ");
        // Solicita que o usuário digite um trecho do nome do veículo para filtrar.

        var nomeVeiculo = sc.nextLine();
        // Lê o trecho do nome do veículo digitado pelo usuário.

        List<DadosVeiculo> modelosFiltrados = modeloLista.modelos().stream()
                .filter(m -> m.nome().toLowerCase().contains(nomeVeiculo.toLowerCase()))
                .collect(Collectors.toList());
        // Filtra os modelos cujo nome contém o trecho digitado (ignorando maiúsculas/minúsculas) e coleta o resultado em uma lista.

        System.out.println("\nModelos filtrados");
        // Exibe uma mensagem indicando que os modelos filtrados serão listados.

        modelosFiltrados.forEach(System.out::println);
        // Imprime cada modelo filtrado no console.

        System.out.println("Digite por favor o código do modelo para buscar os valores de avaliação: ");
        // Solicita que o usuário digite o código do modelo para consultar os anos disponíveis.

        var codigoModelo = sc.nextLine();
        // Lê o código do modelo digitado pelo usuário.

        endereco = endereco + "/" + codigoModelo + "/anos";
        // Atualiza o endereço da API para consultar os anos disponíveis do modelo selecionado.

        json = consumoApi.obterDados(endereco);
        // Faz uma requisição à API para obter os anos do modelo.

        List<DadosVeiculo> anos = conversor.obterLista(json, DadosVeiculo.class);
        // Converte o JSON em uma lista de objetos DadosVeiculo, representando os anos disponíveis.

        List<Veiculo> veiculos = new ArrayList<>();
        // Cria uma lista vazia para armazenar os veículos com detalhes completos.

        for (int i = 0; i < anos.size(); i++) {
            // Itera sobre cada ano disponível.

            var enderecoAnos = endereco + "/" + anos.get(i).codigo();
            // Constrói o endereço da API para consultar os detalhes do veículo para um ano específico.

            json = consumoApi.obterDados(enderecoAnos);
            // Faz uma requisição à API para obter os detalhes do veículo para o ano.

            Veiculo veiculo = conversor.obterDados(json, Veiculo.class);
            // Converte o JSON em um objeto do tipo Veiculo, que contém informações detalhadas do veículo.
            veiculos.add(veiculo);
        }

        System.out.println("\nTodos os veículos filtrados com avaliações por ano: ");
        veiculos.forEach(System.out::println);
    }
}

