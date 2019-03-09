package br.com.java_collection;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando arraylist", 21);
        Aula a2 = new Aula("Lista de objetos", 35);
        Aula a3 = new Aula("Aumentando nosso conhecimento", 41);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
        System.out.println(aulas.get(0));

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println("--------------------------------------------------------------");

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
        System.out.println("---------------------------------------------");
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
    }


}
