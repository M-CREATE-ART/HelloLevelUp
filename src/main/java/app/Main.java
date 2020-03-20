package app;

import app.service.FlightService;
import app.util.Tools;

public class Main {
    public static void main(String[] args) {

        FlightService fs = new FlightService();
        fs.generateFlight();

    }
}
