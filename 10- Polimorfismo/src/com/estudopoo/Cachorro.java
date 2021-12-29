package com.estudopoo;

public class Cachorro extends Mamifero{
    public void enterrarOsso(){
        System.out.println("Estou enterrando um osso");
    }
    public void abanarRabo(){
        System.out.println("Estou abanando o rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
}
