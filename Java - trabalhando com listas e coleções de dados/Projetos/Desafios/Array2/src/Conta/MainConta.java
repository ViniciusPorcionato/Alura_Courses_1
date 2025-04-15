package Conta;

import java.util.ArrayList;

public class MainConta {
    public static void main(String[] args) {

        // Criação de três objetos ContaBancaria com número da conta e saldo inicial
        ContaBancaria conta1 = new ContaBancaria(101, 1500.0);
        ContaBancaria conta2 = new ContaBancaria(102, 2500.0);
        ContaBancaria conta3 = new ContaBancaria(103, 1800.0);

        // Criação de uma lista para armazenar as contas bancárias
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1); // Adiciona a conta1 à lista
        listaContas.add(conta2); // Adiciona a conta2 à lista
        listaContas.add(conta3); // Adiciona a conta3 à lista

        // Inicializa a variável com a primeira conta da lista para comparação
        ContaBancaria contaMaiorSaldo = listaContas.get(0);

        // Percorre a lista de contas para encontrar a que tem o maior saldo
        for (ContaBancaria conta : listaContas){
            // Compara o saldo da conta atual com o saldo da conta armazenada como maior
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                // Se o saldo da conta atual for maior, atualiza a referência
                contaMaiorSaldo = conta;
            }
        }

        // Exibe o número e o saldo da conta com o maior saldo
        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }

}
