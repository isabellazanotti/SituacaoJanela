/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.saladeaula;

/**
 *
 * @author senai
 */
public class SalaDeAula {

    public static void main(String[] args) {
        
       Janela janete = new Janela();
       
       janete.setAbrir(true);
       janete.setFechar(false);
       janete.abrir();
       System.out.println(janete.getSituacaoJanela());
          
    }
}
