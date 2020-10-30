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
public class CalculadoraTroco {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
        Integer qtdVendida;
        Double valorUnit, valorPago, valorCompra, troco;
        
        System.out.println("Digite o valor unitário do produto:");
        valorUnit = leitor.nextDouble();
        System.out.println("Quantidade vendida:");
        qtdVendida = leitor.nextInt();
        System.out.println("Valor pago pelo cliente:");
        valorPago = leitor.nextDouble();
        
        valorCompra = valorUnit * qtdVendida;
        troco = valorPago - valorCompra;
        
        System.out.println(String.format("Seu troco será de R$%.2f", troco));
        
    }
}