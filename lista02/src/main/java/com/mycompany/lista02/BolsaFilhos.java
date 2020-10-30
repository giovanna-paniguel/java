/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista02;

import java.util.Scanner;

/**
 *
 * @author giovannapaniguel
 */
public class BolsaFilhos {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
        Integer filhosZero, filhosQuatro, filhosDezessete, numFilhos;
        Double bolsaFilhos;
        
        System.out.println("Quantos filhos possui de 0 a 3 anos:");
        filhosZero = leitor.nextInt();
        System.out.println("Quantos filhos possui de 4 a 16 anos:");
        filhosQuatro = leitor.nextInt();
        System.out.println("Quantos filhos possui de 17 a 18 anos:");
        filhosDezessete = leitor.nextInt();
        
        numFilhos = filhosZero + filhosQuatro + filhosDezessete;
        bolsaFilhos = (filhosZero * 25.12) + (filhosQuatro * 15.88) + (filhosDezessete * 12.44);
        
        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa", numFilhos, bolsaFilhos));
        
    }
    
}