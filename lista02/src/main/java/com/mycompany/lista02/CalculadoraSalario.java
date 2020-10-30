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
public class CalculadoraSalario {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
        Double imposto, salario, salarioLiq, valImposto;
        
        System.out.println("Digite seu salário:");
        salario = leitor.nextDouble();
        System.out.println("Digite a porcentagem de imposto:");
        valImposto = leitor.nextDouble();
        
        imposto = ((valImposto * salario) / 100);
        salarioLiq = salario - imposto;
        
        System.out.println(String.format("Seu salário líquido é = R$%.2f", salarioLiq));
        
    }
    
}