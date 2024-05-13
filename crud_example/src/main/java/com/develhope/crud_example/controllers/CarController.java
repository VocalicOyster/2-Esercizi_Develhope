package com.develhope.crud_example.controllers;

import com.develhope.crud_example.entities.Car;
import com.develhope.crud_example.repositories.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepo carRepo;

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        Car firstCar = carRepo.saveAndFlush(car);
        return firstCar;
    }

     @GetMapping
    public List<Car> getAll() {
        return carRepo.findAll();
    }

    @GetMapping(path = "/{id}")
    public Car getById(@PathVariable Integer id) {
        if(carRepo.existsById(id)) {
            return carRepo.findById(id).orElse(null);
        }
        else {
            return new Car();
        }
    }

    @PutMapping(path = "/{id}")
    public Car updateCar(@PathVariable Integer id, @RequestParam String type) {
        if(carRepo.existsById(id)) {
            Car car = carRepo.findById(id).orElse(null);
            car.setType(type);
            carRepo.saveAndFlush(car);
            return car;
        }
        else {
            return new Car();
        }
    }

    @DeleteMapping(path = "/{id}")
    public void deleteCar(@PathVariable Integer id) {
        if(carRepo.existsById(id)) {
            carRepo.deleteById(id);
        }
        else {
            throw new CarNotFoundException();
        }
    }

    @DeleteMapping
    public void deleteAll() {
        carRepo.deleteAll();
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    private class CarNotFoundException extends RuntimeException {
        public CarNotFoundException() {
            super("AUTO NON TROVATA");
        }
    }
}
