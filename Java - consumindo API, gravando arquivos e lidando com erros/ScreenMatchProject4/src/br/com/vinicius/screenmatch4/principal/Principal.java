package br.com.vinicius.screenmatch4.principal;

import br.com.vinicius.screenmatch4.calculo.CalculadoraTempo;
import br.com.vinicius.screenmatch4.calculo.FiltroRecomendacao;
import br.com.vinicius.screenmatch4.modelos.Episodio;
import br.com.vinicius.screenmatch4.modelos.Filme;
import br.com.vinicius.screenmatch4.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970); // Cria um novo objeto Filme

        // Define valores usando setters
        meuFilme.setNome("O Poderoso Chefão"); // Define o nome do filme
        //meuFilme.setAnoDeLancamento(1970); // Define o ano de lançamento
        meuFilme.setDuracaoEmMinutos(180); // Define a duração em minutos
        meuFilme.setIncluidoNoPlano(true); // Marca como incluído no plano

        // Chama getters (sem usar os valores retornados diretamente aqui)
        meuFilme.getNome();
        meuFilme.getAnoDeLancamento();
        meuFilme.getDuracaoEmMinutos();
        meuFilme.isIncluidoNoPlano();

        meuFilme.exibeFichaTecnica(); // Exibe as informações do filme no console
        meuFilme.avalia(8.5); // Adiciona uma avaliação de 8.5
        meuFilme.avalia(7.3); // Adiciona uma avaliação de 7.3
        meuFilme.avalia(9.6); // Adiciona uma avaliação de 9.6

        System.out.println("Média de avaliações: " + meuFilme.obterMedia()); // Exibe a média (8.47)
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacao()); // Exibe o total de avaliações (3)

        Serie lost = new Serie("Lost", 2000); // Cria um novo objeto Serie passando nome e ano como parametro definido no construtor
        //lost.setNome("Lost"); // Define o nome da série
        //lost.setAnoDeLanamento(2000); // Define o ano de lançamento
        lost.exibeFichaTecnica(); // Exibe informações (duração será 0 até definir os valores)
        lost.setTemporadas(10); // Define 10 temporadas
        lost.setEpisodiosPorTemporada(10); // Define 10 episódios por temporada
        lost.setMinutosPorEpidosio(50); // Define 50 minutos por episódio
        System.out.println("Duração para maratonar série: " + lost.getDuracaoEmMinutos()); // Exibe a duração total (10 * 10 * 50 = 5000 minutos)

        CalculadoraTempo calculadora = new CalculadoraTempo(); // Cria uma calculadora de tempo
        calculadora.inclui(meuFilme); // Adiciona a duração do filme (180 minutos)
        System.out.println(calculadora.getTempoTotal()); // Exibe o tempo total acumulado (180)

        Filme outroFilme = new Filme("Avatar", 2019); // Cria outro objeto Filme
        //outroFilme.setNome("Avatar"); // Define o nome
        //outroFilme.anoDeLancamento(2019); // Define o ano
        outroFilme.setDuracaoEmMinutos(200); // Define a duração
        outroFilme.setIncluidoNoPlano(true); // Marca como incluído no plano

        calculadora.inclui(outroFilme); // Adiciona a duração do outro filme (200 minutos)
        System.out.println(calculadora.getTempoTotal()); // Exibe o tempo total acumulado (180 + 200 = 380)

        Episodio primeiro = new Episodio(); // Cria um novo objeto Episodio
        primeiro.setNumero(1); // Define o número do episódio
        primeiro.setSerie(lost); // Associa o episódio à série "Lost"
        primeiro.setTotalVizualizacao(300); // Define 300 visualizações

        FiltroRecomendacao filtro = new FiltroRecomendacao(); // Cria um filtro de recomendação
        filtro.filtrar(outroFilme); // Filtra outroFilme (sem avaliações, média 0, retorna "Coloque na sua lista")
        filtro.filtrar(primeiro); // Filtra o episódio (300 visualizações > 100, retorna "Está entre os preferidos")

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        //filmeDoPaulo.setNome("Dogville");
        //filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        //Array de filme = lista de filmes
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        //ver o tamanho do array
        System.out.println("Tamanho da lista " + listaDeFilmes.size());

        //buscar o primeiro filme da lista, mais o nome
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());

        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

        System.out.println(listaDeFilmes);

    }
}
