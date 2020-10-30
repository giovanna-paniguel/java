package com.mycompany.lista05;

public class AlunoConsole {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.calcularAprovacao(10, 10, 95);
        aluno2.calcularAprovacao(7, 7, 75);
        aluno3.calcularAprovacao(3, 3, 10);

        System.out.println(String.format("Aluno 1: %s", aluno1.getResultado()));
        System.out.println(String.format("Aluno 2: %s", aluno2.getResultado()));
        System.out.println(String.format("Aluno 3: %s", aluno3.getResultado()));

    }

}
