package Exercicio_2_10.core;

public class Tempo {
    private int duracao;

    public Tempo(int duracao){
        this.duracao = duracao;
    }

    public void calcularTempo(){
        int horas = duracao / 3600;
        int minutos = (duracao % 3600) / 60;
        int segundos = duracao % 60;
        System.out.printf("%n %d:%d:%d",horas, minutos, segundos);
    }
}
