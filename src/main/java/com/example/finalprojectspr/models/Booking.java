package com.example.finalprojectspr.models;

import com.example.finalprojectspr.services.CarService;

/**
 * @author Karl-Erik Sirkas
 * @ Date 22.03.2023
 */
public class Booking {
    public String dateOfBooking;
    public Customer client;
    public CarService car;
    public String dateFrom;
    public String dateTo;

    public String rentalBranch;

    public String returnBranch;

    public int amount;

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public Customer getClient() {
        return client;
    }

    public void setClient(Customer client) {
        this.client = client;
    }

    public CarService getCar() {
        return car;
    }

    public void setCar(CarService car) {
        this.car = car;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getRentalBranch() {
        return rentalBranch;
    }

    public void setRentalBranch(String rentalBranch) {
        this.rentalBranch = rentalBranch;
    }

    public String getReturnBranch() {
        return returnBranch;
    }

    public void setReturnBranch(String returnBranch) {
        this.returnBranch = returnBranch;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
