package br.com.vinicius.screenmatch4.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {

    private String mensagem;

    public ErroDeConversaoDeAnoException(String mensage) {
        this.mensagem = mensage;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
