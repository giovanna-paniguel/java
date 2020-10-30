package com.br.projeto.reforco;

import java.util.Scanner;

public class Exercicio3 {

     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

         System.out.println("Digite seu nome:");

        String name = scan.next();

        System.out.println(String.format("Seu nome é: %s", name));

    }

}