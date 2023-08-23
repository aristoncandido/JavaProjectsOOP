
package com.mycompany.aula02;


public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
   public void rabiscar(){
    
        if( this.tampada == false ){
          
            System.out.println("Escrevendo com a caneta");
        
        
        }else{
                    System.out.println("Não posso rabiscar pois está tampada");
        }  
    
    };
    
  public void tampar(){
      
        if(this.tampada == false){
             System.out.println("Tampando a caneta..");
            this.tampada = true;
        }else{
             System.out.println("A caneta já está tampada");
        }
    
     
    
    };
    
    public void destampar(){
          
       if(this.tampada = true ) {
            System.out.println("Destampando a caneta..");
           
           this.tampada = false;
       } else{
         System.out.println("A caneta já está tampada");} 
           
    
    
    
    };
    
   public void status(){
        System.out.println("Aqui está sua caneta--> \n Cor: " + this.cor + "\n Sua Marca: " + this.modelo + "\n Ponta: " + this.ponta + "\n Carga: " + this.carga+"Tampada?" + this.tampada);
        
           
     
    }
    
    
}
