package com.Lab3.exercise2;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.UUID;

public class Invoice {
    private UUID id;
    private Date date;
    private Client client;
    private SalesItem[] items;
    private Double totalAmount;

    public Invoice(Client client, SalesItem[] items) {
        this.id = UUID.randomUUID();
        this.date = new Date();
        this.client = client;
        this.items = items;
        this.totalAmount = calculateTotalAmount(client,items);
    }

    public String getId() {
        return this.id.toString().substring(0,6);
    }

    public Date getDate() {
        return date;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setItems(SalesItem[] items) {
        this.items = items;
    }

    public SalesItem[] getItems() {
        return items;
    }

    public Double calculateTotalAmount(Client client, SalesItem[] items) {
        Double totalAmount = 0.00;
        for (SalesItem item:items) {
            totalAmount += item.getUnitPrice();
        }
        return totalAmount * (1 - client.getDiscount()/100);
    }

    public void printInvoice(){
        System.out.println("[Invoice] Nro: "+this.getId()+"| Date: "+this.getDate());
        this.getClient().printClientData();
        for (SalesItem item:this.getItems()) {
            item.printItemData();
        }
        System.out.println("| Total Amount: $"+getTotalAmount());
    }

}
