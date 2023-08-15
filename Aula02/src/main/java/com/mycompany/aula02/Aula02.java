/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula02;



public class Aula02 {

    public static void main(String[] args) {

         
        Caneta c1 = new Caneta();
        
        
        c1.cor = "Preta";
        c1.Tampada = true;
        c1.modelo = "Bic";
        c1.Carga = 0;
        c1.ponta = 0.5f;

    
        
        
        Caderno agenda = new Caderno();
        
        
        agenda.aberto = false;
        agenda.aro = 2.1;
        agenda.capa = "dura";
        agenda.marca = "Tilibra";
        agenda.cor = "Preto";
        agenda.pages = 150; // 150 páginas
        agenda.passador = 0 ;
        agenda.escrever(c1.Carga);
           
        
              
        
        
        
        
        
        
        
       
        
        
        
        
        
    }
}
