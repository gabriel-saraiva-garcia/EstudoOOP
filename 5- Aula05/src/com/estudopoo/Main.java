package com.estudopoo;

public class Main {

    public static void main(String[] args) {
        Conta c1 = new Conta(1);
        c1.abrirConta("CC", "Jubileu");
        System.out.println(c1.toString());
        c1.depositar(100);
        c1.pagarMensalidade();
        c1.sacar(138);
        c1.fecharConta();

        System.out.println("_____________________________________________");

        Conta c2 = new Conta(2);
        c2.abrirConta("CP", "Creuza");
        System.out.println(c2.toString());
        c2.depositar(100);
        c2.pagarMensalidade();
        c2.sacar(180);
        c2.fecharConta();





    }
}
