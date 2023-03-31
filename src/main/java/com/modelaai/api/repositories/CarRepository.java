package com.modelaai.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelaai.api.models.Car;

public interface CarRepository extends JpaRepository<Car, Long> {}
