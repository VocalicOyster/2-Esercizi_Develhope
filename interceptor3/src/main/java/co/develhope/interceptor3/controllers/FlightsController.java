package co.develhope.interceptor3.controllers;

import co.develhope.interceptor3.entities.Flights;
import co.develhope.interceptor3.models.Status;
import co.develhope.interceptor3.repositories.FlightsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        for (int i = 0; i < 50; i++) {
            Flights firstFlight = initFlight();
            flights.add(firstFlight);
            flightsRepo.saveAndFlush(firstFlight);
        }
        return flights;
    }

    @GetMapping("/provision")
    public List<Flights> provisionFlights(@RequestParam(defaultValue = "100") int n) {
        Status[] STATUSES = Status.values();
        Random random = new Random();
        List<Flights> flights = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Flights flight = new Flights();
            flight.setFromAirport("Airport" + random.nextInt(100));
            flight.setToAirport("Airport" + random.nextInt(100));
            flight.setStatus(STATUSES[random.nextInt(STATUSES.length)]);
            flights.add(flight);
        }

        return flightsRepo.saveAll(flights);
    }

    @GetMapping
    public List<Flights> getAllFlights(@RequestParam int page, @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("fromAirport").ascending());
        return flightsRepo.findAll(pageable).getContent();
    }

    @GetMapping("/ontime")
    public List<Flights> getOntimeFlights() {
        return flightsRepo.findByStatus(Status.valueOf("ONTIME"));
    }

    @GetMapping("/status")
    public List<Flights> getFlightsByStatus(@RequestParam Status p1, @RequestParam Status p2) {
        return flightsRepo.findByStatusIn(p1, p2);

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
