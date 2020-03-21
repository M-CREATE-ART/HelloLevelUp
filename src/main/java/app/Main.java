package app;

import app.controller.BookingController;
import app.controller.FlightController;
import app.dao.BookingDao;
import app.database.Airport;
import app.entities.Booking;
import app.entities.Flight;
import app.entities.Person;
import app.service.FlightService;
import app.ui.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu.enterMenu();
    }
}
