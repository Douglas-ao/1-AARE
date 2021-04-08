
package br.com;

public class Calculadora {
    
    double sum( double numeroUm, double numeroDois) {
        return (int)numeroUm + numeroDois;
    }
    
    double subtrair( double primeiro, double segundo){
       return primeiro - segundo;  
    }
    
    int div( int numUm, int numDois){
        return numUm / numDois;
    }
     
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        
        double resultado = calculadora.sum(5, 4);
        System.out.println("Raiz quadrada da soma de 5+4: " + Math.sqrt(resultado));
        
        Calculadora calculoDois = new Calculadora();
        
        double resultadoDois = calculoDois.subtrair(23.7, 5.8);
        System.out.println("23.7 - 5.8: " + resultadoDois);
        System.out.println("5+4 x 23.7-5.8: " + resultado * resultadoDois);
        
        Calculadora calculoTres = new Calculadora();
        
        double resultadoTres = calculoTres.div(78,3);
        System.out.println("78/4: " + resultadoTres);
        System.out.println("78/4 + 5+4: " + resultadoTres * resultado);
   }
    
   
   
       
   }

