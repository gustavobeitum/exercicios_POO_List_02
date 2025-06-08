package Exercicio_2_7.app;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_2_7.core.Pagamento;

public class Main {
     public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Valor por hora: ");
        double valorDaHora = sc.nextDouble();

        System.out.print("Horas trabalhadas: ");
        double horaTrabalhada = sc.nextDouble();

        Pagamento funcionario = new Pagamento(nome, valorDaHora, horaTrabalhada);

        System.out.printf("%nO pagamento para %s deve ser %.2f", funcionario.getNome(), funcionario.valorPagamento());

        sc.close();
    }
}
