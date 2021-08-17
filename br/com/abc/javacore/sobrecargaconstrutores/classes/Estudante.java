package br.com.abc.javacore.sobrecargaconstrutores.classes;

/**
 * Created by User on 16/08/2021.
 */
public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula){
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
    }

    public Estudante(){
        System.out.println("Contrutor Default");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void imprimeEstudante(){
        System.out.println(this.matricula);
        System.out.println(this.nome);
        for(double nota : notas){
            System.out.println(nota);
        }
        System.out.println(this.dataMatricula);
    }
}
