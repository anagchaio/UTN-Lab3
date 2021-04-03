package com.Lab3.exercise2;

import java.util.UUID;

public class SalesItem {
    private UUID id;
    private String name;
    private String description;
    private Double unitPrice;

    public SalesItem(String name, String description, Double unitPrice) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return this.id.toString().substring(0,6);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public void printItemData(){
        System.out.println("[Item] Nro: "+this.getId()+"| Name: "+this.getName()+"| Description: "+this.getDescription()+"| Price: "+this.getUnitPrice());
    }
}
