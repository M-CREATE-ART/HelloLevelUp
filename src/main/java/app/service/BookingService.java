package app.service;

import app.dao.BookingDao;
import app.dao.FlightDao;
import app.database.Airport;
import app.entities.Booking;
import app.entities.Flight;
import app.entities.Person;

import java.awt.print.Book;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

public class BookingService {
    BookingDao bookingDao = new BookingDao();
    FlightDao flightDao = new FlightDao();

    public String addBooking(Flight flight, List<Person> passengers) {
        try{
            flight.setFreeSeats(flight.getFreeSeats() - passengers.size());
            Booking booking = new Booking(getAllBooking().size()+1, flight, passengers);
            bookingDao.getAll().add(booking);
            return "Your booking has been completed successfully. See you on flight day <3! \n";
        }
        catch (Exception e){
            return "Your chosen flight doesn't exist, sorry!!! \n";
        }

    }

    public Collection<Booking> getAllBooking() {
        return bookingDao.getAll();
    }

    public Booking getBookingByID(int id) {
        return bookingDao.getByID(id);
    }

    public void saveBooking() {
        bookingDao.save();
    }

    public boolean deleteBooking(int bookingId) {
        return bookingDao.delete(bookingId);
    }

    public String cancelBooking(int ID) {
        try {
            bookingDao.delete(ID);
            return "Your booking cancelled successfully!";
        } catch (Exception e) {
            return "You entered invalid input!";
        }
    }

    public String getMyFlights(String name, String surname) {
        StringBuilder myFlights = new StringBuilder();
        Person person = new Person(name, surname);

        for (Booking booking: getAllBooking()) {
            for (Person passenger : booking.getPassengers()) {
                if (passenger.getSurname().equals(surname) && passenger.getName().equals(name)) myFlights.append(booking.represent());
            }
        }

        return myFlights.toString();
    }

    public void getfromDB() {
        bookingDao.getfromDB();
    }


}
