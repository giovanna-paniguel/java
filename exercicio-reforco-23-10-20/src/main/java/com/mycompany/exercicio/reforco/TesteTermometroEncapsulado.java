/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.reforco;

/** Esta classe testa a classe TermometroEncapsulado
 *  (com encapsulamento)
 *
 * @author celia.taniwaki
 */
public class TesteTermometroEncapsulado {
    
    public static void main(String[] args) {
        
        // Cria um objeto da classe TermometroEncapsulado
        TermometroEncapsulado termometro = new TermometroEncapsulado();
        
        // Configura a temp inicial para temp atual, temp min e max registrada
        // Como está encapsulado, preciso usar os setters
        termometro.setTemperaturaAtual(23.0);
        termometro.setTemperaturaMaxRegistrada(23.0);
        termometro.setTemperaturaMinRegistrada(23.0);
        
        // Exibe a temperarura atual - aqui preciso usar o getTemperaturaAtual()
        System.out.println("Temperatura atual: " + 
                            termometro.getTemperaturaAtual());
        
        // Exibe os valores dos atributos do termometro
        termometro.exibirValores();
        
        // Aumenta a temperatura atual 2 vezes e exibe os valores dos atributos do termômetro
        termometro.aumentaTemperatura(3.0);
        termometro.aumentaTemperatura(5.0);
        termometro.exibirValores();
        
        // Diminui a temperatura atual 2 vezes e exibe os valores dos atributos do termômetro
        termometro.diminuiTemperatura(10.0);
        termometro.diminuiTemperatura(2.0);
        termometro.exibirValores();
        
        // Exibe a temperatura atual convertida para Fahreinheit
        System.out.println("");
        System.out.println(String.format("Temperatura em Fahreinheit: %.2f ºF",
                                        termometro.converterParaFahreinheit()));
    }
    
}
