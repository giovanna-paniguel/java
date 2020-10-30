/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.reforco;

/** Classe TesteColaborador
 *  Resolução do exercício 2 passado em aula (23/10/20)
 *
 * @author celia.taniwaki
 */
public class TesteColaborador {
    
    public static void main(String[] args) {
    
        // Instancia 2 objetos Colaborador
        Colaborador colab1 = new Colaborador();
        Colaborador colab2 = new Colaborador();
        
        // Cria um objeto rh da classe RecursosHumanos
        RecursosHumanos rh = new RecursosHumanos();
        
        // Configura os valores do objeto colab1
        colab1.setNome("João");
        colab1.setCargo("Analista Junior");
        colab1.setSalario(3000.0);
        
        // Configura os valores do objeto colab2
        colab2.setNome("Maria");
        colab2.setCargo("Estagiária");
        colab2.setSalario(1500.0);
        
        // Exibe os dados dos 2 colaboradores
        colab1.exibeColaborador();
        colab2.exibeColaborador();
        
        // Promove o colab1 para Analista Pleno, com salário 5000
        System.out.println("\nTentando promover o colaborador João");
        rh.promoverColaborador(colab1, "Analista Pleno", 5000.0);
        
        // Promove o colab2 para Analista Junior, com salário 1000 (não vai funcionar)
        System.out.println("\nTentando promover o colaborador Maria");
        rh.promoverColaborador(colab2, "Analista Junior", 1000.0);
        
        // Exibe os dados do colab1
        colab1.exibeColaborador();
        
        // Reajusta o salário do colab1, em 10%
        rh.reajustarSalario(colab1, 10.0);
        
        // Exibe novamente os dados do colab1
        colab1.exibeColaborador();

        // Reajusta o salário do colab2, em 20%
        rh.reajustarSalario(colab2, 20.0);
        
        // Exibe novamente os dados do colab2
        colab2.exibeColaborador();
        
        // Exibe quantas promoçoes e quantos reajustes foram realizados
        System.out.println("");
        System.out.println("Total de promoçoes: " + rh.getTotalPromovidos());
        System.out.println("Total de reajustes: " + rh.getTotalReajustes() );
    }
    
}
