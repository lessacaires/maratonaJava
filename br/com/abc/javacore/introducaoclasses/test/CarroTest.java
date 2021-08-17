//Packages
package br.com.abc.javacore.introducaoclasses.test;

//Imports
import br.com.abc.javacore.introducaoclasses.classes.Carro;

/**
 * Created by User on 14/08/2021.
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro  carro = new Carro();

        carro.marca = "Chevrolet";
        carro.cor = "Preta";
        carro.modelo = "Celta";
        carro.placa = "JOP1234";
        carro.velocidadeMaxima = 210;
        carro.correr();
        carro.buzinar();

        System.out.println(carro.velocidadeMaxima);
    }
}
