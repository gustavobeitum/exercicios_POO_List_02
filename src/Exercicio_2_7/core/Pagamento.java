package Exercicio_2_7.core;

public class Pagamento {
    private String nome;
    private double valorDaHora;
    private double horaTrabalhada;

    public Pagamento(String nome, double valorDaHora, double horaTrabalhada){
        this.nome = nome;
        this.valorDaHora = valorDaHora;
        this.horaTrabalhada = horaTrabalhada;
    }

    public String getNome(){
        return nome;
    }

    public double valorPagamento(){
        return valorDaHora * horaTrabalhada;
    }
}
