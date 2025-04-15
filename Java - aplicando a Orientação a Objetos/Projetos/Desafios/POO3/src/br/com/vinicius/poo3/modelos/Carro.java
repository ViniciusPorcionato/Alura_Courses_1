package br.com.vinicius.poo3.modelos;

public class Carro {
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecos(double preco1, double preco2, double preco3) {
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }


    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + preco1);
        System.out.println("Preço Ano 2: " + preco2);
        System.out.println("Preço Ano 3: " + preco3);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

    private double calcularMenorPreco() {
        double menorPreco = preco1;
        if (preco2 < menorPreco) {
            menorPreco = preco2;
        }else{
            menorPreco = preco3;
        }

        return  menorPreco;
    }

    private double calcularMaiorPreco(){
        double maiorPreco = preco1;
        if (preco2 > maiorPreco){
            maiorPreco = preco2;
        }else{
            maiorPreco = preco3;
        }

        return maiorPreco;
    }
}
