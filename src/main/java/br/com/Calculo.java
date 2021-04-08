
package br.com;

public class Calculo {
    int soma( int km, int litro ) {
        return km / litro;
    }
    
    public static void main(String[] args) {
        
        Calculo kmLitro = new Calculo();
        
        double resultado = kmLitro.soma(180, 19);
        
        System.out.println("Gasta : " + resultado + " km por litro.");
    }
    
}

 
