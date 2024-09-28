package org.example.model;
public class Store{
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        Coke coke = new Coke("Light", 10, "Drink");
        Bread bread = new Bread("Not Light", 20, "Meal");
        Chocolate chocolate = new Chocolate("Big", 35, "Desert");
        products[0] = coke;
        products[1] = bread;
        products[2] = chocolate;
        listProducts(products);

        Troll troll = new Troll("White Tiger", 10, 1500);
        System.out.println(troll.attack(troll));
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}