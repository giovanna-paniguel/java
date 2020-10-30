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
public class Elevador {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer numMaximo;
        Double pesoMaximo, peso1, peso2, peso3, pesoTotal;
        
        System.out.println("Digite o peso máximo que o elevador suporta:");
        pesoMaximo = leitor.nextDouble();
        System.out.println("Digite o número máximo de pessoas que o elevador suporta:");
        numMaximo = leitor.nextInt();
        System.out.println("Digite o peso da primeira pessoa que entrou:");
        peso1 = leitor.nextDouble();
        System.out.println("Digite o peso da segunda pessoa que entrou:");
        peso2 = leitor.nextDouble();
        System.out.println("Digite o peso da terceira pessoa que entrou:");
        peso3 = leitor.nextDouble();
        
        pesoTotal = peso1 + peso2 + peso3;
        
        System.out.println(String.format("Entraram 3 pessoas no elevador, no qual cabem %d", numMaximo));
        System.out.println(String.format("O peso total no elevador é de %.2f, sendo que ele suporta %.2f", pesoTotal, pesoMaximo));
    }
}