package com.utn;

import java.util.Date;

public class BookingInvoice {
    Client client;
    Film film;
    Date withdrawalDate;
    Date returnDate;

    public BookingInvoice(Client client, Film film, Date withdrawalDate, Date returnDate) {
        this.client = client;
        this.film = film;
        this.withdrawalDate = withdrawalDate;
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

    public Date getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(Date withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
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
                ", withdrawalDate: " + withdrawalDate +
                ", returnDate: " + returnDate +
                '}';
    }
}
