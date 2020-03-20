package app.service;

import app.dao.FlightDao;
import app.entities.Flight;
import app.util.Tools;

import javax.annotation.processing.Filer;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    FlightDao flightDao = new FlightDao();

    public void add(Flight flight) {
        flightDao.add(flight);
    }

    public Collection<Flight> getAll() {
        return flightDao.getAll();
    }

    public Flight getByID(int id) {
        return flightDao.getByID(id);
    }

    public void save(Flight flight) {
        flightDao.save(flight);
    }

    public boolean delete(Flight flight) {
        return flightDao.delete(flight);
    }

    public void generateFlight() {
        String fileName = "src/main/java/app/database/flights.txt";
        List<String> lineList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            lineList = br.lines().collect(Collectors.toList());
            if (lineList.size() == 0) {
                FileWriter fw = new FileWriter(fileName);

                for (Flight flight : Tools.flightGenerator(50)) {
                    fw.write(flight + System.lineSeparator());
                }
                fw.close();
            }

        } catch (IOException ex) {
            System.out.printf(" %s File not found! \n", fileName);

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
                for (Flight flight : Tools.flightGenerator(50)) {
                    bw.write(flight + System.lineSeparator());
                }
                bw.close();
            } catch (IOException ex1) {
                System.out.println("Something went wrong!");
            }
        }

    }
}
