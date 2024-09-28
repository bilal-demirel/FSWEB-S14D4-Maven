package org.example.model;

public class Bread extends ProductForSale{
    public String pastry;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }
    @Override
    public void showDetails(){
        System.out.println("Bu bir ekmek.");
    }
}
