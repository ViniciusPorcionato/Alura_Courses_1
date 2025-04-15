package Pessoa;

// Aqui estamos declarando um 'record' chamado Pessoa.
// Um 'record' é uma forma simplificada de criar classes imutáveis que apenas armazenam dados.
// Ele automaticamente gera o construtor, os métodos getters, equals, hashCode e toString.
public record Pessoa(String nome, int idade, String cidade) {
    // Este bloco está vazio porque não precisamos escrever nada manualmente.
    // O Java já cria automaticamente os métodos:
    // - Construtor: Pessoa(String nome, int idade, String cidade)
    // - Getters: nome(), idade(), cidade()
    // - toString(): retorna algo como "Pessoa[nome=João, idade=30, cidade=São Paulo]"
    // - equals() e hashCode(): para comparar objetos e usar em coleções
}
