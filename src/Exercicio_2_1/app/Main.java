package Exercicio_2_1.app;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_2_1.core.Terreno;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double valor = sc.nextDouble();

        Terreno terreno = new Terreno(largura, comprimento, valor);

        System.out.println(" ");
        
        terreno.areaQuadradaTerreno();
        terreno.valorTerreno();

        sc.close();
    }
}
