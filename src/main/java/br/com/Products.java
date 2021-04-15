package br.com;

public class Products {

    int id;
    String name;
    double product;
    double discount = 5;
    double total;

    double discount() {
        if (product > 200) {
            return discount = 20;
        } else {
            return discount = 5;
        }
    }

    void padrao() {
        System.out.println("Nome do produto: " + name);
        System.out.println("Valor do produto: " + product);
        double discountValue = (discount / 100.0) * product;
        total = product - discountValue;
        System.out.println(discount + "% de desconto: " + discountValue);
        System.out.println("Valor total: " + total);

    }

    public void mensagem() {
        if (discount == 20) {
            System.out.println("Você conseguiu o desconto maximo!");
        } else {
            System.out.println("Você não conseguiu o desconto maximo!");
        }
    }

    public static void main(String[] args) {
        Products undershirts = new Products();
        undershirts.id = 1;
        undershirts.name = "Undershirts";
        undershirts.product = 75.00;
        undershirts.discount();
        undershirts.padrao();
        undershirts.mensagem();

        Products shorts = new Products();
        shorts.id = 2;
        shorts.name = "Shorts";
        shorts.product = 150.00;
        shorts.discount();
        shorts.padrao();
        shorts.mensagem();

        Products blouses = new Products();
        blouses.id = 3;
        blouses.name = "Blouses";
        blouses.product = 230.00;
        blouses.discount();
        blouses.padrao();
        blouses.mensagem();

    }

}
