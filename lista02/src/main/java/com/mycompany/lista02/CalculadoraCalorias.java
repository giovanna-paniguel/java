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
public class CalculadoraCalorias {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer aquecimento, aerobicos, musculacao, tempoExercicio, calPerdidas;

        System.out.println("Digite, em minutos, quanto tempo você passou se aquecendo:");
        aquecimento = leitor.nextInt();
        System.out.println("Digite, em minutos, quanto tempo você passou fazendo exercícios aeróbicos:");
        aerobicos = leitor.nextInt();
        System.out.println("Digite, em minutos, quanto tempo você passou fazendo musculação:");
        musculacao = leitor.nextInt();

        tempoExercicio = aquecimento + aerobicos + musculacao;
        calPerdidas = (aquecimento * 12) + (aerobicos * 20) + (musculacao * 25);

        System.out.println(String.format("Olá Jorge. Você fez um total de %d de minutos de exercícios e perdeu cerca de %d calorias", tempoExercicio, calPerdidas));

    }
}
