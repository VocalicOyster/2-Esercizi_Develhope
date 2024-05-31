package co.develhope.interceptor3.repositories;

import co.develhope.interceptor3.entities.Flights;
import co.develhope.interceptor3.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightsRepo extends JpaRepository<Flights, Long> {
    List<Flights> findByStatus(Status status);
    List<Flights> findByStatusIn(Status status1, Status status2);
}
