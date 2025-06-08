package Exercicios_2_6.core;

public class Circulo {
    private double raio;
    public final double pi = 3.14159;

    public Circulo(double raio){
        this.raio = raio;
    }

    public void areaCirculo(){
        System.out.printf("%nAREA = %.3f", pi * Math.pow(raio, 2));
    }
}
