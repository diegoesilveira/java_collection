package br.com.java_collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String lista1 = "Brincando com listas";
        String lista2 = "Modelando listas";
        String lista3 = "Trabalhando com Sets";
        String lista4 = "Aumentando conhecimento";
        String lista5 = "Conhecendo ArrayList";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(lista1);
        aulas.add(lista2);
        aulas.add(lista3);
        aulas.add(lista4);
        aulas.add(lista5);

        System.out.println(aulas);
        aulas.remove(0);
        System.out.println(aulas);
        System.out.println("------------------------------------------------");

        for (String aula: aulas){
            System.out.println(aula);

        }
        System.out.println("------------------------------------------------");
        System.out.println(aulas.get(0));
        System.out.println(aulas.size());

        aulas.forEach(aula -> {
            System.out.println("Percorrendo: " +aula);
        });

        System.out.println("------------------------------------------------");
        Collections.sort(aulas);
        System.out.println(aulas);


    }
}
