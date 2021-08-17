package br.com.abc.introducao.controlefluxo;

public class Calculadora {
    public static void main(String[] args) {
        //Declaração de variáveis
        int tabuada;
        tabuada = 1;

        //Laço de repetição
        for (int i = 0; i < 10; i++) {
            for (byte x = 0; x <= 10; x++) {
                System.out.println(tabuada + " X " + x + " = " + tabuada * x);
            }
            tabuada += 1;
            System.out.println("------//------");
        }
    }
}
