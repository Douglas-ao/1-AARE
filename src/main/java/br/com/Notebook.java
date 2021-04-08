
package br.com;

public class Notebook {
    
    String brand;
    String collor;
    String processor;
    String qualityram;
    float screen;
    int hd;
    int ram;
    double speedprocessor = 0 ;
    
    void Speed() {
        Quality();
        speedprocessor += 2.8;
    }
   
    void Quality(){
        if (speedprocessor >= 2.8) {
            processor = "Good";
        }
    }
    
    void Ram(){
        if (ram > 8){
            qualityram = "Ã“timo";
        }else { qualityram = "Rasoavel";}
    } 

    @Override
    public String toString() {
        return "Notebook{" + "brand=" + brand + ", collor=" + collor + ", processor=" + processor + ", screen=" + screen + ", hd=" + hd + ", ram=" + ram + '}';
    }
    
    
    
 public static void main(String[] args){

    Notebook Lenovo = new Notebook();
    
    Lenovo.brand = "Lenovo";
    Lenovo.collor = "Black";
    Lenovo.processor = "Intel Core I7";
    Lenovo.screen = (float) 15.6;
    Lenovo.hd = 1000;
    Lenovo.ram = 12;
    
    System.out.println(Lenovo.toString());
    System.out.println("Velocidade do processador desligado: " + Lenovo.speedprocessor + " GHz");
    System.out.println("Processador: " + Lenovo.processor);
    System.out.println("Memoria ram: " + Lenovo.ram);
    
    Lenovo.Speed();
    Lenovo.Quality();
    Lenovo.Ram();
    
    System.out.println("Velocidade do processador: " + Lenovo.speedprocessor + " GHz");
    System.out.println("Qualidade do processador: " + Lenovo.processor);
    System.out.println("Memoria ram: " + Lenovo.qualityram);
    
    Notebook Acer = new Notebook();
    
    Acer.brand = "Acer";
    Acer.collor = "Grey";
    Acer.processor = "Intel Core I5";
    Acer.screen = (float) 15.6;
    Acer.hd = 1000;
    Acer.ram = 8;
    
    System.out.println(Acer.toString()); 
    System.out.println("Velocidade do processador desligado: " + Acer.speedprocessor + " GHz");
    System.out.println("Processador: " + Acer.processor);
    System.out.println("Memoria ram: " + Acer.ram);
    
    Acer.Speed();
    Acer.Quality();
    Acer.Ram();
    
    System.out.println("Velocidade do processador: " + Acer.speedprocessor + " GHz");
    System.out.println("Qualidade do processador: " + Acer.processor);
    System.out.println("Memoria ram: " + Acer.qualityram);
    
    Notebook Dell = new Notebook();
    
    Dell.brand = "Dell";
    Dell.collor = "Black";
    Dell.processor = "Intel Core I9";
    Dell.screen = (float) 15.6;
    Dell.hd = 2000;
    Dell.ram = 16;
    
    System.out.println(Dell.toString());
    System.out.println("Velocidade do processador desligado: " + Dell.speedprocessor + " GHz");
    System.out.println("Processador: " + Dell.processor);
    System.out.println("Memoria ram: " + Dell.ram);
    
    Dell.Speed();
    Dell.Quality();
    Dell.Ram();
    
    System.out.println("Velocidade do processador : " + Dell.speedprocessor + " GHz");
    System.out.println("Qualidade do processador: " + Dell.processor);
    System.out.println("Memoria ram: " + Dell.qualityram);         
}
}
