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
public class Login {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String login, senha;
        Integer totalErros;
        
        System.out.println("Digite seu login:");
        login = leitor.nextLine();
        System.out.println("Digite sua senha:");
        senha = leitor.nextLine();
        System.out.println("Digite a quantidade de vezes que deseja que seja possível errar a senha antes do bloqueio:");
        totalErros = leitor.nextInt();
        
         System.out.println(String.format("Seu login é %s. Sua senha é %s. Você tem %d tentativas antes de ser bloqueado", login, senha, totalErros));
    }
    
}