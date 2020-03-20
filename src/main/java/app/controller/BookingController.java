package app.controller;

import app.entities.Booking;
import app.entities.Flight;
import app.entities.Person;
import app.service.BookingService;

import java.util.Collection;
import java.util.List;

public class BookingController {
    BookingService bookingService = new BookingService();

    public void addBooking(Flight flight, List<Person> passengers) {
        bookingService.addBooking(flight, passengers);
    }

    public Collection<Booking> getAllBooking() {
        return bookingService.getAllBooking();
    }

    public Booking getBookingByID(int id) {
        return bookingService.getBookingByID(id);
    }

    public void saveBooking(Booking booking) {
        bookingService.saveBooking(booking);
    }

    public boolean deleteBooking(Booking booking) {
        return bookingService.deleteBooking(booking);
    }
}
