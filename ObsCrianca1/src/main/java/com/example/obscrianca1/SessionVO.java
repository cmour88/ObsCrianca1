package com.example.obscrianca1;

/**
 * Created by carlos on 16-01-2014.
 */

import java.util.Date; //para aceitar a variável data

public class SessionVO {

    private String data; //Date
    private String experienciasdeaprendizagem;
    private String grupo;
    private String interacao;
    private int ntotaladultos;
    private int ncriancas;
    private int niveldeenvolvimento;
    private int ntotaldecriancas;
    private int niveldeiniciativa;

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return data;
    }

    public void setExperienciasdeaprendizagem(String experienciasdeaprendizagem){
        this.experienciasdeaprendizagem = experienciasdeaprendizagem;
    }

    public String getExperienciasdeaprendizagem(){
        return experienciasdeaprendizagem;
    }

    public void setGrupo(String grupo){
        this.grupo = grupo;
    }

    public String getGrupo(){
        return grupo;
    }

    public void setInteracao(String interacao){
        this.interacao = interacao;
    }

    public String getInteracao(){
        return interacao;
    }

    public void setNtotaladultos(int ntotaladultos){
        this.ntotaladultos = ntotaladultos;
    }

    public int getNtotaladultos(){
        return ntotaladultos;
    }

    public void setNcriancas(int ncriancas){
        this.ncriancas = ncriancas;
    }

    public int getNcriancas(){
        return ncriancas;
    }

    public void setNiveldeenvolvimento(int niveldeenvolvimento){
        this.niveldeenvolvimento = niveldeenvolvimento;
    }

    public int getNiveldeenvolvimento(){
        return niveldeenvolvimento;
    }

    public void setNtotaldecriancas(int ntotaldecriancas){
        this.ntotaldecriancas = ntotaldecriancas;
    }

    public int getNtotaldecriancas(){
        return ntotaldecriancas;
    }

    public void setNiveldeiniciativa(int niveldeiniciativa){
        this.niveldeiniciativa = niveldeiniciativa;
    }

    public int getNiveldeiniciativa(){
        return niveldeiniciativa;
    }
}
