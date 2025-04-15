package br.com.vinicius.screenmatch4.principal;

import br.com.vinicius.screenmatch4.modelos.Filme;
import br.com.vinicius.screenmatch4.modelos.Serie;
import br.com.vinicius.screenmatch4.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Carros", 1995);
        Filme filme2 = new Filme("Como Treinar seu Dragão", 2003);
        Filme filme3 = new Filme("Minecraft", 2025);

        Serie serie1 = new Serie("Game of Thrones", 2011);
        Serie serie2 = new Serie("The Chosen", 2017);
        Serie serie3 = new Serie("Reacher", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);
        lista.add(serie2);
        lista.add(serie3);

        //Rodar cada item dentro do array lista, do tipo Titulo
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            //verifica se o item é um filme
            if (item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Vinicius Porcionato");
        buscaPorArtista.add("Adam Sandle");
        buscaPorArtista.add("Geisa Porcionato");
        System.out.println(buscaPorArtista);

        //Ordernar a lista buscaPorArtistas por ordem alfabetica
        Collections.sort(buscaPorArtista);

        //Ordernar a lista com todos os filmes e series com Comparable implementado na classe Titulo
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);

        //Listar os Titulos usando o Comparator.comparing, para ordernar usando a datadeLancamento
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
