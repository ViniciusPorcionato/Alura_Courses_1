package br.com.vinicius.audio.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto de preferido por todas !");
        }else{
            System.out.println(audio.getTitulo() + " uma excelente opção para que seja ouvido mais tarde");
        }
    }
}
