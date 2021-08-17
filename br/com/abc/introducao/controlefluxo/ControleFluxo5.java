package br.com.abc.introducao.controlefluxo;

/**
 * Created by User on 14/08/2021.
 */
public class ControleFluxo5 {
    public static void main(String[] args) {
        /*
        Dado umvalor de um carro, descubra em quantas vezes ele pode ser parcelad[
        Porem as parcelas não podem ser menor do que 1000
         */

        double valorTotal = 30000;
        for(int parcela = 1; parcela <= valorTotal; parcela ++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }else{
                break;
            }
        }
    }
}
