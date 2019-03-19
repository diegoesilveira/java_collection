package br.com.java_collection;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso ("Dominando as colecoes do java", "Diego Silveira");

        Aluno a1 = new Aluno("Diego Silveira", 143454);
        Aluno a2 = new Aluno("Jessika", 5484 );
        Aluno a3 = new Aluno("Joao Pedro", 78912 );
        Aluno a4 = new Aluno("Victor Hugo", 78512 );
        Aluno a5 = new Aluno("Silveira", 321456 );
        Aluno a6 = new Aluno("Evaldt", 4569842 );

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);
        javaColecoes.matricula(a5);
        javaColecoes.matricula(a6);

        Aluno aluno = javaColecoes.buscaMatriculado(78912);
        System.out.println("aluno: "+aluno);
    }
}
