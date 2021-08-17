package br.com.abc.javacore.sobrecargametodos.classes;

/**
 * Created by User on 16/08/2021.
 */
public class Funcionario {
    private String nome;
    private String rg;
    private double salario;
    private String cpf;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public String getRg(){
        return this.rg;
    }

    public String getCpf(){
        return this.cpf;
    }

    public double getSlarario(){
        return this.salario;
    }

    public void init(String nome, double salario, String cpf){
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public void init(String nome, double salario, String cpf, String rg){
        init(nome, salario, cpf);
        this.rg = rg;
    }

    public void imprimeFuncionario(){
        System.out.println("Nome: "+this.nome);
        System.out.println("RG: "+this.rg);
        System.out.println("Salario: R$"+this.salario);
        System.out.println("CPF: "+this.cpf);
    }
}
