package app.controller;

import app.entities.Flight;
import app.service.FlightService;

import java.util.Collection;

public class FlightController {
    FlightService flightService = new FlightService();

    public void add(Flight flight) {
        flightService.add(flight);
    }

    public Collection<Flight> getAll() {
        return flightService.getAll();
    }

    public Flight getByID(int id) {
        return flightService.getByID(id);
    }

    public void save(Flight flight) {
        flightService.save(flight);
    }

    public boolean delete(Flight flight) {
        return flightService.delete(flight);
    }
}
