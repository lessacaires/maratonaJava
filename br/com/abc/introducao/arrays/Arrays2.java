package br.com.abc.introducao.arrays;

/**
 * Created by User on 14/08/2021.
 */
public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double = 0
        // char '\0000'
        //boolean false true

        String[] nomes = new String[3];
        nomes[0] = "Naruto";
        nomes[1] = "Sasuke";
        nomes[2] = "Kakashi";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
