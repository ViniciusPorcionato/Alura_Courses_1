import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Vinicius Porcionato");
        pessoa1.setIdade(19);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Catarina Sayuri Arashiro Braga Felipe");
        pessoa2.setIdade(17);

        Pessoa pessoa3 = new Pessoa();
        pessoa2.setNome("Vitor Porcionato");
        pessoa2.setIdade(19);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas.toString());
    }
}
