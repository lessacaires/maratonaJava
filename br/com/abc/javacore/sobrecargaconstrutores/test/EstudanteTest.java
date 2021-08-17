package br.com.abc.javacore.sobrecargaconstrutores.test;

import br.com.abc.javacore.sobrecargaconstrutores.classes.Estudante;

/**
 * Created by User on 16/08/2021.
 */
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("12215", "Fabricio", new double[]{10,8,6}, "25/10/2020");
        estudante.imprimeEstudante();
    }
}
