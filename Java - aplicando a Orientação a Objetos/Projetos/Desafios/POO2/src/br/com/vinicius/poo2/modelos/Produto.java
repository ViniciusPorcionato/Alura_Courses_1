package br.com.vinicius.poo2.modelos;

public class Produto {

    private String nome;
    private double preco;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public void aplicarDesconto(){
        double precoDesconto;
        System.out.println("Produto com 10% de desconto: " + (precoDesconto = preco + (preco * 0.10)));
    }

}
