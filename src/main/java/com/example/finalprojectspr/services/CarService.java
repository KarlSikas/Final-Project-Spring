package com.example.finalprojectspr.services;

import com.example.finalprojectspr.exceptions.CarNotFoundException;
import com.example.finalprojectspr.models.Car;

import java.util.List;

/**
 * @author karl-erik sirkas
 * @ Date 22.03.2023
 */
public interface CarService {
    /**
     * To create a new car
     *
     * @param car Car
     */
    void addCar(Car car);

    /**
     * To find a car by modelName
     *
     * @param modelName car modelName
     * @return Car
     */
    Car findCarByModelName(String modelName) throws CarNotFoundException;


    /**
     * To update on existing Car
     *
     * @param  car Car
     */
    void updateCar(Car car) throws CarNotFoundException;

    /**
     * To find all cars
     *
     * @return a list of Cars
     */
    List<Car> findAllCars();

}