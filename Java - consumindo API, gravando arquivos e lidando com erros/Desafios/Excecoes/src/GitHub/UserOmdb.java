// Define o pacote onde essa classe está localizada
package GitHub;

// Declara um "record" chamado UserOmdb, que é uma forma simplificada de criar classes imutáveis em Java
// Essa estrutura define automaticamente os atributos, construtor, getters, equals, hashCode e toString
public record UserOmdb(
        String name,         // Nome do usuário
        String avatar_url,   // URL do avatar (imagem de perfil)
        int id,              // ID numérico do usuário
        String type,         // Tipo do usuário (por exemplo, "User" ou "Organization")
        String bio           // Biografia do usuário
) {
}
