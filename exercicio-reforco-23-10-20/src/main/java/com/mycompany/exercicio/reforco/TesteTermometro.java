/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.reforco;

/** Esta classe testa a classe Termometro (sem encapsulamento)
 *
 * @author celia.taniwaki
 */
public class TesteTermometro {
    
    public static void main(String[] args) {
        // cria um objeto da classe Termometro
        // ou seja, instancia a classe Termometro
        Termometro termometro = new Termometro();
        
        // Configura um valor inicial para a temp atual
        // E configura o mesmo valor para as temp max e min registrada
        termometro.temperaturaAtual = 23.0;
        termometro.temperaturaMaxRegistrada = 23.0;
        termometro.temperaturaMinRegistrada = 23.0;
        
        // Exibe os valores dos atributos do termometro
        termometro.exibirValores();
        
        // Aumenta 2 vezes a temperatura do termômetro e exibe os valores dos atributos
        termometro.aumentaTemperatura(3.0);
        termometro.aumentaTemperatura(5.0);
        termometro.exibirValores();
        
        // Diminui 2 vezes a temperatura do termômetro e exibe os valores dos atributos
        termometro.diminuiTemperatura(10.0);
        termometro.diminuiTemperatura(2.0);
        termometro.exibirValores();
        
        // Exibe a temperatura atual em Fahreinheit
        System.out.println("");
        System.out.println(String.format("Temperatura em Fahreinheit: %.2f ºF",
                                        termometro.converterParaFahreinheit()));
    }
    
}
