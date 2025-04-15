package br.com.vinicius.poo3.modelos;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.setModelo("Dodge Ram");
        meuCarro.setPrecos(1000000.00, 2000000.00, 3000000.00);
        meuCarro.exibirInfo();
    }
}
