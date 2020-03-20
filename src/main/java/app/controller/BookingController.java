package app.controller;

import app.entities.Booking;
import app.service.BookingService;

import java.util.Collection;

public class BookingController {
    BookingService bookingService = new BookingService();

    public void add(Booking booking) {
        bookingService.add(booking);
    }

    public Collection<Booking> getAll() {
        return bookingService.getAll();
    }

    public Booking getByID(int id) {
        return bookingService.getByID(id);
    }

    public void save(Booking booking) {
        bookingService.save(booking);
    }

    public boolean delete(Booking booking) {
        return bookingService.delete(booking);
    }
}
