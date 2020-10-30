package com.mycompany.lista04;

public class Elevador {
    private Integer peso = 0;
    private Integer totalPassageiros = 0;
    
    void entrarHomem(){
        peso += 90;
        totalPassageiros++;
    }
    
    void entrarMulher(){
        peso += 65;
        totalPassageiros++;
    }
    
    void entrarCrianca(){
        peso += 40;
        totalPassageiros++;
    }

    public Integer getPeso() {
        return peso;
    }

    public Integer getTotalPassageiros() {
        return totalPassageiros;
    }
    
    
}
