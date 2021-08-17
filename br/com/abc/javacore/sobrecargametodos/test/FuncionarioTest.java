package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

/**
 * Created by User on 16/08/2021.
 */
public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.init("Francisco", 2500, "0847706788", "00198223595");
        funcionario.imprimeFuncionario();
    }
}
