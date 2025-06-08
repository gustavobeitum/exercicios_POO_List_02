package Exercicio_2_4.app;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_2_4.core.Soma;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int number1 = sc.nextInt();

        System.out.print("Digite o valor de Y: ");
        int number2 = sc.nextInt();

        Soma numbers = new Soma(number1, number2);

        int sum = numbers.somar();

        System.out.print("Soma = " + sum);

        sc.close();
    }
}
