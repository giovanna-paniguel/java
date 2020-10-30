package com.br.projeto.reforco2;

public class Empregado {

    private String nome;
    private String cargo;
    private Double salario = 0.0;
    private Double reajuste = 0.0;

    private String exibeReajuste;
    
    void reajustarSalario(String nomeDigitado, String cargoDigitado, Double salarioDigitado) {
        nome = nomeDigitado;
        cargo = cargoDigitado;
        salario = salarioDigitado;
                
        reajuste = 1 - 0.15;
        reajuste = salario * reajuste;
        exibeReajuste = String.format("%s \n %s \n Salário Reajustado R$%.2f0,00", nome, cargo, reajuste);

    }
    
    void reajustarSalario(String nomeDigitado, String cargoDigitado, Double salarioDigitado) {
        nome = nomeDigitado;
        cargo = cargoDigitado;
        salario = salarioDigitado;
                
        reajuste = 1 - 0.15;
        reajuste = salario * reajuste;
        exibeReajuste = String.format("%s \n %s \n Salário Reajustado R$%.2f0,00", nome, cargo, reajuste);

    }

    public String getResultado() {
        return exibeReajuste;
    }

}
