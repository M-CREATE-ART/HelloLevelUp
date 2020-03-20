package app.service;

import app.dao.BookingDao;
import app.entities.Booking;

import java.util.Collection;

public class BookingService {
    BookingDao bookingDao = new BookingDao();

    public void add(Booking booking) {
        bookingDao.add(booking);
    }

    public Collection<Booking> getAll() {
        return bookingDao.getAll();
    }

    public Booking getByID(int id) {
        return bookingDao.getByID(id);
    }

    public void save(Booking booking) {
        bookingDao.save(booking);
    }

    public boolean delete(Booking booking) {
        return bookingDao.delete(booking);
    }
}
