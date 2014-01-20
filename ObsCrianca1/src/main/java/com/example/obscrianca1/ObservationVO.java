package com.example.obscrianca1;

/**
 * Created by carlos on 15-01-2014.
 */

//Entidade Gerador de gerar classes de entidade
//com getters e setters para cada tabela

public class ObservationVO {

    private int cidade; //childAge
    private String cnome; //childName
    private String csexo; //childSex
    private String observador; //observer
    private String escola; //school
    private Boolean nes;

    public void setCIdade(int cidade) {
        this.cidade = cidade;
    }

    public int getCIdade(){
        return cidade;
    }

    public void setCNome(String cnome){
        this.cnome = cnome;
    }

    public String getCNome(){
        return cnome;
    }

    public void setCSexo(String csexo){
        this.csexo = csexo;
    }

    public String getCSexo(){
        return csexo;
    }

    public void setObservador(String observador){
        this.observador = observador;
    }

    public String getObservador(){
        return observador;
    }

    public void setEscola(String escola){
        this.escola = escola;
    }

    public String getEscola(){
        return escola;
    }

    public void setNes(Boolean nes){
        this.nes = nes;
    }

    public Boolean getNes(){
        return nes;
    }

}
