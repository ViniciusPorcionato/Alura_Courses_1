package br.com.vinicius.screenmatch5.principal;

// Importa as classes de modelo para representar os dados
import br.com.vinicius.screenmatch5.model.DadosEpisodio;
import br.com.vinicius.screenmatch5.model.DadosSerie;
import br.com.vinicius.screenmatch5.model.DadosTemporada;
import br.com.vinicius.screenmatch5.model.Episodio;
// Importa as classes de serviço para consumir a API e converter dados
import br.com.vinicius.screenmatch5.service.ConsumoApi;
import br.com.vinicius.screenmatch5.service.ConverteDados;
// Importa classes para manipulação de datas
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// Importa classes utilitárias do Java
import java.util.*;
import java.util.stream.Collectors;

// Classe principal que contém o menu interativo da aplicação
public class Principal {
    // Scanner para capturar entrada do usuário no console
    private Scanner sc = new Scanner(System.in);
    // Instância de ConsumoApi para fazer requisições à API
    private ConsumoApi consumo = new ConsumoApi();
    // Instância de ConverteDados para converter JSON em objetos Java
    private ConverteDados conversor = new ConverteDados();

    // Constante com a base da URL da OMDB API
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    // Constante com a chave da API (API Key) para autenticação
    private final String API_KEY = "&apikey=cf1ccee2";

    // Metodo que exibe o menu interativo e executa a lógica principal
    public void exibeMenu() {
        // Exibe uma mensagem pedindo ao usuário para digitar o nome da série
        System.out.println("Digite o nome da serie para busca: ");
        // Lê o nome da série digitado pelo usuário
        var nomeSerie = sc.nextLine();
        // Monta a URL da API com o nome da série, substituindo espaços por "+" e adicionando a API Key
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        // Converte o JSON retornado em um objeto DadosSerie
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        // Exibe os dados da série (usando o toString de DadosSerie)
        System.out.println(dados);

        // Cria uma lista para armazenar as temporadas da série
        List<DadosTemporada> listaTemporadas = new ArrayList<>();
        // Itera de 1 até o número total de temporadas da série
        for (int i = 1; i <= dados.totalTemporadas(); i++) {
            // Monta a URL para obter os dados da temporada i
            json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);
            // Converte o JSON retornado em um objeto DadosTemporada
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            // Adiciona a temporada à lista
            listaTemporadas.add(dadosTemporada);
        }

        // Para cada temporada, exibe o título de cada episódio
        listaTemporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        // Cria uma lista única com todos os episódios de todas as temporadas
        List<DadosEpisodio> dadosEpisodio = listaTemporadas.stream()
                // Transforma a lista de temporadas em um fluxo de episódios
                .flatMap(t -> t.episodios().stream())
                // Coleta os episódios em uma lista
                .collect(Collectors.toList());

        // Filtra episódios com avaliação diferente de "N/A", ordena por avaliação (decrescente) e exibe os 5 primeiros
        dadosEpisodio.stream()
                // Filtra episódios com avaliação válida (diferente de "N/A")
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
                // Ordena por avaliação em ordem decrescente
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
                // Limita a 5 resultados
                .limit(5)
                // Exibe cada episódio (usando o toString de DadosEpisodio)
                .forEach(System.out::println);

        // Cria uma lista de objetos Episodio a partir dos DadosEpisodio
        List<Episodio> episodios = listaTemporadas.stream()
                // Transforma cada temporada em um fluxo de episódios
                .flatMap(t -> t.episodios().stream()
                        // Converte cada DadosEpisodio em um objeto Episodio
                        .map(d -> new Episodio(t.numero(), d))
                )
                // Coleta os episódios em uma lista
                .collect(Collectors.toList());

        // Exibe todos os episódios (usando o toString de Episodio)
        episodios.forEach(System.out::println);

        // Pede ao usuário para digitar um trecho do título de um episódio
        System.out.println("Digite o trecho do nome do episodio: ");
        // Lê o trecho digitado
        var trechoTitulo = sc.nextLine();

        // Busca o primeiro episódio cujo título contém o trecho (ignorando maiúsculas/minúsculas)
        Optional<Episodio> episodioBuscado = episodios.stream()
                // Filtra episódios cujo título contém o trecho (case-insensitive)
                .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))
                // Retorna o primeiro encontrado (ou vazio, se não houver)
                .findFirst();
        // Verifica se um episódio foi encontrado
        if (episodioBuscado.isPresent()) {
            // Se encontrado, exibe uma mensagem e a temporada do episódio
            System.out.println("Episodio encontrado");
            System.out.println("Temporada: " + episodioBuscado.get().getTemporada());
        } else {
            // Se não encontrado, exibe uma mensagem
            System.out.println("Episodio não encontrado");
        }

        // Pede ao usuário para digitar um ano
        System.out.println("A partir de que ano você deseja ver os episódios? ");
        // Lê o ano digitado
        var ano = sc.nextInt();
        // Limpa o buffer do Scanner (necessário após nextInt para evitar problemas com nextLine)
        sc.nextLine();

        // Cria uma data de busca a partir do ano (1º de janeiro do ano informado)
        LocalDate dataBusca = LocalDate.of(ano, 1, 1);

        // Cria um formatador para exibir datas no formato "dd/MM/yyyy"
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Filtra e exibe episódios lançados após a data de busca
        episodios.stream()
                // Filtra episódios com data de lançamento não nula e posterior à data de busca
                .filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca))
                // Exibe informações de cada episódio (temporada, título e data formatada)
                .forEach(e -> System.out.println(
                        "Temporada: " + e.getTemporada() +
                                " Episódio: " + e.getTitulo() +
                                " Data lançamento: " + e.getDataLancamento().format(formatador)
                ));

        // Calcula a média das avaliações por temporada
        Map<Integer, Double> avaliacoesPorTemporada = episodios.stream()
                // Filtra episódios com avaliação maior que 0.0
                .filter(e -> e.getAvaliacao() > 0.0)
                // Agrupa por temporada e calcula a média das avaliações
                .collect(Collectors.groupingBy(Episodio::getTemporada,
                        Collectors.averagingDouble(Episodio::getAvaliacao)));
        // Exibe as médias por temporada
        System.out.println(avaliacoesPorTemporada);

        // Calcula estatísticas das avaliações de todos os episódios
        DoubleSummaryStatistics est = episodios.stream()
                // Filtra episódios com avaliação maior que 0.0
                .filter(e -> e.getAvaliacao() > 0.0)
                // Coleta estatísticas (média, máximo, mínimo, contagem)
                .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));
        // Exibe a média das avaliações
        System.out.println("Média: " + est.getAverage());
        // Exibe a maior avaliação
        System.out.println("Melhor episódio: " + est.getMax());
        // Exibe a menor avaliação
        System.out.println("Pior episódio: " + est.getMin());
        // Exibe a quantidade de episódios avaliados
        System.out.println("Quantidade: " + est.getCount());
    }
}