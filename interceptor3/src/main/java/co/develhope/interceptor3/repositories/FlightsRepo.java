package co.develhope.interceptor3.repositories;

import co.develhope.interceptor3.entities.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightsRepo extends JpaRepository<Flights, Long> {
}
