// Importa a classe Collections para ordenar a lista de compras
import java.util.Collections;
// Importa a classe Scanner para ler dados do usuário
import java.util.Scanner;

// Classe principal que contém o metodo main
public class Principal {
    public static void main(String[] args) {    
        // Cria um objeto Scanner para entrada de dados pelo teclado
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário o limite do cartão
        System.out.println("Digite o limite do cartão: ");
        double limite = sc.nextDouble(); // Lê o limite informado
        CartaoCredito cartao = new CartaoCredito(limite); // Cria um novo cartão com esse limite

        // Variável de controle para o loop
        int sair = 1;

        // Enquanto o usuário não decidir sair (ou não tiver saldo)
        while (sair != 0){
            sc.nextLine(); // Consome a quebra de linha pendente do nextDouble anterior

            // Solicita a descrição da compra
            System.out.println("Digite a descrição da compra: ");
            String descricao = sc.nextLine(); // Lê a descrição

            // Solicita o valor da compra
            System.out.println("Digite o valor da compra: ");
            double valor = sc.nextDouble(); // Lê o valor

            // Cria um novo objeto Compra com os dados informados
            Compra compra = new Compra(descricao, valor);

            // Tenta realizar a compra no cartão
            boolean compraRealizada = cartao.lancaCompra(compra);

            // Verifica se a compra foi realizada com sucesso
            if (compraRealizada){
                System.out.println("Compra realizada com sucesso! ");
                // Pergunta se o usuário deseja continuar ou sair
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                sair = sc.nextInt(); // Atualiza o valor de controle do loop
            }else{
                // Caso o saldo seja insuficiente, avisa o usuário e encerra o loop
                System.out.println("Saldo insuficiente");
                sair = 0;
            }

            // Mostra um resumo das compras feitas até agora
            System.out.println("***************************");
            System.out.println("Compras Realizadas: \n");

            // Ordena a lista de compras pelo valor (ordem crescente)
            Collections.sort(cartao.getCompras());

            // Imprime cada compra (descrição + valor)
            for (Compra c : cartao.getCompras()){
                System.out.println(c.getDescricao() + " - " + c.getValor());
            }

            System.out.println("***************************");

            // Mostra o saldo restante no cartão
            System.out.println("\nSAldo do cartão: " + cartao.getSaldo());
        }
    }
}
