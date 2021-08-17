package br.com.abc.javacore.introducaoclasses.classes;

/**
 * Created by User on 14/08/2021.
 */
public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public String placa;
    public float velocidadeMaxima;

    public void  correr(){
        velocidadeMaxima += 10;
    }

    public void buzinar(){
        System.out.println("BIBI!!");
    }
}
