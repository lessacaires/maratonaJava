package br.com.abc.javacore.introducaometodos.classes;

/**
 * Created by User on 15/08/2021.
 */
public class Estudante {
    private String nome;
    private int idade;
    private String matricula;
    private double[] notas;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public double[] getNotas(){
        return this.notas;
    }

    public void imprimeAluno(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Matrícula: "+this.getMatricula());
        System.out.print("Notas: ");
        if(this.getNotas() != null){
           for (double nota : this.getNotas()) {
                System.out.print(nota + " ");
            }
        }
    }

    public void imprimeMedia(){
        if(this.notas == null){
            System.out.println("Aluno não possui notas no período. \nSituação: Reprovado");
            return;
        }
        double media = 0;
        for(double nota : notas ){
            media += nota;
        }

        media = media / this.getNotas().length;
        if(media < 6){
            System.out.println("\nMédia: "+media+" \nSituação: Reprovado");
        }else {
            System.out.println("\nMédia: "+media+" \nSituação: Aprovado");
        }
    }

}
