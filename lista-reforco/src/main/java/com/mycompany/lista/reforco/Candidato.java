package com.mycompany.lista.reforco;

public class Candidato {
    
    private Integer idCandidato;
    private String nome;
    private String cursoDesejado;
    private Double notaProva;
    private Double notaDinamica;
    private Boolean fezProva;
    private Boolean aprovado;
    
    public Candidato() {
        this.idCandidato = 0;
        this.nome = "Giovanna";
        this.cursoDesejado = "Marketing";
        this.notaDinamica = 0.0;
        this.notaProva = 0.0;
        this.fezProva = false;
        this.aprovado = false;
        
    }
    
    public Double calcularMedia(){
        return notaProva + notaDinamica / 2;
    }
    
    public Integer getIdCandidato() {
        return idCandidato;
    }

    public String getNome() {
        return nome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public Double getNotaDinamica() {
        return notaDinamica;
    }

    public Double getNotaProva() {
        return notaProva;
    }

    public Boolean getFezProva() {
        return fezProva;
    }

    public void setIdCandidato(Integer idCandidato) {
        this.idCandidato = idCandidato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }
    
    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void setNotaDinamica(Double notaDinamica) {
        this.notaDinamica = notaDinamica;
    }

    public void setNotaProva(Double notaProva) {
        this.notaProva = notaProva;
    }
    
    public void setFezProva(Boolean fezProva) {
        this.fezProva = fezProva;

    }
    
}
