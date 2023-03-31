package com.modelaai.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelaai.api.dtos.CarDTO;
import com.modelaai.api.repositories.CarRepository;
import com.modelaai.api.models.Car;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public List<Car> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public void create(@RequestBody CarDTO body) {
        repository.save(new Car(body));
    }
}
 