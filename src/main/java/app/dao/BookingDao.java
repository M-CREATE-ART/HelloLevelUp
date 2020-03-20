package app.dao;

import app.entities.Booking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BookingDao implements dao<Booking> {
    List<Booking> bookings = new ArrayList<>();

    @Override
    public void add(Booking booking) {

    }

    @Override
    public Collection<Booking> getAll() {
        return null;
    }

    @Override
    public Booking getByID(int M) {
        return null;
    }

    @Override
    public void save(Booking booking) {

    }

    @Override
    public boolean delete(Booking booking) {
        return false;
    }
}
