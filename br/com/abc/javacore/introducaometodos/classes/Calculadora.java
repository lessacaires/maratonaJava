package br.com.abc.javacore.introducaometodos.classes;

/**
 * Created by User on 15/08/2021.
 */
public class Calculadora {
    public void somaDoisNumeros(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public void subtraiDoisNumeros(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public void divideDoisNumeros(int num1, int num2){
        if(num2 != 0){
            System.out.println(num1 / num2);
        }
        System.out.println("Não é possível dividir por 0 (Zero)");
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);
    }
}
