package br.com.java_collection;

public class TestaCursoComAluno {

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

        System.out.println("Alunos Matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        Aluno diego = new Aluno("Diego Silveira" , 789613);
        System.out.println("a1 equals diego");
        System.out.println(a1.equals(diego));
        System.out.println("a1 hasCode diego");
        System.out.println(a1.hashCode() == diego.hashCode());
        System.out.println("a1 == diego");
        System.out.println(a1 == diego);


    }
}
