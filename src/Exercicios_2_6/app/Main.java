package Exercicios_2_6.app;

import java.util.Locale;
import java.util.Scanner;

import Exercicios_2_6.core.Circulo;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio do circulo: ");
        double raio = sc.nextDouble();

        Circulo circulo = new Circulo(raio);

        circulo.areaCirculo();

        sc.close();
    }
}
