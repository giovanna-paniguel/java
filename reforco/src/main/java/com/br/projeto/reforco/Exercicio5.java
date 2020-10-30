package com.br.projeto.reforco;

import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        Integer num = scan.nextInt();
        
        while (num < 1) {
            System.out.println("Digite um número maior ou igual a 1:");
            num = scan.nextInt();
        }
        
        contagemRegressiva(num);
        
    }
    
    
    public static void contagemRegressiva(Integer num) {
            int x = 0;
            
       for (x = num; x >= 0; x--) {
            System.out.print("\n" + x);
        }
      

    }

}