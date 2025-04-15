
public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    //construtor criado pegando os valores da classe mãe Produto para inicializar os atributos com valores herdados
    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}
