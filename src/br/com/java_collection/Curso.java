package br.com.java_collection;

import java.util.*;

public class Curso {


    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new TreeSet<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public String getNome() {
        return nome;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno a1){
        return this.alunos.contains(a1);
    }


    @Override
    public String toString() {
        return "Curso: {" +
                "nome= '" + nome + '\'' +
                ", instrutor= '" + instrutor + '\'' +
                ", aulas= " + aulas +
                '}';
    }
}

