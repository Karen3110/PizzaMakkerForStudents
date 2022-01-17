package com.example.demo3.model;

public class Table {
    private int id;
    private int number;
    private int seats;
    private boolean busy;

    public Table(int id, int number, int seats, boolean busy) {
        this.id = id;
        this.number = number;
        this.seats = seats;
        this.busy = busy;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", number=" + number +
                ", seats=" + seats +
                ", busy=" + busy +
                '}';
    }
}
