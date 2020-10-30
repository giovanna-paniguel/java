/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.reforco;

/** Classe RecursosHumanos
 *  Resolução do exercício 2 passado em aula (23/10/20)
 *
 * @author celia.taniwaki
 */
public class RecursosHumanos {
    
    // Atributos
    private Integer totalPromovidos = 0;        // contador de total de promoções
    private Integer totalReajustes = 0;         // contador de total de reajustes
    
    // Métodos
    
    /* Método reajustarSalario - recebe um objeto Colaborador e a taxa de reajuste
       Calcula e configura o salário reajustado do colaborador
    */
    public void reajustarSalario(Colaborador colab, Double taxaReajuste) {
        Double novoSalario;     // cria uma variável para calcular o salário reajustado
        
        // Calcula o salário reajustado do colaborador
        novoSalario = colab.getSalario() * (1 + taxaReajuste/100);
        
        // O cálculo acima é o mesmo do cálculo abaixo
        //novoSalario = colab.getSalario() * taxaReajuste/100 + colab.getSalario();
        
        // Configura o salário do colaborador com o salário reajustado
        colab.setSalario(novoSalario);
        
        // Incrementa o contador de reajustes realizados
        totalReajustes++;
    }
    
    /* Método promoverColaborador - Recebe um objeto colaborador, o novo cargo que ele terá
       e o novo salário
       Se o novo salário for menor ou igual do que o salário atual do colaborador, então
       não realiza a promoção
    */
    public void promoverColaborador(Colaborador colab, String novoCargo,
                                    Double novoSalario) {
        if (novoSalario <= colab.getSalario()) {  // se novo salário é menor ou igual ao salário atual
                                                  // do colaborador
                                                  // então não realiza a promoção
            System.out.println("Não é possível realizar essa promoção");
        }
        else {                                    // senão efetua a promoção
            colab.setCargo(novoCargo);            //     configurando o novo cargo para o colaborador  
            colab.setSalario(novoSalario);        //     e configurando o novo salário para o colaborador  
            totalPromovidos++;                    //     incrementa o contador de promoções realizadas 
            System.out.println("Promoção realizada com sucesso");
        }
    }

    // Getter de totalPromovidos
    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    // Getter de totalReajustes
    public Integer getTotalReajustes() {
        return totalReajustes;
    }
    
    
}
