package com.example.finalprojectspr.components;

/**
 * @author Karl-Erik Sirkas
 * @Date 3/23/2023
 */

import com.example.finalprojectspr.exceptions.CarNotFoundException;
import com.example.finalprojectspr.models.Car;
import com.example.finalprojectspr.services.CarService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Datainit {
    @Autowired
    private CarService carService;

    @PostConstruct
    public void init() {
        initCar();
    }
    private void initCar() {
        System.out.println("Starting cars initialization...");
        Car car = new Car();
        car.setModelName("Ford");
        car.setColor("black");
        car.setBodyType("sedan");
        car.setYearOfProd(2023);
        car.setMileage(15000);
        car.setAmount(2);
        car.setBooked(false);

        try {
            Car searchCar = carService.findCarByModelName(car.getModelName());
            System.out.println("Cannot pre-initialize car: " + car.getModelName());
        } catch (CarNotFoundException e) {
            carService.addCar(car);
        }
    }

}