package com.example.finalprojectspr.components;

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
    public void init(){
        initCar();
    }

    private void initCar(){
        System.out.println("Starting cars initialization...");
        Car car = new Car();
        car.setModelName("Ford");
        car.setColor("Black");
        car.setBodyType("Sedan");
        car.setYearOfProd(2023);
        car.setMileage(203192);
        car.setAmount(2);
        car.setBooked(false);

        try {
            Car searchcar = carService();
        }
    }
}
