package br.com.abc.introducao.arrays;

/**
 * Created by User on 14/08/2021.
 */
public class Arrays6 {
    public static void main(String[] args) {
        int[][] dias = new int[3][];

        dias[0] = new int[2];
        dias[1] = new int[]{1,2,3};
        dias[2] = new int[4];

        for(int[] arr : dias ){
            for(int num : arr){
                System.out.println(num);
            }
        }

    }
}
