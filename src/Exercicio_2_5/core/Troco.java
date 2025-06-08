package Exercicio_2_5.core;

public class Troco {
    private double precoUni;
    private int qtde;
    private double dinheiroRecebido;

    public Troco(double precoUni, int qtde, double dinheiroRecebido){
        this.precoUni = precoUni;
        this.qtde = qtde;
        this.dinheiroRecebido = dinheiroRecebido; 
    }

    public void pagamentoETroco(){
        double valorTotal = precoUni * qtde;
        if(valorTotal > dinheiroRecebido){
            System.out.printf("%nDinheiro insuficiente, falta %.2f", valorTotal - dinheiroRecebido);
        } else {
            System.out.printf("%nTROCO = %.2f", dinheiroRecebido - valorTotal);
        }
    }
}
