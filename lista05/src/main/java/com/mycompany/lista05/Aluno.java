package com.mycompany.lista05;

public class Aluno {
    
    private Integer nota1 = 0;
    private Integer nota2 = 0;
    private Integer frequencia = 0;
    private Double media = 0.0;
    
    private String resultado;
    private String cor;
    
    void calcularAprovacao(Integer nota1Digitada, Integer nota2Digitada, Integer frequenciaDigitada){
        nota1 = nota1Digitada;
        nota2 = nota2Digitada;
        frequencia = frequenciaDigitada;
        
        media = (nota1 + nota2) / 2.0;
        
        if (media > 9 && frequencia > 90){
            resultado = "Aluno(a) aprovado com louvor";
            cor = "#0000ff";
        } else if (media >= 6 && frequencia >= 75) {
            resultado = "Aluno(a) aprovado";
            cor = "#00ff00";
        } else if (media < 6 || frequencia < 75) {
            resultado = "Aluno(a) reprovado";
            cor = "#ff0000";
        }
    
    }

    public String getResultado() {
        return resultado;
    }

    public String getCor() {
        return cor;
    }
   
}
