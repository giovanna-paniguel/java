/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author giovannapaniguel
 */
public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer a, b, soma, subtracao, multiplicacao;
        
        System.out.println("Digite um número:");
        a = leitor.nextInt();
        System.out.println("Digite outro número:");
        b = leitor.nextInt();

        soma = a + b;
        subtracao = a - b;
        multiplicacao = a * b;
        
        System.out.println("A soma é " + soma);
        System.out.println("A subtração é " + subtracao);
        System.out.println("A multiplicação é " + multiplicacao);
        
    }
    
}