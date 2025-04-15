import br.com.vinicius.screenmatch2.calculo.CalculadoraTempo;
import br.com.vinicius.screenmatch2.calculo.FiltroRecomendacao;
import br.com.vinicius.screenmatch2.modelos.Episodio;
import br.com.vinicius.screenmatch2.modelos.Filme;
import br.com.vinicius.screenmatch2.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // Cria um novo objeto Filme

        // Define valores usando setters
        meuFilme.setNome("O Poderoso Chefão"); // Define o nome do filme
        meuFilme.setAnoDeLanamento(1970); // Define o ano de lançamento
        meuFilme.setDuracaoEmMinutos(180); // Define a duração em minutos
        meuFilme.setIncluidoNoPlano(true); // Marca como incluído no plano

        // Chama getters (sem usar os valores retornados diretamente aqui)
        meuFilme.getNome();
        meuFilme.getAnoDeLanamento();
        meuFilme.getDuracaoEmMinutos();
        meuFilme.isIncluidoNoPlano();

        meuFilme.exibeFichaTecnica(); // Exibe as informações do filme no console
        meuFilme.avalia(8.5); // Adiciona uma avaliação de 8.5
        meuFilme.avalia(7.3); // Adiciona uma avaliação de 7.3
        meuFilme.avalia(9.6); // Adiciona uma avaliação de 9.6

        System.out.println("Média de avaliações: " + meuFilme.obterMedia()); // Exibe a média (8.47)
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacao()); // Exibe o total de avaliações (3)

        Serie lost = new Serie(); // Cria um novo objeto Serie
        lost.setNome("Lost"); // Define o nome da série
        lost.setAnoDeLanamento(2000); // Define o ano de lançamento
        lost.exibeFichaTecnica(); // Exibe informações (duração será 0 até definir os valores)
        lost.setTemporadas(10); // Define 10 temporadas
        lost.setEpisodiosPorTemporada(10); // Define 10 episódios por temporada
        lost.setMinutosPorEpidosio(50); // Define 50 minutos por episódio
        System.out.println("Duração para maratonar série: " + lost.getDuracaoEmMinutos()); // Exibe a duração total (10 * 10 * 50 = 5000 minutos)

        CalculadoraTempo calculadora = new CalculadoraTempo(); // Cria uma calculadora de tempo
        calculadora.inclui(meuFilme); // Adiciona a duração do filme (180 minutos)
        System.out.println(calculadora.getTempoTotal()); // Exibe o tempo total acumulado (180)

        Filme outroFilme = new Filme(); // Cria outro objeto Filme
        outroFilme.setNome("Avatar"); // Define o nome
        outroFilme.setAnoDeLanamento(2019); // Define o ano
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
    }
}