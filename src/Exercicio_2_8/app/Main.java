package Exercicio_2_8.app;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_2_8.core.Consumo;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia percorrida: ");
        double distancia = sc.nextInt();

        System.out.print("Combustivel gasto: ");
        double combustivelGasto = sc.nextDouble();

        Consumo veiculo = new Consumo(distancia, combustivelGasto);

        veiculo.consumoMedio();

        sc.close();
    }
}
