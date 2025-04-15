package br.com.vinicius.screenmatch3.modelos;

public class Titulo implements Comparable<Titulo> {
    private String nome; // Armazena o nome do título (filme ou série), privado para encapsulamento
    private int anoDeLancamento; // Ano de lançamento do título
    private boolean incluidoNoPlano; // Indica se o título está incluído em um plano (ex.: assinatura)
    private int duracaoEmMinutos; // Duração total em minutos do título

    // Modificador private impede acesso direto aos atributos fora da classe
    private double somaAvaliacao; // Soma acumulada das avaliações recebidas
    private int totalAvaliacao; // Contador do número de avaliações

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    // Setter: Define o nome do título
    public void setNome(String nome) {
        this.nome = nome; // "this" referencia o atributo da instância, evitando confusão com o parâmetro
    }

    // Setter: Define o ano de lançamento
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    // Setter: Define se o título está incluído no plano
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    // Setter: Define a duração em minutos
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Getter: Retorna o nome do título
    public String getNome() {
        return nome;
    }

    // Getter: Retorna o ano de lançamento
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    // Getter: Retorna se está incluído no plano (usa "is" por ser boolean, convenção Java)
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    // Getter: Retorna a duração em minutos
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    // Getter: Retorna o total de avaliações
    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    // Metodo: Exibe informações básicas do título no console
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração em Minutos: " + duracaoEmMinutos);
    }

    // Metodo: Adiciona uma nova avaliação ao título
    public void avalia(double nota) {
        somaAvaliacao += nota; // Acumula a nota na soma total
        totalAvaliacao++; // Incrementa o contador de avaliações
    }

    // Metodo: Calcula e retorna a média das avaliações
    public double obterMedia() {
        return somaAvaliacao / totalAvaliacao; // Retorna a média (pode gerar erro se totalAvaliacao for 0)
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
