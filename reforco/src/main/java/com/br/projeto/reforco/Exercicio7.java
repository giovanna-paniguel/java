package com.br.projeto.reforco;

import java.util.Scanner;

public class Exercicio7 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma nota:");
        Integer num = scan.nextInt();
        Integer soma = 0;
        Double media = 0.0;

        while (num > 0) {
            soma += num;
            System.out.println("Digite uma nota");
            num = scan.nextInt();
        }
        media = soma / numNotas;
        System.out.println("A média das notas é:" + media);

    }
    
}
