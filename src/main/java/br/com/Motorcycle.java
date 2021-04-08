package br.com;

public class Motorcycle {
    
    String name;
    String brand;
    String collor;
    String quality;
    int year;
    int model;
    double speed = 0;
    
    void Speed() {
        Moto();
        speed += 100;
    }
   
    void Moto(){
        if (speed >= 100) {
            quality = "Good";
        }
    }
    
    void Collor(){
        if (speed >= 100){
            collor = "Black";
        }
    } 

    @Override
    public String toString() {
        return "Motorcycle{" + "name=" + name + ", brand=" + brand + ", collor=" + collor + ", quality=" + quality + ", year=" + year + ", model=" + model + ", speed=" + speed + '}';
    }
    
    

public static void main(String[] args){

    Motorcycle Hornet = new Motorcycle();
    
    Hornet.name = "Hornet";
    Hornet.brand = "Honda";
    Hornet.collor = "Blue";
    Hornet.year = 2020;
    Hornet.model = 2021;
    
    System.out.println(Hornet.toString());
    System.out.println("Velocidade inicial: " + Hornet.speed + " Km/h");
    System.out.println("Cor atual: " + Hornet.collor);
    System.out.println("Qualidade da moto: " + Hornet.quality);
    
    Hornet.Speed();
    Hornet.Collor();
    Hornet.Moto();
    
    System.out.println("Velocidade atual: " + Hornet.speed + " Km/h");
    System.out.println("Mudou a cor para: " + Hornet.collor);
    System.out.println("Qualidade da moto: " + Hornet.quality);
    
    Motorcycle Falcon = new Motorcycle();

    Falcon.name = "Falcon";
    Falcon.brand = "Honda";
    Falcon.collor = "Black";
    Falcon.year = 2013;
    Falcon.model = 2014;
    
    System.out.println(Falcon.toString());
    System.out.println("Velocidade inicial: " + Falcon.speed + " Km/h");
    System.out.println("Cor atual: " + Falcon.collor);
    System.out.println("Qualidade da moto: " + Falcon.quality);
    
    Falcon.Speed();
    Falcon.Collor();
    Falcon.Moto();
    
    System.out.println("Velocidade atual: " + Falcon.speed + " Km/h");
    System.out.println("Continuou na mesma cor: " + Falcon.collor);
    System.out.println("Qualidade da moto: " + Falcon.quality);
    
    Motorcycle Twister = new Motorcycle();

    Twister.name = "Twister";
    Twister.brand = "Honda";
    Twister.collor = "Red";
    Twister.year = 2012;
    Twister.model = 2013;
    
    System.out.println(Twister.toString());
    System.out.println("Velocidade inicial: " + Twister.speed + " Km/h");
    System.out.println("Cor atual: " + Twister.collor);
    System.out.println("Qualidade da moto: " + Twister.quality);
    
    Twister.Speed();
    Twister.Collor();
    Twister.Moto();
    
    System.out.println("Velocidade atual: " + Twister.speed + " Km/h");
    System.out.println("Mudou a cor para: " + Twister.collor);
    System.out.println("Qualidade da moto: " + Twister.quality);
    
}

}
