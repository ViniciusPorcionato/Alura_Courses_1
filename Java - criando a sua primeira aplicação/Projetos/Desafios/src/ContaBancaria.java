import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeCliente = "Vinicius Porcionato";
        String tipoConta = "Corrente";
        double valorConta = 2500.00;

        String dadosContaInicial = """
                ****************************
                Dados inicial do cliente:
                
                Nome Cliente:   %s
                Tipo de Conta:  %s
                Valor Atual:    %.2f
                ****************************
                """.formatted(nomeCliente, tipoConta, valorConta);

        System.out.println(dadosContaInicial);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println(
                    """
                            Operações
                            
                            1- Consultar saldos
                            2- Receber valor
                            3- Transferir valor
                            4- Sair
                            
                            Digite a opção desejada:
                            """
            );

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo em conta: %.2f", valorConta);
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja receber: ");
                    double valorReceber = sc.nextDouble();
                    valorConta += valorReceber;
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");
                    double valorTransferir = sc.nextDouble();
                    if (valorTransferir > valorConta){
                        System.out.println("Valor a transferir maior que valor em conta");
                    }
                    valorConta -=valorTransferir;
                    break;
            }
        }


    }
}
