// Define o pacote onde essa classe (record) está localizada
package Livro;

// Declara um 'record' chamado Editora com dois campos: nome e cidade
// Records são usados para representar dados imutáveis de forma simples e concisa
public record Editora(String nome, String cidade) {
    // Como é um record, o compilador automaticamente gera:
    // - Construtor: Editora(String nome, String cidade)
    // - Métodos getters: nome(), cidade()
    // - Metodo toString(): exibe os dados no formato Editora[nome=..., cidade=...]
    // - equals() e hashCode(): para comparação e uso em coleções
}
