package com.utn;

import java.util.Date;

public class Invoice {
    Client client;
    Film film;
    Date rentedDate;
    Date returnDate;

    public Invoice(Client client, Film film, Date rentedDate, Date returnDate) {
        this.client = client;
        this.film = film;
        this.rentedDate = rentedDate;
        this.returnDate = returnDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Date getRentedDate() {
        return rentedDate;
    }

    public void setRentedDate(Date rentedDate) {
        this.rentedDate = rentedDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BookingInvoice{" +
                "client: " + client.toString() +
                ", film: " + film.getTitle() +
                ", withdrawalDate: " + rentedDate +
                ", returnDate: " + returnDate +
                '}';
    }
}
