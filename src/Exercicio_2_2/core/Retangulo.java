package Exercicio_2_2.core;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void areaRetangulo(){
        System.out.printf("AREA = %.4f%n", base * altura);
    }

    public void perimetroRetangulo(){
        System.out.printf("PERIMETRO = %.4f%n", 2 * (base + altura));
    }

    public void diagonalRetangulo(){
        System.out.printf("DIAGONAL = %.4f%n", Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
    }
}
