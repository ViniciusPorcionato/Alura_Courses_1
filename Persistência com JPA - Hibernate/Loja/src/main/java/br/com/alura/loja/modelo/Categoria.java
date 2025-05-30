package br.com.alura.loja.modelo;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {

    public Categoria() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
