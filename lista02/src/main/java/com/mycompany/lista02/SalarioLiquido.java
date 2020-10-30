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
public class SalarioLiquido {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
        Double idaVT, salario, INSS, IR, VT, descontos, salarioLiq;
        
        System.out.println("Digite seu salário bruto:");
        salario = leitor.nextDouble();
        System.out.println("Digite o valor da condução apenas da ida (de casa ao trabalho):");
        idaVT = leitor.nextDouble();
        
        INSS = ((10 * salario) / 100);
        IR = ((20 * salario) / 100);
        VT = (idaVT * 2) * 22;
        descontos = INSS + IR + VT;
        salarioLiq = salario - INSS - IR - VT;
        
        System.out.println(String.format("Seu bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f", salario, descontos, salarioLiq));
        
    }
}