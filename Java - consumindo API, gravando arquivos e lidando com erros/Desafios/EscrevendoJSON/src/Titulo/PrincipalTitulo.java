package Titulo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalTitulo {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Minecraft", 2025, "Aventura");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo1);

        System.out.println(json);
    }
}
