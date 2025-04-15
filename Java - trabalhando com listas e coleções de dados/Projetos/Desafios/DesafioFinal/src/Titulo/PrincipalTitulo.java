package Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalTitulo {
    public static void main(String[] args) {

        Titulo t1 = new Titulo("TituloA");
        Titulo t2 = new Titulo("TituloB");
        Titulo t3 = new Titulo("TituloC");
        Titulo t4 = new Titulo("TituloD");
        Titulo t5 = new Titulo("TituloE");


        ArrayList<Titulo> listaTitulo = new ArrayList<>();
        listaTitulo.add(t1);
        listaTitulo.add(t2);
        listaTitulo.add(t3);
        listaTitulo.add(t4);
        listaTitulo.add(t5);
        Collections.sort(listaTitulo);
        System.out.println(listaTitulo);
    }
}
