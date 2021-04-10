package br.com;

public class CommerceOne {

    int id;
    String name;
    double valueProduct;
    double discount;
    double discountValue;
    double total;

    public static void main(String[] args) {
        CommerceOne phone = new CommerceOne();
        phone.id = 0001;
        phone.name = "Phone";
        phone.valueProduct = 75.00;
        phone.discount = 10.0;
        phone.phone();

        CommerceOne clock = new CommerceOne();
        clock.id = 0002;
        clock.name = "Clock";
        clock.valueProduct = 250.00;
        clock.discount = 15.0;
        clock.clock();

        CommerceOne cell = new CommerceOne();
        cell.id = 0003;
        cell.name = "Cell";
        cell.valueProduct = 1450.00;
        cell.discount = 20.0;
        cell.cell();

    }

    void phone() {
        if (id == 0001) {
            discountValue = (discount / 100.0) * valueProduct;
            total = valueProduct - discountValue;
            System.out.println("Nome do produto: " + name);
            System.out.println("Valor do produto: " + valueProduct);
            System.out.println(discount + "% de desconto: " + discountValue);
            System.out.println("Valor total: " + total);
        }
    }

    void clock() {
        if (id == 0002) {
            discountValue = (discount / 100.0) * valueProduct;
            total = valueProduct - discountValue;
            System.out.println("Nome do produto: " + name);
            System.out.println("Valor do produto: " + valueProduct);
            System.out.println(discount + "% de desconto: " + discountValue);
            System.out.println("Valor total: " + total);
        }
    }

    void cell() {
        if (id == 0003) {
            discountValue = (discount / 100.0) * valueProduct;
            total = valueProduct - discountValue;
            System.out.println("Nome do produto: " + name);
            System.out.println("Valor do produto: " + valueProduct);
            System.out.println(discount + "% de desconto: " + discountValue);
            System.out.println("Valor total: " + total);
        }
    }
}
