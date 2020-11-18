package com.mycompany.lista.reforco;

public class BilheteUnico {

    private String cpf;
    private Double saldo = 0.0;
    private String titular;
    private Boolean primeiraPassagem = true;

    void recarregar(Double valorRecarga) {

        if (saldo + valorRecarga > 250.00) {
            System.out.println("Não é possível efetuar a recarga");
        } else {
            saldo = saldo + valorRecarga;
            System.out.println("Carga efetuada com sucesso! Saldo Atual: " + saldo);
        }

    }

    void passagemComum() {

        if (saldo < 4.50) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - 4.50;
            primeiraPassagem = false;
        }

    }

    void passagemIntegracao() {

        if (primeiraPassagem == false|| saldo < 1.50) {
            System.out.println("Saldo insuficiente");
        } else if (primeiraPassagem == false || saldo >= 1.50) {
            saldo = saldo - 1.50;
            primeiraPassagem = true;
            System.out.println("Boa Viagem! Saldo atual: " + saldo);
        } else if (primeiraPassagem = true || saldo >= 4.50) {
            saldo = saldo - 4.50;
        } else if (primeiraPassagem = true || saldo < 4.50) {
            System.out.println("Saldo insuficiente");
            System.out.println("Boa Viagem! Saldo atual: " + saldo);
        }

    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setPrimeiraPassagem(Boolean primeiraPassagem) {
        this.primeiraPassagem = primeiraPassagem;
    }

}
