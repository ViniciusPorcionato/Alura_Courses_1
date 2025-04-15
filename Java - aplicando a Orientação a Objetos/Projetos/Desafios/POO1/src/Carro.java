public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("Modelo Carro: " + modelo);
        System.out.println("Ano Carro: " + ano);
        System.out.println("Cor Carro: " + cor);
    }

    void caulcularIdadeCarro(){
        System.out.println("O carro possui: " + (2025 - ano));
    }
}
