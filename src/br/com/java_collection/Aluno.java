package br.com.java_collection;

public class Aluno implements Comparable<Aluno>{

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "Aluno { " +
                "Nome= '" + nome + '\'' +
                ", Numero Matricula= " + numeroMatricula +
                '}';
    }

    @Override
    public int compareTo(Aluno outroAluno) {
        return this.nome.compareTo(outroAluno.nome);
    }
}
