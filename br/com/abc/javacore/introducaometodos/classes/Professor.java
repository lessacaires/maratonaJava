package br.com.abc.javacore.introducaometodos.classes;

/**
 * Created by User on 15/08/2021.
 */
public class Professor {

    public String nome;
    public String rg;
    public String cpf;
    public String matricula;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.rg);
        System.out.println(this.cpf);
        System.out.println(this.matricula);
    }
}
