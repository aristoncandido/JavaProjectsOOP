
package com.mycompany.aula02;

public class TestesDesenho {
    
    
  public static void main(String[] args){
     
      Anime naruto = new Anime();
      
      
      naruto.nome = "Naruto Uzumaki";
      naruto.tipo = "Anime";
      naruto.país ="Japão";
      naruto.filers =true;
      naruto.eps = 520;
      naruto.OVA = false;
      naruto.q_filmes = 10;
      naruto.situacao = false;
      naruto.temporadas = 20;
      
       
     Anime acessador = new Anime();
      
      System.out.println(naruto.getSituacao());
      
      
      
      
      
 
       
      
  
  
  
  
  }
    
    
}
