package com.br.projeto.reforco2;

public class TesteEmpregado {

    public static void main(String[] args) {

        Empregado empregado = new Empregado();

        empregado.reajustarSalario("João", "Analista de Sistemas", 5.400);

        System.out.println(empregado.getResultado());

    }
}
