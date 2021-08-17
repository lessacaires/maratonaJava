package br.com.abc.javacore.introducaoclasses.classes.test;

import br.com.abc.javacore.introducaoclasses.classes.classes.Estudante;

/**
 * Created by User on 14/08/2021.
 */
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.nome = "João";
        aluno.idade = 15;
        aluno.matricula = "111";

        System.out.println(aluno.nome);
        System.out.println(aluno.idade);
        System.out.println(aluno.matricula);
    }
}
