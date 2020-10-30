package com.br.projeto.reforco;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome;
        Integer anoNascimento, idade2020, idade2030;
        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();

        System.out.println("Digite o ano de seu nascimento:");
        anoNascimento = leitor.nextInt();

        idade2020 = 2020 - anoNascimento;
        idade2030 = 2030 - anoNascimento;

        System.out.println("Olá " + nome + ", este ano você completa " + idade2020 + " anos e em 2030 você terá " + idade2030 + " anos.");

    }

}
