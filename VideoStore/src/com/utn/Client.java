package com.utn;

import java.util.Objects;

public class Client {
    String name;
    Integer phoneNumber;
    String address;

    public Client(String name, Integer phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name: " + name + '|' +
                ", phoneNumber: " + phoneNumber + '|' +
                ", address: " + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return getName().equals(client.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
