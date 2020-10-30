package com.br.projeto.reforco;

import java.util.Scanner;

public class Exercício2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer num = scan.nextInt();

        if (!(num % 2 == 0)) {
            num += 11;
            if (num % 2 == 0) {
                num += 28;
            } else {
                num -= 10;
            }
        } else {
            num *= -1;
            if (num < 0) {
                num += 31;
            } else {
                num *= 2;
            }
        }
        System.out.println(num);
    }

}
