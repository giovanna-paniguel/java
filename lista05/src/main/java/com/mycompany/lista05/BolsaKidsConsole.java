package com.mycompany.lista05;

public class BolsaKidsConsole {

    public static void main(String[] args) {

        BolsaKids bolsaK = new BolsaKids();

        bolsaK.calcularBolsa(2, 1, 3);

        System.out.println(String.format("Sua bolsa kids é de R$%.2f", bolsaK.getResultado()));

    }

}
