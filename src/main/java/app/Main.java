package app;

import app.database.Airport;
import app.entities.Flight;
import app.service.FlightService;
import app.util.Tools;

public class Main {
    public static void main(String[] args) {

        FlightService fs = new FlightService();
        fs.getfromDB();

        System.out.println(fs.getFilteredFlights("Bahrain", "25/03/2020", 3));

    }
}
