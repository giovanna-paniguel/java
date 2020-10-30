package com.mycompany.lista05;

public class BolsaKids {

    private Integer filhos2 = 0;
    private Integer filhos7 = 0;
    private Integer filhos15 = 0;
    private Double bolsa = 0.0;

    private String resultado;
    private String cor;

    void calcularBolsa(Integer numeroDigitado2, Integer numeroDigitado7, Integer numeroDigitado15) {
        filhos2 = numeroDigitado2;
        filhos7 = numeroDigitado7;
        filhos15 = numeroDigitado15;

        bolsa = (filhos2 * 15.5) + (filhos7 * 10) + (filhos15 * 5.5);

        cor = "#0000ff";

    }

    public Double getResultado() {
        return bolsa;
    }

    public String getCor() {
        return cor;
    }

}
