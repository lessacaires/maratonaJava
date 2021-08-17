package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Professor;

/**
 * Created by User on 15/08/2021.
 */
public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Marcos";
        prof.cpf = "1232.145.624-25";
        prof.rg = "001982354";
        prof.matricula = "3524";

        prof.imprime();
    }
}
