package com.br.projeto.reforco;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        Integer num = scan.nextInt();
        Integer soma = 0;

        while (num > 0) {
            soma += num;
            System.out.println("Digite um número:");
            num = scan.nextInt();
        }

        System.out.println("A soma dos valores inseridos é:" + soma);

    }

}