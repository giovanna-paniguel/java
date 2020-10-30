package com.mycompany.lista04;

public class Lutador {

    private Integer vida = 100;

    void apanhar() {
        vida -= 10;
    }

    void concentrarForca() {
        vida += 2;
    }

    public Integer getVida() {
        return vida;
    }   
    
}
