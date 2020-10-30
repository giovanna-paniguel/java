/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.reforco;

/** Classe Colaborador 
 *  Resolução do exercício 2 passado em aula (23/10/20)
 *
 * @author celia.taniwaki
 */
public class Colaborador {
    
    // Atributos
    private String nome;        // nome do colaborador
    private String cargo;       // cargo do colaborador
    private Double salario;     // salário do colaborador
    
    // Métodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
    // Exibe as informações do colaborador
    public void exibeColaborador() {
        System.out.println("\nInformações do colaborador:");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println(String.format("Salário: R$ %.2f",salario));
    }
    
}
