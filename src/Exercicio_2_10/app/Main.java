package Exercicio_2_10.app;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_2_10.core.Tempo;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a duração em segundos: ");
        int duracao = sc.nextInt();

        Tempo tempo = new Tempo(duracao);

        tempo.calcularTempo();

        sc.close();
    }
}
