package app.entities;

import app.database.Airport;

public class Flight {
    private int ID;
    private Airport destination;
    private String date;
    private int seats;
    private int freeSeats;

    public Flight(int ID, Airport destination, String date, int seats, int freeSeats) {
        this.ID = ID;
        this.destination = destination;
        this.date = date;
        this.seats = seats;
        this.freeSeats = freeSeats;
    }

    public int getID() {
        return ID;
    }

    public Airport getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public int getSeats() {
        return seats;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d %d", ID, destination, date, seats, freeSeats);
    }
}
