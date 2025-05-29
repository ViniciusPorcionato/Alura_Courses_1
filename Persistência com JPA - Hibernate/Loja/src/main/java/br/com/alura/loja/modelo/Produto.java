package br.com.alura.loja.modelo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

// Indica que essa classe é uma entidade JPA, ou seja, será mapeada para uma tabela do banco de dados.
@Entity
// Define o nome da tabela no banco de dados como "produtos".
@Table(name = "produtos")
public class Produto {



    public Produto(String nome,String descricao,BigDecimal preco, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Produto() {
    }

    // Indica que o campo 'id' é a chave primária da entidade.
    @Id
    // Define que o valor do 'id' será gerado automaticamente pelo banco de dados,
    // seguindo a estratégia de auto incremento (IDENTITY).
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private LocalDate dataCadastro = LocalDate.now();

    // Indica um relacionamento muitos-para-um entre Produto e Categoria,
    // ou seja, muitos produtos podem pertencer a uma mesma categoria.
    @ManyToOne
    private Categoria categoria;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
