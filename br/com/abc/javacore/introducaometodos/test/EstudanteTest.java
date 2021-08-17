package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

/**
 * Created by User on 15/08/2021.
 */
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.setNome("Wyliston Lessa Caires");
        aluno.setIdade(41);
        aluno.setMatricula("123546");
        //aluno.setNotas(new double[]{10,5,7});
        aluno.imprimeAluno();
        aluno.imprimeMedia();
    }
}
