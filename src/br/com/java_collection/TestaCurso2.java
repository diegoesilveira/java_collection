package br.com.java_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Trabalhando com ArrarList", "Diego Silveira");
        System.out.println(javaColecoes);

        javaColecoes.adiciona(new Aula("Java 8 Collection", 12));
        javaColecoes.adiciona(new Aula("Aumentando nosso conhecimento", 19));
        javaColecoes.adiciona(new Aula("Dominando java 8", 50));
        javaColecoes.adiciona(new Aula("Boa aula", 15));

        System.out.println("---------------------------------------------------------------");
        System.out.println(javaColecoes);
        System.out.println("---------------------------------------------------------------");

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);
        System.out.println("---------------------------------------------------------------");

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println("---------------------------------------------------------------");




    }

}
