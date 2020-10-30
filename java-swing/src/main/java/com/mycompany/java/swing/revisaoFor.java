package com.mycompany.java.swing;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giovannapaniguel
 */
public class revisaoFor {

    public static void main(String[] args) {
        Integer numeroFor = 5;
        
        for (int i = 0; i <= 10; i++) {
           String retorno = String.format("%d X %d = %d", numeroFor, i, (numeroFor * i));
            
           System.out.println(retorno);
        }
        
        //exemplo usando while
        Random numeroAleatorio = new Random();
        Integer aleatorio = numeroAleatorio.nextInt(100)+1;
        System.out.println("Número aleatório: " + aleatorio);
        
        Integer numeroWhile = 0; 
        
        while (numeroWhile <= 20) {
            System.out.println("O número é: " + numeroWhile);
            numeroWhile++;
        }

    }

}
