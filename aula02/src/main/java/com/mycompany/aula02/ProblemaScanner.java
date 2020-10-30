/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula02;

import java.util.Scanner;

/**
 *
 * @author giovannapaniguel
 */
public class ProblemaScanner {
    
    public static void main(String[] args) {
        
        //criação do objeto leitor da classe scanner
        Scanner leitor = new Scanner(System.in);
        
        //criação do objeto leitor apenas para ler com NextLine()
        Scanner leitorNL = new Scanner(System.in);
        
        //criação de variaveis
        Integer idade, a, b, c;
        String nome;
        Double nota;
        
        //solicitação para o usuário digitar os dados
        //e leitura dos dados
        System.out.println("Digite a sua idade:");
        idade = leitor.nextInt();
        //5 0 <Enter>
        System.out.println("Digite o seu nome:");
        nome = leitorNL.nextLine(); 
        
        System.out.println("Digite a sua nota:");
        nota = leitor.nextDouble();
        System.out.println(String.format("A nota de %s é %.2f", nome, nota));
        
        System.out.println("Digite três números:");
        a = leitor.nextInt();
        b = leitor.nextInt();
        c = leitor.nextInt();
        System.out.println(String.format("a = %d, b = %d, c = %d", a, b, c));
    }
    
}
