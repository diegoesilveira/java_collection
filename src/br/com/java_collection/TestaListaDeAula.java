package br.com.java_collection;

import java.util.ArrayList;

public class TestaListaDeAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando arraylist", 21);
        Aula a2 = new Aula("Lista de objetos", 35);
        Aula a3 = new Aula("Lista de objetos", 41);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
    }


}
