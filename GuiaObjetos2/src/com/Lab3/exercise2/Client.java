package com.Lab3.exercise2;
import java.util.UUID;
public class Client {
    private UUID id;
    private String name;
    private String email;
    private Double discount;

    public Client(String name, String email, Double discount) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getId() {
        return this.id.toString().substring(0,6);
    }
    public void printClientData(){
        System.out.println("[Client] Nro: "+this.getId()+"| Email: "+this.getEmail()+"| Name: "+this.getName());
    }
}
