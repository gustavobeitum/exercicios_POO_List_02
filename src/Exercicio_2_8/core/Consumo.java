package Exercicio_2_8.core;

public class Consumo {
    private double distancia;
    private double combustivelGasto;

    public Consumo(double distancia, double combustivelGasto){
        this.distancia = distancia;
        this.combustivelGasto = combustivelGasto;
    }

    public void consumoMedio(){
        System.out.printf("Consumo medio %.3f", distancia / combustivelGasto);
    }
}
