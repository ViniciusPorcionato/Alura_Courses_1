package Senha;

public class SenhaInvalidaException extends RuntimeException {
    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
