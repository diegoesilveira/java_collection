package br.com.java_collection;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Curso Collection", "Diego Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com Set", 20));
        javaColecoes.adiciona(new Aula("Trabalhando com HashSet", 20));
        javaColecoes.adiciona(new Aula("Criando uma aula com Set", 20));
        javaColecoes.adiciona(new Aula("Modelando aula com Set", 20));
        javaColecoes.adiciona(new Aula("Entendendo o Set", 20));

        Aluno a1 = new Aluno("Diego", 23454);
        Aluno a2 = new Aluno("Jessika", 28125);
        Aluno a3 = new Aluno("Joao", 48626);
        Aluno a4 = new Aluno("Victor", 7891);
        Aluno a5 = new Aluno("Diego Silveira", 234541);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);
        javaColecoes.matricula(a5);

        System.out.println("Alunos matriculados:");
        javaColecoes.getAlunos().forEach(a-> {
            System.out.println(a);
        });

        System.out.println("--------------------------------------------");

        System.out.println("O aluno está matriculado? " +javaColecoes.estaMatriculado(a1));

//        System.out.println(alunos.size());
//        System.out.println("-------------------------------------");
//        for (String aluno : alunos) {
//            System.out.println(aluno);
//        }
//        System.out.println("-------------------------------------");
//        System.out.println(alunos.contains("Joao"));
//        System.out.println("-------------------------------------");
//
//        List<String> aluno = new ArrayList<>(alunos);
//        System.out.println(aluno);
//        Collections.sort(aluno);
//        System.out.println(aluno);
//        System.out.println("-------------------------------------");
//
//        System.out.println(aluno.indexOf("Diego"));
//        System.out.println(aluno.indexOf("Victor"));
//        System.out.println(aluno.get(5));
//        System.out.println(aluno.remove(4));
//        System.out.println(aluno);

    }
}
