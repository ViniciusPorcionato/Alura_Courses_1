import br.com.vinicius.poo2.modelos.ContaBancaria;
import br.com.vinicius.poo2.modelos.IdadePessoa;

public class Principal {
    public static void main(String[] args) {
        //Classe ContaBancaria
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Vinicius Porcionato");
        conta.setNumeroConta(123456789);
        conta.setSaldo(199999.99);

        conta.getTitular();
        conta.getNumeroConta();
        conta.getSaldo();

        //Classe IdadePessoa
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Vinicius Porcionato");
        pessoa.setIdade(19);
        pessoa.getNome();
        pessoa.getIdade();
        pessoa.verificaIdade(19);
    }
}
