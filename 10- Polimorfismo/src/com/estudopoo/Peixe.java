package com.estudopoo;

public class Peixe extends Animal{
    private int corEscama;

    public int getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(int corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");

    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }
}
