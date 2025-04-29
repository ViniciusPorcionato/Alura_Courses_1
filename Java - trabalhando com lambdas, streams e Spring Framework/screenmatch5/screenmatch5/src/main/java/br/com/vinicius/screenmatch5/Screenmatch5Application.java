// Define o pacote base da aplicação
package br.com.vinicius.screenmatch5;

// Importa a classe Principal para executar o menu interativo
import br.com.vinicius.screenmatch5.principal.Principal;
// Importa a interface CommandLineRunner para executar código após a inicialização do Spring Boot
import org.springframework.boot.CommandLineRunner;
// Importa a classe SpringApplication para iniciar a aplicação Spring Boot
import org.springframework.boot.SpringApplication;
// Importa a anotação @SpringBootApplication para configurar a aplicação Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marca a classe como uma aplicação Spring Boot, habilitando configurações automáticas
@SpringBootApplication
// Declara a classe principal da aplicação, implementando CommandLineRunner para executar código após a inicialização
public class Screenmatch5Application implements CommandLineRunner {

    // Metodo main, ponto de entrada da aplicação
    public static void main(String[] args) {
        // Inicia a aplicação Spring Boot, passando a classe principal e os argumentos da linha de comando
        SpringApplication.run(Screenmatch5Application.class, args);
    }

    // Metodo sobrescrito da interface CommandLineRunner, executado após a inicialização do Spring Boot
    @Override
    public void run(String... args) throws Exception {
        // Cria uma instância da classe Principal
        Principal princiapal = new Principal();
        // Chama o metodo exibeMenu para iniciar o menu interativo no console
        princiapal.exibeMenu();
    }
}