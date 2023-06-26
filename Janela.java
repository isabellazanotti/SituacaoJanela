/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saladeaula;

/**
 *
 * @author senai
 */
public class Janela {
    private boolean fechar;
    private boolean abrir;
    private String SituacaoJanela;
    
    public void setAbrir(boolean abrir){
        this.abrir= abrir;
    }  
    public boolean getAbrir(){
        return this.abrir;
    }
     public void setFechar(boolean fechar){
        this.fechar= fechar;
    }  
    public boolean getFechar(){
        return this.fechar;
    }
     public void setSituacaoJanela(String SituacaoJanela){
        this.SituacaoJanela= SituacaoJanela;  
    } 
    public String getSituacaoJanela(){
        return this.SituacaoJanela;
    }
    public void abrir(){
        setSituacaoJanela("Abrindo..");
        System.out.println("A janela foi aberta: ");
    }
     public void fechar(){
        setSituacaoJanela("Fechando..");
        System.out.println("A janela foi fechada: ");
    }
}
