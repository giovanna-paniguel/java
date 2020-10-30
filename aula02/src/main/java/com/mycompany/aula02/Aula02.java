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
public class Aula02 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        //criação de uma variável real (com casas decimais)
        Double nota1, nota2, media, divisao;
        
        //criação de variáveis String
        String snum1, snum2;
        
        //criação de variáveis inteiras
        Integer num1, num2, resultado;
        
        //criação de variáveis lógicas (recebe true ou false)
        Boolean aprovado = false;
        
        //divisão de números inteiros
        num1 = 9;
        num2 = 2;
        resultado = num1 / num2;
        System.out.println("O resultado é " + resultado);
        //para obter o resultado com casas decimais, é preciso converter o num1 e o num2 para double antes da divisão
        divisao = Double.valueOf(num1) / Double.valueOf(num2);
        System.out.println("A divisao é " + divisao);
        
        divisao = 1.0 / 2;
        System.out.println("A divisao é " + divisao);
        
        
        //leitura de um valor real
        System.out.println("Digite a sua primeira nota:");
        nota1 = leitor.nextDouble();
        
        System.out.println("Digite a sua segunda nota:");
        nota2 = leitor.nextDouble();
        
        //cálculo da média
        media = (nota1 + nota2) / 2;
        
        System.out.println("A média é " + media);
        
        //Interpolação
        //String.format("texto", var1, var2, ....)
        //No lugar do texto onde deve aparecer o valor das variáveis utilizo formatos
        //%f - para exibir números reais (com casas decimais)
        //%d - para exibir números inteiros
        //%s - para exibir texto (String)
        //%.2f - para exibir números reais com 2 casas decimais
        //%.1f - para exibir números reais com 1 casa decimal
        
        System.out.println(String.format("A média é %.2f", media));
        System.out.println(String.format("Nota1:%.2f Nota2:%.2f Media: %.1f", nota1, nota2, media));
    
        //conversão de string para integer
        snum1 = "123";
        
        //'1' é armazenado em ASCII - 31H - 00110001
        // 1 é armazenado em binário -      00000001
        num1 = Integer.valueOf(snum1);

        //conversão de string para double
        snum2 = "7.5";
        nota2 = Double.valueOf(snum2);
        System.out.println(nota2);
        
        //instruções de seleção
        //if sem else
        if(media >= 6){
            System.out.println("Você foi aprovado!");
        }
        
        //if com else
        if(media >= 6){
            aprovado = true;
        }
        else{
            aprovado = false;
        }
        
        if(aprovado){
            System.out.println("Você irá para o Terceiro Semestre!");
        }
        
        //para comparar variável booleana com false, não se usa (== false) se usa a exclamação
        if(!aprovado){
            System.out.println("Você irá repetir o Segundo Semestre!");
        }
        
        //para comparar valores string não utilizamos ==
        //if (num1 == "123") é errado
        // o correto é utilizar .equals
        
        if (snum1.equals("123")) {
            System.out.println("Acertou!");
        }
        
        //para comparar se a string snum1 é diferente de "123"
        if (!snum1.equals("123")){
            System.out.println("Errou!");
        }
        
        //como estamos usando variáveis numéricas de tipo integer e double
        //então também podemos usar .equals para essas variáveis
       if (num1 == 5){
           
       }
       
       if (num1.equals(5)){
       }  
       
       if (num1 != 5){
           
       }
       
       if (!num1.equals(5)){
           
       }
       
       //Em Java, como no JavaScript, utilizamos || para OU
       //e utilizamos && para AND
       if (num1 < 0 || num1 > 10){
           System.out.println("num1 fora dos valores válidos");
       }
       
       if (num1 >= 0 && num1 <= 10){
           System.out.println("num1 é válido");
       }
       
       //operação módulo - fornece o resto da divisão inteira
       //utilizamos o símbolo %
       if (num1 % 2 == 0){
           System.out.println("num1 é par");
       } else {
           System.out.println("num1 é ímpar");
       }
    
}
}