// Define o pacote onde essa classe (record) está localizada
package Livro;

// Declara um 'record' chamado Livro com três campos:
// - titulo: o título do livro (String)
// - autor: o autor do livro (String)
// - editora: um objeto do tipo Editora (que é outro record)
public record Livro(String titulo, String autor, Editora editora) {
    // Assim como nos outros records, o Java gera automaticamente:
    // - Construtor: Livro(String titulo, String autor, Editora editora)
    // - Getters: titulo(), autor(), editora()
    // - toString(): exibe o conteúdo do objeto no formato:
    //   Livro[titulo=..., autor=..., editora=Editora[nome=..., cidade=...]]
    // - equals() e hashCode(): para comparação e uso em coleções
}
