package com.estudopoo;

public class Main {

    public static void main(String[] args) {
/*
        Visitante v1 = new Visitante();
        Bolsista b1 = new Bolsista();
*/

        Aluno a1 = new Aluno();

        a1.setNome("Boninho");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");

        System.out.println(a1.toString());
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();

        b1.setNome("Jubileu");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.setIdade(17);
        b1.setSexo("M");

        System.out.println(b1.toString());
        b1.pagarMensalidade();
    }
}
