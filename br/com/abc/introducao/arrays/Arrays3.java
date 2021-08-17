package br.com.abc.introducao.arrays;

/**
 * Created by User on 14/08/2021.
 */
public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros1 = new int[3];
        int[] numeros2 = {1,2,3,4,5}; // Tamanho 5 Indice 0...4
        int[] numeros3 = new int[]{0,1,2,3,4};

        for(int num : numeros2){
            System.out.println(num);
        }
    }
}
