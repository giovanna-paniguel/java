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
public class Idade {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        Integer anoNascimento, idade;
        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();
        
        System.out.println("Olá " + nome + "! Qual o ano de seu nascimento?");
        anoNascimento = leitor.nextInt();

        idade = 2030 - anoNascimento;

        System.out.println("Em 2030 você terá " + idade + " anos.");
        
    }
    
}