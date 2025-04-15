package Produto;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {
        //Cria um novo objeto da classe Produto.Produto, passando nome e valor no construtor
        Produto produto1 = new Produto("KitKat", 4.99);
        Produto produto2 = new Produto("BIS", 3.99);
        Produto produto3 = new Produto("Sneckers", 2.99);

        //Array de lista de produtos
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        //Adiciona os objetos criados na lista
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        //variavel para somar os valores dos produtos
        double somaPrecos = 0;

        //loop para percorrer dentro do array, acrescentando na variavel somaPrecos os valores de cada objeto
        for (Produto item: listaProdutos){
            somaPrecos += item.getPreco();
        }

        //variavel para pegar o valor da soma dos precos dos produtos e dividir pela quantidade de produtos na lista, para tirar a media de valores
        double precoMedio = somaPrecos / listaProdutos.size();
        //print do valor medio
        System.out.println("Preço médio dos produtos: " + precoMedio);
    }
}
