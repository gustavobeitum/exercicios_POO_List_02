package Exercicio_2_3.app;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_2_3.core.Pessoa;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();

        Pessoa pessoa1 = new Pessoa(nome, idade);

        sc.nextLine();

        System.out.println("%nDados da segunda pessoa:");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Idade: ");
        idade = sc.nextInt();

        Pessoa pessoa2 = new Pessoa(nome, idade);

        double media = (pessoa1.getIdade() + pessoa2.getIdade()) / 2;

         System.out.printf("%nA idade média de %s e %s é de %.1f anos", pessoa1.getNome(), pessoa2.getNome(), media);
        sc.close();
    }
} 
