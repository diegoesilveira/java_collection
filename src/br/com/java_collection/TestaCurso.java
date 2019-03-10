package br.com.java_collection;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as collection", "Diego Silveira");

        javaColecoes.adiciona(new Aula("Dominando colecoes", 12));
        javaColecoes.adiciona(new Aula("List ArrayList", 22));
        javaColecoes.adiciona(new Aula("Linkedlist", 32));
        javaColecoes.adiciona(new Aula("Collection", 55));

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);
        System.out.println("----------------------------------");

        javaColecoes.adiciona(new Aula("Trabalhando com ArraysList", 40));





    }
}
