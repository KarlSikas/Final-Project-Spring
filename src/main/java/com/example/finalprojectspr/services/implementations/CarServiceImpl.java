package com.example.finalprojectspr.services.implementations;

import com.example.finalprojectspr.exceptions.CarNotFoundException;
import com.example.finalprojectspr.models.Car;
import com.example.finalprojectspr.repositories.CarRepository;
import com.example.finalprojectspr.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Karl-Erik Sirkas
 *
 * @Date 3/23/2023
 */
@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;
    @Override
    public void addCar(Car car) {

    }

    @Override
    public Car findCarByModelName(String modelName) throws CarNotFoundException {
        return null;
    }

    @Override
    public void updateCar(Car car) throws CarNotFoundException {

    }

    @Override
    public List<Car> findAllCars() {
        return null;
    }
}