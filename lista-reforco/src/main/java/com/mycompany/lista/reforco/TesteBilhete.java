package com.mycompany.lista.reforco;

public class TesteBilhete {

    public static void main(String[] args) {

        BilheteUnico bilhete1 = new BilheteUnico();
        
        bilhete1.setCpf("519.987.221-02");
        bilhete1.setTitular("Giovanna Paniguel");
        bilhete1.setSaldo(220.00);
        bilhete1.setPrimeiraPassagem(true);
       
        bilhete1.recarregar(20.00);
        bilhete1.passagemComum();
        bilhete1.passagemIntegracao();
        

    }

}
