
package com.mycompany.aula02;


public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int Carga;
    
    
    
    
    boolean Tampada;
    
    void rabiscar(){
    
        if( this.Tampada == false ){
          
            System.out.println("Escrevendo com a caneta");
        
        
        }else{
                    System.out.println("Não posso rabiscar pois está tampada");
        }  
    
    };
    
    void tampar(){
      
        if(this.Tampada == false){
             System.out.println("Tampando a caneta..");
            this.Tampada = true;
        }else{
             System.out.println("A caneta já está tampada");
        }
    
     
    
    };
    
    void destampar(){
          
       if(this.Tampada = true ) {
            System.out.println("Destampando a caneta..");
           
           this.Tampada = false;
       } else{
         System.out.println("A caneta já está tampada");} 
           
    
    
    
    };
    
    void status(){
        System.out.println("Aqui está sua caneta--> \n Cor: " + this.cor + "\n Sua Marca: " + this.modelo + "\n Ponta: " + this.ponta + "\n Carga: " + this.Carga+ "\n Tampada? " + this.Tampada);
        
        
        
    }
    
    
}
