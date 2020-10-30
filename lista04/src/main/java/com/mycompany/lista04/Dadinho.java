package com.mycompany.lista04;

import java.util.concurrent.ThreadLocalRandom;

public class Dadinho {

    private Integer numero;
    private Integer vitorias = 0;

    void sortearNumero() {
        numero = ThreadLocalRandom.current().nextInt(1, 6);
    }
    
    void somaVitoria() {
        vitorias++;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getVitorias() {
        return vitorias;
    }
}
