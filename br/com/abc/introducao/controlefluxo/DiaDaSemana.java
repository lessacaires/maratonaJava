package br.com.abc.introducao.controlefluxo;

public class DiaDaSemana {
    public static void main(String[] args) {
        //Declaração de variáveis
        byte diaDaSemana;
        diaDaSemana = 2;

        switch(diaDaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            default:
                System.out.println("Não é um dia da semana!");
                break;
        }
    }
}
