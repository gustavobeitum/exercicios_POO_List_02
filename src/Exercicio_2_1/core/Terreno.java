package Exercicio_2_1.core;

public class Terreno {
    private double largura;
    private double comprimento;
    private double valor;
    private double area;


    public Terreno(double largura, double comprimento, double valor){
        this.largura = largura;
        this.comprimento = comprimento;
        this.valor = valor;
    }

    public void areaQuadradaTerreno(){
        this.area = largura * comprimento;
        System.out.printf("Area do terreno: %.2f%n", area);
    }

    public void valorTerreno(){
        System.out.printf("Preço do terreno: R$ %.2f%n", area * valor);
    }
}