package br.com.abc.introducao.controlefluxo;

public class Imc {

    public static void main(String[] args) {

    /*
        IMC	CLASSIFICAÇÃO	OBESIDADE (GRAU)
        MENOR QUE 18,5	    MAGREZA	0
        ENTRE 18,5 E 24,9	NORMAL	0
        ENTRE 25,0 E 29,9	SOBREPESO	I
        ENTRE 30,0 E 39,9	OBESIDADE	II
        MAIOR QUE 40,0	    OBESIDADE GRAVE	III
     */

        //Declaração de variáveis
        double peso, altura, indice;

        peso = 84.0;
        altura = 1.79;
        indice = 0.0;
        String resultado = "";

        //Obtenção do resultado
        indice = peso / (altura * altura);

        //Controle Condicional
        if(indice < 18.5 ){
            resultado = "MAGREZA 0";
        }else if(indice > 18.5 && indice <= 24.9){
            resultado = "NORMAL 0";
        }else if(indice > 25 && indice <= 29.9){
            resultado = "SOBREPESO I";
        }else if(indice > 30 && indice <= 39.9){
            resultado = "OBESIDADE II";
        }else{
            resultado = "OBESIDADE GRAVE III";
        }
        //Output
        System.out.println(resultado);
    }
}
