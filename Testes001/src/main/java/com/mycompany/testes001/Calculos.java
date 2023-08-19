


package com.mycompany.testes001;

import java.util.Scanner;

public class Calculos {

    public static void main(String[] args) {
        
          Scanner teclado = new Scanner(System.in);
        
        
        
        
        
        System.out.println("Vamos calcular?");
        System.out.println("Digite qual operação deseja realizar:");
        System.out.println("-------------------------------------- \n");
        System.out.print("+ ADIÇÃO  | ");
        System.out.println("- SUBTRAÇÃO     | ");
        System.out.print("/ DIVISÃO | ");
        System.out.println("* MULTIPLICAÇÃO | ");
        
        String op = teclado.next();// esperar resultado
        
        
        switch(op){
            
            
           case "+":
                System.out.println("Digite o primeiro número: ");
                double num1 = teclado.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num2 = teclado.nextDouble();
                double resultadoSoma = num1 + num2;
                System.out.println("Resultado da adição: " + resultadoSoma);
                break;
            
            case "-":
                System.out.println("Digite o primeiro número: ");
                double num3 = teclado.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num4 = teclado.nextDouble();
                double resultadoSubtracao = num3 - num4;
                System.out.println("Resultado da subtração: " + resultadoSubtracao);
                break;
             
            case "/":
                System.out.println("Digite o primeiro número: ");
                double num5 = teclado.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num6 = teclado.nextDouble();
                if (num6 != 0) {
                    double resultadoDivisao = num5 / num6;
                    System.out.println("Resultado da divisão: " + resultadoDivisao);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            
            case "*":
                System.out.println("Digite o primeiro número: ");
                double num7 = teclado.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num8 = teclado.nextDouble();
                double resultadoMultiplicacao = num7 * num8;
                System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
                break;
                
            default:
                System.out.println("Operação inválida.");
        }
            
            
        }
        
      
        
        
        
        
        
        
    }
}
