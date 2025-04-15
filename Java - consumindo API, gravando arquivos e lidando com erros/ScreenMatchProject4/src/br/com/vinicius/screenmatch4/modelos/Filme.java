package br.com.vinicius.screenmatch4.modelos;

import br.com.vinicius.screenmatch4.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String Diretor; // Atributo específico: nome do diretor do filme

    //construtor passando nome e ano de lancamento como parametro
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    // Getter: Retorna o nome do diretor
    public String getDiretor() {
        return Diretor;
    }


    // Setter: Define o nome do diretor
    public void setDiretor(String diretor) {
        Diretor = diretor; // Atribui o valor do parâmetro ao atributo
    }

    @Override // Implementa o metodo da interface Classificavel
    public int getClassificacao() {
        return (int) obterMedia() / 2; // Retorna a média das avaliações dividida por 2, convertida para inteiro
    }

    //Reescrita do metodo toString
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "( " + this.getAnoDeLancamento() + " )";
    }
}
