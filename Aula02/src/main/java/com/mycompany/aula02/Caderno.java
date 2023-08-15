package com.mycompany.aula02;

public class Caderno {

    int pages;  //qnt de paginas
    String capa;  // dura ou normal
    String cor; //cor do caderno
    String marca;
    double aro; //tamanho do aro

    boolean aberto;

    int passador;

    //--------------------------------
    void abrir() {

        if (this.aberto == false) {

            this.aberto = true;

            System.out.println("Abrindo o caderno");

        } else {
            System.out.println("Já esta aberto!");
        }

    }

    ;
    
    void passar_page() {

        System.out.println("Passando mais uma página....");
        this.passador = this.passador++;

    }

    ;
    
    void voltar_page() {

        System.out.println("Voltando uma página para trás");
        this.passador = this.passador--;

    }

    ;
    
    
    void fechar() {
        if (this.aberto == true) {

            this.aberto = false;

            System.out.println("Fechando o caderno...");

        } else {
            System.out.println("Já esta fechado!");
        }

    }

    ;
    
    void escrever(int carga_caneta) {
         if(carga_caneta > 0){
             
             System.out.println("Escrevendo no caderno com a sua caneta...");
                
         
             
        }else{
              System.out.println("Caneta sem carga");
         }
        
       

    }
;

}
