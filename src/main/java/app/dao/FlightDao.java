package app.dao;

import app.entities.Flight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FlightDao implements dao<Flight> {
    List<Flight> flights = new ArrayList<>();

    @Override
    public void add(Flight flight) {

    }

    @Override
    public Collection<Flight> getAll() {
        return null;
    }

    @Override
    public Flight getByID(int M) {
        return null;
    }

    @Override
    public void save(Flight flight) {

    }

    @Override
    public boolean delete(Flight flight) {
        return false;
    }
}
