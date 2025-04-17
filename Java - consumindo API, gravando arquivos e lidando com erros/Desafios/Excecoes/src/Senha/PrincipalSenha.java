package Senha;

import java.util.Scanner;

public class PrincipalSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String tentativaSenha = sc.nextLine();

        try{
           validarSenha(tentativaSenha);
            System.out.println("Senha inválida. Acesso permitido!");
        }catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }

    private static void validarSenha(String senha){
        if (senha.length() < 8){
            throw new SenhaInvalidaException("A senha deve conter pelo menos 8 caracteres");
        }
    }
}
