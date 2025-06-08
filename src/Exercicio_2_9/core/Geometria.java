package Exercicio_2_9.core;

public class Geometria {
    private double a;
    private double b;
    private double c;

    public Geometria(double a){
        this.a = a;
    }

    public Geometria(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Geometria(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void areaQudrado(){
        System.out.printf("%nAREA DO QUADRADO %.4f", a * a);
    }

    public void areaTriangulo(){
        System.out.printf("%nAREA DO TRIANGULO %.4f", (a * b) / 2);
    }

    public void areaTrapezio(){
        System.out.printf("%nAREA DO TRAPEZIO %.4f", ((a + b) * c) / 2);
    }
}
