package com.br.projeto.reforco;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        Integer num = scan.nextInt();
        Integer x;

        for (x = 0; x <= 10; x++) {
            System.out.print(x + " x " + num + " = ");
            System.out.println(x * num);
        }
    }
}
