package by.epam.javatraining.mrazumova.tasks.maintask04.entity;

import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;

public class Car extends Auto{

    public Car(int capacity, int passengerCapacity, CarBrand carBrand, int cost){
        super(capacity, passengerCapacity, carBrand, cost);
    }

    @Override
    public boolean isTruck(){
        return false;
    }
}
