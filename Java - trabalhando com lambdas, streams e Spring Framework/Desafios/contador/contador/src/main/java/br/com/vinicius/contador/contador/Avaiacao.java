package br.com.vinicius.contador.contador;

import java.util.List;

// Declara a classe genérica Avaliacao, que pode trabalhar com qualquer tipo T
public class Avaiacao <T>{
    // Declara um atributo privado do tipo T (genérico) para armazenar o item avaliado
    private T item;
    // Declara um atributo privado do tipo double para armazenar a nota da avaliação
    private double nota;
    // Declara um atributo privado do tipo String para armazenar o comentário da avaliação
    private String comentario;

    // Metodo getter para o atributo item, retorna o item avaliado
    public T getItem() {
        return item;
    }

    // Metodo setter para o atributo item, define o item avaliado
    public void setItem(T item) {
        this.item = item; // Atribui o valor passado ao atributo item
    }

    // Metodo getter para o atributo nota, retorna a nota da avaliação
    public double getNota() {
        return nota;
    }

    // Metodo setter para o atributo nota, define a nota da avaliação
    public void setNota(double nota) {
        // Verifica se a nota está fora do intervalo permitido (0 a 10)
        if (nota < 0 || nota > 10) {
            // Lança uma exceção se a nota for inválida
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
        this.nota = nota; // Atribui o valor passado ao atributo nota
    }

    // Metodo getter para o atributo comentario, retorna o comentário da avaliação
    public String getComentario() {
        return comentario;
    }

    // Metodo setter para o atributo comentario, define o comentário da avaliação
    public void setComentario(String comentario) {
        this.comentario = comentario; // Atribui o valor passado ao atributo comentario
    }

    // Construtor da classe que inicializa os atributos item, nota e comentario
    public Avaiacao(T item, double nota, String comentario) {
        // Verifica se a nota está fora do intervalo permitido (0 a 10)
        if (nota < 0 || nota > 10) {
            // Lança uma exceção se a nota for inválida
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
        this.item = item; // Atribui o item passado ao atributo item
        this.nota = nota; // Atribui a nota passada ao atributo nota
        this.comentario = comentario; // Atribui o comentário passado ao atributo comentario
    }

    // Metodo estático genérico que calcula a média das notas de uma lista de avaliações
    public static <T> double calcularMediaNotas(List<Avaiacao<T>> avaliacoes) {
        // Verifica se a lista de avaliações está vazia
        if (avaliacoes.isEmpty()) {
            // Lança uma exceção se a lista estiver vazia
            throw new IllegalArgumentException("A lista de avaliações está vazia.");
        }
        double soma = 0; // Inicializa a variável soma para acumular as notas
        // Itera sobre cada avaliação na lista
        for (Avaiacao<T> avaliacao : avaliacoes) {
            soma += avaliacao.getNota(); // Adiciona a nota da avaliação à soma
        }
        // Calcula e retorna a média dividindo a soma pelo número de avaliações
        return soma / avaliacoes.size();
    }

    // Sobrescreve o metodo toString para fornecer uma representação em string do objeto
    @Override
    public String toString() {
        // Retorna uma string formatada com os valores dos atributos
        return "Avaliacao{" +
                "item=" + item + // Inclui o item
                ", nota=" + nota + // Inclui a nota
                ", comentario='" + comentario + '\'' + // Inclui o comentário entre aspas
                '}';
    }
}
