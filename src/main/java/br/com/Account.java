package br.com;

public class Account {
    
    // Cinco atributos
    
    String holder;
    String nationality;
    double accountBalance = 0;
    double rate = 2;
    double totalRate;
    
    //Três métodos // Método manipalando a variável

    void deposit(double value) {
        accountBalance += value;
        System.out.println("Conta: " + holder);
        System.out.println("Nacionalidade : " + nationality);
        System.out.println("Você depositou: " + value); 
    }
    
    // Método com retorno verdadeiro ou falso // Método manipulando a variável 
    
    boolean withdraw(double value) {
        if (accountBalance >= value) {
            accountBalance -= value;
            System.out.println("Você retirou da conta um saldo de: " + value);
            return true;
        } else {
            System.out.println("Você não tem saldo suficiente! ");
            return false;
        }
    }
    
    // Método manipulando a variável // Método chamando outro método 
    
    void transfer(double value) {
        if (value <= 300){
            rate = 1;    
        }
        System.out.println("Taxa de tranferencia: " + rate + "%");
        totalRate = (rate / 100.0) * value;
        this.withdraw(value);
        this.messageTransfer();
        System.out.println("Seu saldo é de taxa: " + accountBalance);
    }
    
    void messageTransfer(){
        System.out.println("Totalizando o valor de: " + totalRate);
        accountBalance -= totalRate; 
        
    }
   
     // Método main 
    
    public static void main(String[] args) {
        Account gabriela = new Account();
        gabriela.holder = "Gabriela Fernanda da Silva";
        gabriela.nationality = "Brasileira";
        gabriela.deposit(360);
        gabriela.withdraw(250);
        gabriela.transfer(120);

        Account keity = new Account();
        keity.holder = "Keity Meireles";
        keity.nationality = "Brasileira";
        keity.deposit(850);
        keity.withdraw(350);
        keity.transfer(300);

        Account luiza = new Account();
        luiza.holder = "Luiza Rafaela de Oliveira";
        luiza.nationality = "Brasileira";
        luiza.deposit(900);
        luiza.withdraw(250);
        luiza.transfer(450);

    }
}
