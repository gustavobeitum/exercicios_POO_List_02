package Exercicio_2_5.app;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_2_5.core.Troco;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double precoUni = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int qtde = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = sc.nextDouble();

        Troco venda = new Troco(precoUni, qtde, dinheiroRecebido);

        venda.pagamentoETroco();

        sc.close();
    }
}
