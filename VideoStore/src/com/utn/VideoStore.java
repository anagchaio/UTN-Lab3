package com.utn;
import java.util.ArrayList;
import java.util.Date;

public class VideoStore {
    ArrayList<Film> inventory;
    ArrayList<Film> rented;
    ArrayList<Client> clients;
    ArrayList<Invoice> historyRents;

    public VideoStore() {
        this.inventory = new ArrayList();
        this.rented = new ArrayList();
        this.clients = new ArrayList();
        this.historyRents = new ArrayList();
    }

    public ArrayList<Film> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Film> inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Film> getRented() {
        return rented;
    }

    public void setRented(ArrayList<Film> rented) {
        this.rented = rented;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Invoice> getHistoryRents() {
        return historyRents;
    }

    public void setHistoryRents(ArrayList<Invoice> historyRents) {
        this.historyRents = historyRents;
    }

    public void showCurrentlyRentedFilms(Date today){
        for (Invoice i: this.historyRents) {
            if(i.getReturnDate().compareTo(today) <= 0){
                System.out.println(i.getFilm().toString());
            }
        }
    }

    public void showRentedFilmsToReturn(Date today){
        for (Invoice i: this.historyRents) {
            if(i.getReturnDate().compareTo(today) == 0){
                System.out.println(i.getFilm().toString());
            }
        }
    }
    
}
