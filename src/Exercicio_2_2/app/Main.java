package Exercicio_2_2.app;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_2_2.core.Retangulo;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double base = sc.nextDouble();

        System.out.print("Altura do retangulo: ");
        double altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);

        System.out.println(" ");

        retangulo.areaRetangulo();
        retangulo.perimetroRetangulo();
        retangulo.diagonalRetangulo();


        sc.close();
    }
}
