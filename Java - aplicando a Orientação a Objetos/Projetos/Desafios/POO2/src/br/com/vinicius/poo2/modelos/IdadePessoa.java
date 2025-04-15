package br.com.vinicius.poo2.modelos;

public class IdadePessoa {

    private String nome;
    private int idade;

    //Setter
    public void setNome(String nome){
        this.nome = nome;
    }

    //Setter
    public void setIdade(int idade){
        this.idade = idade;
    }

    //Getter
    public String getNome(){
        return nome;
    }

    //Getter
    public int getIdade(){
        return idade;
    }

    //Metodo para verificar idade
    public void verificaIdade(int idade){
        if (idade >= 18){
            System.out.println("Maior de Idade");
        }else{
            System.out.println("Menor de Idade");
        }
    }

}
