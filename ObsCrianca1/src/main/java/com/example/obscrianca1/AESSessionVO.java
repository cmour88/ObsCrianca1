package com.example.obscrianca1;

/**
 * Created by carlos on 16-01-2014.
 */
import java.util.Date;

public class AESSessionVO {

    private Date data;
    private int ntotalnes;
    private int ntotaladultos;
    private int ntotalcriancas;
    private int niveldesensibilidade;
    private int niveldeestimulacao;
    private int niveldeautonomia;

    public void setData(Date data){
        this.data = data;
    }

    public Date getData(){
        return data;
    }

    public void setNtotalnes(int ntotalnes){
        this.ntotalnes = ntotalnes;
    }

    public int getNtotalnes(){
        return ntotalnes;
    }

    public void setNtotaladultos(int ntotaladultos){
        this.ntotaladultos = ntotaladultos;
    }

    public int getNtotaladultos(){
        return ntotaladultos;
    }

    public void setNtotalcriancas(int ntotalcriancas){
        this.ntotalcriancas = ntotalcriancas;
    }

    public int getNtotalcriancas(){
        return ntotalcriancas;
    }

    public void setNiveldesensibilidade(int niveldesensibilidade){
        this.niveldesensibilidade = niveldesensibilidade;
    }

    public int getNiveldesensibilidade(){
        return niveldesensibilidade;
    }

    public void setNiveldeestimulacao(int niveldeestimulacao){
        this.niveldeestimulacao = niveldeestimulacao;
    }

    public int getNiveldeestimulacao(){
        return niveldeestimulacao;
    }

    public void setNiveldeautonomia(int niveldeautonomia){
        this.niveldeautonomia = niveldeautonomia;
    }

    public int getNiveldeautonomia(){
        return niveldeautonomia;
    }
}
