
package br.com;

public class Slipper {
    
    String name;
    String brand;
    String collor;
    String quality;
    String tamanho;
    int size;
    int year;
    double price;
    
    void Value(){
        if ("Nike".equals(brand)){
            price = 180.8;
        } else if ("Adidas".equals(brand)){
            price = 158.9;
        }
    }
    
    void Quality (){
        if (price >= 160){
        quality = "Bom";
        } else { quality = "Ruim";}
    }
    
    void Size (){
        if (size >= 40){
            tamanho = "Grande";    
        } else { tamanho = "Pequeno";}
    }

public static void main(String[] args){
    
    Slipper Victory = new Slipper();
    
    Victory.name = "Victory";
    Victory.brand = "Nike";
    Victory.collor = "Black";
    Victory.size = 40;
    Victory.year = 2021;
    
    Victory.Value();
    Victory.Quality();
    Victory.Size();
    
    
    System.out.println("Valor do chinelo: " + Victory.price);
    System.out.println("Qualidade do chinelo: " + Victory.quality);
    System.out.println("Tamanho do chinelo: " + Victory.tamanho);
    
    
    Slipper Adilette = new Slipper();
    
    Adilette.name = "Adilette";
    Adilette.brand = "Adidas";
    Adilette.collor = "White";
    Adilette.size = 37;
    Adilette.year = 2017;
    
    Adilette.Value();
    Adilette.Quality();
    Adilette.Size();
    
    System.out.println("Valor do chinelo: " + Adilette.price);
    System.out.println("Qualidade do chinelo: " + Adilette.quality);
    System.out.println("Tamanho do chinelo: " + Adilette.tamanho);
    
    Slipper Adissage = new Slipper();
    
    Adissage.name = "Adissage";
    Adissage.brand = "Adidas";
    Adissage.collor = "Blue";
    Adissage.size = 42;
    Adissage.year = 2020;
    
    Adissage.Value();
    Adissage.Quality();
    Adissage.Size();
    
    System.out.println("Valor do chinelo: " + Adissage.price);
    System.out.println("Qualidade do chinelo: " + Adissage.quality);
    System.out.println("Tamanho do chinelo: " + Adissage.tamanho);
    
}
}
