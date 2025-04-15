// Declaração da classe Compra que implementa a interface Comparable
public class Compra implements Comparable<Compra> {

    // Atributo que armazena a descrição da compra (ex: "Mercado", "Gasolina")
    private String descricao;

    // Atributo que armazena o valor da compra
    private double valor;

    // Construtor da classe, recebe a descrição e o valor da compra
    public Compra(String descricao, double valor) {
        this.descricao = descricao; // Inicializa a descrição da compra
        this.valor = valor;         // Inicializa o valor da compra
    }

    // Metodo getter que retorna a descrição da compra
    public String getDescricao() {
        return descricao;
    }

    // Metodo getter que retorna o valor da compra
    public double getValor() {
        return valor;
    }

    // Sobrescreve o metodo toString para retornar uma representação textual da compra
    @Override
    public String toString() {
        // Retorna uma string com a descrição e o valor da compra
        return "Compra: " + "descricao ='" + descricao + '\'' +
                "valor = " + valor;
    }

    // Sobrescreve o metodo compareTo da interface Comparable
    // Permite comparar duas compras com base no valor
    @Override
    public int compareTo(Compra outraCompra) {
        // Usa o metodo compareTo da classe Double para comparar os valores das compras
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
