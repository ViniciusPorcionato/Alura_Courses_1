package br.com.vinicius.poo2.modelos;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private String titular;

    //Setter
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    //Setter
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //Setter
    public void setTitular(String titular){
        this.titular = titular;
    }

    //Getter
    public int getNumeroConta() {
        return numeroConta;
    }

    //Getter
    public double getSaldo(){
        return  saldo;
    }

    //Getter
    public String getTitular(){
        return titular;
    }
}
