package by.epam.javatraining.mrazumova.tasks.maintask04.entity;

import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;

public class Taxi extends Car {

    public Taxi(int capacity, int passengerCapacity, CarBrand carBrand, int cost){
        super(capacity, passengerCapacity, carBrand, cost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Taxi: " + getCarBrand() + ", capacity - " + getCapacity() + ", passengers - " + getPassengerCapacity());
        return sb.toString();
    }
}
