package br.com.alura.domain;

public class Pet {
    private String tipo;
    private String nome;
    private String raca;
    private Integer idade;
    private String cor;
    private Float peso;
    private Long id;

    public Pet(String tipo, String nome, String raca, Integer idade, String cor, Float peso) {
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    public Pet() {
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public Long getId() {
        return id;
    }

    public Integer getIdade() {
        return idade;
    }
}
