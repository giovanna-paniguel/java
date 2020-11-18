package com.mycompany.lista.reforco;

public class ProcessoSeletivo {

    private Integer totalProva;
    private Integer totalDinamica;
    private Integer totalAprovado;

    public ProcessoSeletivo() {
        this.totalProva = 0;
        this.totalDinamica = 0;
        this.totalAprovado = 0;
    }

    public void registraProva(Candidato candidato, Double notaProva) {
        if (candidato.getFezProva().equals(false)) {
            System.out.println("O candidato não compareceu a prova!");
        } else if (candidato.getFezProva().equals(true) || notaProva >= 7) {
            totalProva++;
            candidato.setFezProva(true);
            System.out.println(String.format("“o Candidato %s de id %d realizou a prova e tirou nota %d", candidato.getNome(),
                    candidato.getIdCandidato(),
                    candidato.getNotaProva())
            );
        }
    }

    public void registraDinamica(Candidato candidato, Double notaDinamica) {
        
        if(candidato.calcularMedia() >= 7){
           candidato.setAprovado(true);
        }
        if (!candidato.getFezProva().equals(true)) {
            System.out.println("ERRO! Este cantidado não fez a prova!");
        } else if (notaDinamica == 0){
            totalDinamica++;
            candidato.calcularMedia();
            System.out.println(String.format("o Candidato %s de id %d realizou a dinamica e foi está recebendo alta e deve pagar R$ %.2f", candidato.getNome(),
                    candidato.getIdCandidato(),
                    candidato.calcularValorTotal(candidato.getValorDiaria(), candidato.getQtdDias(), candidato.getValorCirurgia())));
        }
    }

}
