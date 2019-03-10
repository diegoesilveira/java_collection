package br.com.java_collection;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Joao");
        alunos.add("Victor");
        alunos.add("Jessika");
        alunos.add("Diego");
        alunos.add("Silveira");
        alunos.add("Evaldt");
        alunos.add("Santos");
        alunos.add("Diego");

        System.out.println(alunos.size());
        System.out.println("-------------------------------------");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println("-------------------------------------");
        System.out.println(alunos.contains("Joao"));
        System.out.println("-------------------------------------");

        List<String> aluno = new ArrayList<>(alunos);
        System.out.println(aluno);
        Collections.sort(aluno);
        System.out.println(aluno);
        System.out.println("-------------------------------------");

        System.out.println(aluno.indexOf("Diego"));
        System.out.println(aluno.indexOf("Victor"));
        System.out.println(aluno.get(5));
        System.out.println(aluno.remove(4));
        System.out.println(aluno);

    }
}
