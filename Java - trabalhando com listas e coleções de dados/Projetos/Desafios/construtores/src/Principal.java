import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        //objeto criado sem passar nenhum parametro no construtor
        Produto produto1 = new Produto();
        produto1.Produto("Bis", 5.99, 5);

        Produto produto2 = new Produto();
        produto2.Produto("Bala Fini", 5.99, 5);

        Produto produto3 = new Produto();
        produto3.Produto("KitKat", 5.99, 5);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Primeiro produto da lista: " + listaDeProdutos.get(0).getNome());

        System.out.println(listaDeProdutos.toString());

        //Objeto criado passando parametros requisitados no construtor
        Produto novoProduto = new Produto("Trento", 2.99, 5);

        //Objeto da classe ProdutoPerecivel, herdando os valores do construtor da classe mãe Produto, passando como parametro para criação do objeto, no construtor
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");


    }
}
