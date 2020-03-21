package app.controller;

import app.database.Airport;
import app.entities.Booking;
import app.entities.Flight;
import app.entities.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BookingControllerTest {
  FlightController flightController;
  BookingController bookingController;


  @BeforeEach
  void setUp() {
    flightController = new FlightController();
    bookingController = new BookingController();


    Flight flightDemo = new Flight(1, Airport.BAHRAİN, "21/03/2020", 50, 0);
    Flight flightDemo2 = new Flight(2, Airport.GANDJA, "23/03/2020", 50, 0);
    flightController.getAllFlights().add(flightDemo);
    flightController.getAllFlights().add(flightDemo2);

    List<Person> passengers = new ArrayList<>();
    passengers.add(new Person("Maryam", "Mammadzadeh"));
    passengers.add(new Person("Gulshan", "Mammadzadeh"));

    Booking bookingDemo = new Booking(1, flightDemo, passengers);
    Booking bookingDemo2 = new Booking(2, flightDemo2, passengers);
    bookingController.getAllBooking().add(bookingDemo);
    bookingController.getAllBooking().add(bookingDemo2);
  }

  @Test
  void addBooking() {
    int initialSize = bookingController.getAllBooking().size();

    Flight flightDemo3 = new Flight(2, Airport.ANKARA, "23/03/2020", 50, 0);
    List<Person> passengers = new ArrayList<>();
    passengers.add(new Person("Maryam", "Mammadzadeh"));
    bookingController.addBooking(flightDemo3, passengers);

    int finalSize = bookingController.getAllBooking().size();

    boolean expected = true;
    boolean actual = initialSize<finalSize;


  }

  @Test
  void getAllBooking() {

  }

  @Test
  void getBookingByID() {
  }

  @Test
  void saveBooking() {
  }

  @Test
  void deleteBooking() {
  }

  @Test
  void cancelBooking() {
  }

  @Test
  void getMyFlights() {
  }

  @Test
  void getfromDB() {
  }
}