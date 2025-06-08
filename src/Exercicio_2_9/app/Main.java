package Exercicio_2_9.app;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_2_9.core.Geometria;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        double a = sc.nextDouble();

        System.out.print("Digite a medida B: ");
        double b = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        double c = sc.nextDouble();

        Geometria quadrado = new Geometria(a);
        Geometria triangulo = new Geometria(a, b);
        Geometria trapezio = new Geometria(a, b, c);

        quadrado.areaQudrado();
        triangulo.areaTriangulo();
        trapezio.areaTrapezio();

        sc.close();
    }
}