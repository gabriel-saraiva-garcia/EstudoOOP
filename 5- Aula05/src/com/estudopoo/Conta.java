package com.estudopoo;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(int n) {
        this.status = false;
        this.saldo = 0f;
        this.numConta = n;


    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t, String d) {
        if (t.equals("CC") || t.equals("CP")) {
            this.setTipo(t);
            this.setStatus(true);
            this.setDono(d);
            System.out.println("Conta de " + getDono() + " aberta com sucesso.");
        } else {
            System.out.println("Erro, insira um tipo válido.");
        }

        if (this.getTipo().equals("CC")) {
            this.setSaldo(50);
        } else if (this.getTipo().equals("CP")) {
            this.setSaldo(100);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.status = false;
            System.out.println("Conta de " + getDono() + " fechada com sucesso.");
        } else {
            System.out.println("Erro, voce possui alguma pendência (ainda tem saldo na sua conta ou está em débito), resolva-as e tente novamente.");
        }

    }

    public void depositar(float valor) {
        if (status = true) {
            this.saldo = getSaldo() + valor;
            System.out.println("Voce depositou: " + valor + " Reais.");
        } else {
            System.out.println("Impossivel depositar em uma conta fechada.");
        }
    }

    public void sacar(float valor) {
        if (status = true) {
            if (valor <= this.getSaldo()) {
                this.saldo = getSaldo() - valor;
                System.out.println("voce sacou: " + valor + " Reais. Seu novo saldo é: " + this.getSaldo() + "R$");
            } else {
                System.out.println("Saldo insuficiente.");
            }

        } else {
            System.out.println("impossivel sacar");

        }
    }

    public void pagarMensalidade() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade Paga com sucesso por " + getDono());
        } else {
            System.out.println("Impossivel Pagar uma conta fechada.");
        }

    }


    @Override
    public String toString() {
        return "numConta=" + numConta + "\n" +
                " tipo='" + tipo + "\n" +
                " dono='" + dono + "\n" +
                " saldo=" + saldo + "R$" + "\n" +
                " status=" + status;
    }
}
