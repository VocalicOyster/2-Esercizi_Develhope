package co.develhope.interceptor3.controllers;

import co.develhope.interceptor3.entities.Flights;
import co.develhope.interceptor3.models.Status;
import co.develhope.interceptor3.repositories.FlightsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/flights")
public class FlightsController {

    @Autowired
    private FlightsRepo flightsRepo;
    @GetMapping
    public List<Flights> getFlights() {
        ArrayList<Flights> flights = new ArrayList<>();
        for (int i= 0; i< 50; i++) {
            Flights firstFlight = initFlight();
            flights.add(firstFlight);
            flightsRepo.saveAndFlush(firstFlight);
        }
        return flights;
    }

    private Flights initFlight() {
        Flights flights = new Flights(
            randomString(), randomString(), randomString(), Status.ON_TIME
        );
        return flights;
    }

    private String randomString() {
        int STRING_LENGTH = 10; // Lunghezza desiderata della stringa
        int ASCII_LOWER_BOUND = 65; // Limite inferiore del range ASCII
        int ASCII_UPPER_BOUND = 122; // Limite superiore del range ASCII

        Random random = new Random();
        return random.ints(STRING_LENGTH, ASCII_LOWER_BOUND, ASCII_UPPER_BOUND + 1)
                .mapToObj(i -> (char) i)
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
