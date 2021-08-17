package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        //Enunciado
        /*
            CRIE UMA VARIÁVEL SALARIO E IMPRIMA SEU SEU IMPOSTO
            IMPOSTO:
            SALARIO < 1000 5%
            SALARIO >= 1000 && SALARIO < 4000 10%
            SALARIO > 5000 20%
        */

        //Declaração de variáveis
        double salario, totalImposto;
        salario = 1430;

        //Controle Condicional

        if(salario < 1000){
            totalImposto = salario * 0.05 ;
        }else if(salario >= 1000 && salario < 2000){
            totalImposto = salario * 0.10 ;
        }else if(salario >= 2000 && salario < 4000){
            totalImposto = salario * 0.15;
        }else{
            totalImposto = salario * 0.20;
        }
        System.out.println("Imposto é: R$"+totalImposto);
    }
}
