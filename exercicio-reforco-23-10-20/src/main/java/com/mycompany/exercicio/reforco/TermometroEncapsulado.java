/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.reforco;

/** Esta classe TermometroEncapsulado é a resolução do 1o exercício da Lista de Reforço
 *  Neste caso, essa classe está encapsulada
 *
 * @author celia.taniwaki
 */
public class TermometroEncapsulado {
    
    // Atributos
    private Double temperaturaAtual;            // temperatura atual registrada pelo termômetro
    private Double temperaturaMaxRegistrada;    // temperatura máxima registrada até o momento
    private Double temperaturaMinRegistrada;    // temperatura mínima registrada até o momento
    
    // Métodos

    /* Método aumentaTemperatura - recebe o valor de aumento
       Aumenta a temperatura atual, acrescentando o valor de aumento
       Verifica se após o aumento, a temperatura atual é maior do que a temp max registrada
       Caso seja maior, atualiza a temp max registrada
    */
    public void aumentaTemperatura(Double valorAumento) {
        temperaturaAtual += valorAumento;       // aumenta a temp atual, acrescentando o valor de aumento
        
        if (temperaturaAtual > temperaturaMaxRegistrada) {  // temp atual após aumento é maior do que a temp max registrada?
            temperaturaMaxRegistrada = temperaturaAtual;    // se for, atualiza a temp max registrada
        }
    }

    /* Método diminuiTemperatura - recebe o valor de redução
       Diminui a temperatura atual, subtraindo o valor de redução
       Verifica se após a redução, a temperatura atual é menor do que a temp min registrada
       Caso seja menor, atualiza a temp min registrada
    */
    public void diminuiTemperatura(Double valorReducao) {
        temperaturaAtual -= valorReducao;       // diminui a temp atual, subtraindo o valor de redução
        
        if (temperaturaAtual < temperaturaMinRegistrada) {  // se temp atual após redução for menor do que a temp min registrada
            temperaturaMinRegistrada = temperaturaAtual;    // então atualiza a temp min registrada
        }
    }
    
    
    /* Método converterParaFahreinheit - não recebe nenhum valor
       Calcula e retorna a temperatura atual convertida para Fahreinheit
    */
    public Double converterParaFahreinheit() {
        Double temperaturaF = temperaturaAtual * 1.8 + 32.0;    // Calcula a conversão para Fahreinheit da temp atual
        return temperaturaF;             // retorna o valor calculado
        
        // As 2 linhas de código acima equivalem a esta abaixo:
        //return temperaturaAtual * 1.8 + 32.0;
    }
    
    
    /* Método exibirValores - não recebe nenhum argumento
       Exibe os valores dos atributos
    */
    public void exibirValores() {
        System.out.println("");
        System.out.println(String.format("Temperatura atual: %.2f ºC", temperaturaAtual));
        System.out.println(String.format("Temperatura max registrada: %.2f °C", temperaturaMaxRegistrada));
        System.out.println(String.format("Temperatura min registrada: %.2f °C", temperaturaMinRegistrada));
    }

    // Getters e Setters
    
    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Double getTemperaturaMaxRegistrada() {
        return temperaturaMaxRegistrada;
    }

    public void setTemperaturaMaxRegistrada(Double temperaturaMaxRegistrada) {
        this.temperaturaMaxRegistrada = temperaturaMaxRegistrada;
    }

    public Double getTemperaturaMinRegistrada() {
        return temperaturaMinRegistrada;
    }

    public void setTemperaturaMinRegistrada(Double temperaturaMinRegistrada) {
        this.temperaturaMinRegistrada = temperaturaMinRegistrada;
    }

    
}
