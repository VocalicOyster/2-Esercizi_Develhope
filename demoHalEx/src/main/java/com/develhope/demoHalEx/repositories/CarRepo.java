package com.develhope.demoHalEx.repositories;

import com.develhope.demoHalEx.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Integer> {
}
