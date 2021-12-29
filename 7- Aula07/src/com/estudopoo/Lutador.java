package com.estudopoo;

import java.sql.SQLOutput;

public class Lutador implements Controlador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias,derrotas,empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public float setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();{
            if(peso <52.2f){
                categoria = "Inválido";
            }else if(peso <=70.3f){
                categoria = "Leve";
            }else if(peso <=89.3f){
                categoria = "Médio";
            }else if(peso<=120.2f){
                categoria = "Pesado";
            }else{
                categoria = "Inválido";
            }
        }return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


    @Override
    public void apresentar() {
        System.out.println("-------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + getNome());
        System.out.println("Diratemanete de: " + getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }


    @Override
    public void status() {
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " +getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando: " + getPeso()+ "kg");
        System.out.println("Categoria: "+" Peso " + getCategoria());
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " +getDerrotas());
        System.out.println("Empatou: " + getEmpates());


    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() +1);
    }

    @Override
    public void perderLuta() {
    setDerrotas(getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates()+1);
    }
}
