package br.com;

public class Sneakers {
    
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
            price = 260.8;
        } else if ("Adidas".equals(brand)){
            price = 208.9;
        }
    }
    
    void Quality (){
        if (price >= 210){
        quality = "Bom";
        } else { quality = "Ruim";}
    }
    
    void Size (){
        if (size >= 40){
            tamanho = "Grande";    
        } else { tamanho = "Pequeno";}
    }

public static void main(String[] args){
    
    Sneakers Air = new Sneakers();
    
    Air.name = "Air ";
    Air.brand = "Nike";
    Air.collor = "Black";
    Air.size = 39;
    Air.year = 2021;
    
    Air.Value();
    Air.Quality();
    Air.Size();
    
    
    System.out.println("Valor do tÃªnis: " + Air.price);
    System.out.println("Qualidade do tÃªnis: " + Air.quality);
    System.out.println("Tamanho do tÃªnis: " + Air.tamanho);
    
    Sneakers Superstar = new Sneakers();
    
    Superstar.name = "Superstar";
    Superstar.brand = "Adidas";
    Superstar.collor = "White";
    Superstar.size = 40;
    Superstar.year = 2020;
    
    Superstar.Value();
    Superstar.Quality();
    Superstar.Size();
    
    
    System.out.println("Valor do tÃªnis: " + Superstar.price);
    System.out.println("Qualidade do tÃªnis: " + Superstar.quality);
    System.out.println("Tamanho do tÃªnis: " + Superstar.tamanho);
    
    Sneakers Continental = new Sneakers();
    
    Continental.name = "Superstar";
    Continental.brand = "Adidas";
    Continental.collor = "Blue";
    Continental.size = 42;
    Continental.year = 2018;
    
    Continental.Value();
    Continental.Quality();
    Continental.Size();
    
    
    System.out.println("Valor do tÃªnis: " + Continental.price);
    System.out.println("Qualidade do tÃªnis: " + Continental.quality);
    System.out.println("Tamanho do tÃªnis: " + Continental.tamanho);
    
}
    
}

