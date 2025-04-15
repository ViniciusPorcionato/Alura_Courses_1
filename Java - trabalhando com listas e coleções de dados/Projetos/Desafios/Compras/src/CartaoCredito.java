// Importa a classe ArrayList da biblioteca java.util para usar listas dinâmicas
import java.util.ArrayList;
// Importa a interface List da biblioteca java.util
import java.util.List;

// Declaração da classe CartaoCredito
public class CartaoCredito {
    // Atributo que armazena o limite total do cartão
    private double limite;
    // Atributo que armazena o saldo disponível (quanto ainda pode ser usado)
    private double saldo;
    // Lista de compras realizadas com o cartão
    private List<Compra> compras;

    // Construtor da classe, que recebe o limite inicial do cartão
    public CartaoCredito(double limite) {
        this.limite = limite; // Define o limite do cartão
        this.saldo = limite;  // No início, o saldo disponível é igual ao limite
        this.compras = new ArrayList<>(); // Inicializa a lista de compras como vazia
    }

    // Metodo que tenta lançar uma nova compra no cartão
    public boolean lancaCompra(Compra compra){
        // Verifica se há saldo suficiente para realizar a compra
        if (this.saldo > compra.getValor()){
            this.saldo -= compra.getValor(); // Deduz o valor da compra do saldo disponível
            this.compras.add(compra);        // Adiciona a compra à lista de compras realizadas
            return true;                     // Retorna true indicando que a compra foi aprovada
        }else{
            return false;                    // Retorna false indicando que a compra foi recusada
        }
    }

    // Metodo getter para obter o limite do cartão
    public double getLimite() {
        return limite;
    }

    // Metodo getter para obter o saldo disponível
    public double getSaldo() {
        return saldo;
    }

    // Metodo getter para obter a lista de compras realizadas
    public List<Compra> getCompras() {
        return compras;
    }
}
