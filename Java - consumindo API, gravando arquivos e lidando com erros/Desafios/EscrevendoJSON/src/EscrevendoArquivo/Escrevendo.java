package EscrevendoArquivo;

import java.io.FileWriter;
import java.io.IOException;

public class Escrevendo {
    public static void main(String[] args){
        String conteudo = "Conteúdo a ser gravado no arquivo.";
        try (FileWriter escrita = new FileWriter("arquivo.txt")) {
            escrita.write(conteudo);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
