package com.Lab3.ejercicio3;

public class SalesItem {
    private int id;
    private String description;
    private int quantity;
    private double price;

    public SalesItem(int id, String description, int quantity, double price) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getTotalPrice(){
        return (double)quantity*price;
    }

    public void printSalesItemData(){
        System.out.println("Item: [ID: "+this.id+"] [Description: "+this.description+"] [Quantity: "+this.quantity+"] " +
                "[Price: $"+this.price+"]"+"] [TotalPrice: $"+getTotalPrice()+"]");
    }
}
