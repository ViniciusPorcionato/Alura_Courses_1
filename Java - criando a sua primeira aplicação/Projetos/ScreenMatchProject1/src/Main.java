//Nome de classe padrão Pascal Case
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");

        //tipo de dado | nome da variavel | atribuição | valor
        //nome variavel = escrever em camel case
        int ano = 2022;
        System.out.println(ano);

        int anoLancamento;
        anoLancamento = 2022;
        //Concatenação
        System.out.println("Ano do lançamento : " + anoLancamento);

        boolean incluidoNoPlano = true;

        double notaDoFilme = 8.2;

        double mediaNotaFIlme = (9.8 + 6.5 + 10) / 3;
        System.out.println(mediaNotaFIlme);

        //String
        String nomeDoFilme = "Top Gun: Maverick";

        //Text block
        String sinopse = """
                Filme Top Gun
                Filme de aventura
                Muito bom !
                Ano de lançamento
                """ + anoLancamento;

        int classificao;
        //trasnformando a variavel media(double) para int
        classificao = (int) (mediaNotaFIlme/2);

    }
}