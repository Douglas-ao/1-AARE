package br.com;

public class Bike {
    
    String brand;
    String collor;
    int year;
    int rim;
    int currentgear = 0;
    double currentspeed = 0;
   
    
    void Accelerate() {
        Changegear(currentspeed);
        currentspeed += 2;
    }
   
    void Changegear(double speed){
        if (currentspeed < 5) {
            currentgear = 1;
        } else if (currentspeed > 5 && currentspeed < 10){
            currentgear = 2;
        }
    }
    
    void Collor(){
        if (currentspeed >= 2.0){
            collor = "Black";
        }
    }

    @Override
    public String toString() {
        return "Bike{" + "brand=" + brand + ", collor=" + collor + ", year=" + year + ", rim=" + rim + ", currentgear=" + currentgear + ", currentspeed=" + currentspeed + '}';
    }
           
public static void main(String[] args){

    Bike Caloi = new Bike();
    
    Caloi.brand = "Caloi";
    Caloi.collor = "Blue";
    Caloi.year = 2020;
    Caloi.rim = 29;
    
    System.out.println(Caloi.toString());
    System.out.println("Marcha Inicial " + Caloi.currentgear);
    System.out.println("Velocidade inicial " + Caloi.currentspeed + " Km/h");
    System.out.println("Cor atual " + Caloi.collor);
    
    Caloi.Accelerate();
    Caloi.Collor();
    
    System.out.println("Marcha atual " + Caloi.currentgear);
    System.out.println("Velocidade atual " + Caloi.currentspeed + " Km/h");
    System.out.println("Mudou a cor para " + Caloi.collor);
    
    Bike SCOTT = new Bike();
    
    SCOTT.brand = "SCOTT";
    SCOTT.collor = "Black";
    SCOTT.year = 2018;
    SCOTT.rim = 29; 
       
    System.out.println(SCOTT.toString());
    System.out.println("Marcha Inicial " + SCOTT.currentgear);
    System.out.println("Velocidade inicial " + SCOTT.currentspeed + " Km/h");
    System.out.println("Cor atual " + SCOTT.collor);
    
    SCOTT.Accelerate();
    SCOTT.Collor();
    
    System.out.println("Marcha atual " + SCOTT.currentgear);
    System.out.println("Velocidade atual " + SCOTT.currentspeed + " Km/h");
    System.out.println("Mudou a cor para " + SCOTT.collor);
    
    Bike Trek = new Bike();
    
    Trek.brand = "Trek";
    Trek.collor = "Green";
    Trek.year = 2017;
    Trek.rim = 29;
            
    System.out.println(Trek.toString());
    System.out.println("Marcha Inicial " + Trek.currentgear);
    System.out.println("Velocidade inicial " + Trek.currentspeed + " Km/h");
    System.out.println("Cor atual " + Trek.collor);
    
    Trek.Accelerate();
    Trek.Collor();
    
    System.out.println("Marcha atual " + Trek.currentgear);
    System.out.println("Velocidade atual " + Trek.currentspeed + " Km/h");
    System.out.println("Mudou a cor para " + Trek.collor);
}
}