package by.epam.javatraining.mrazumova.tasks.maintask04.entity;

import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;

public class Bus extends Car {

    public Bus(int capacity, int passengerCapacity, CarBrand carBrand, int cost){
        super(capacity, passengerCapacity, carBrand, cost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bus: " + getCarBrand() + ", capacity - " + getCapacity() + ", passengers - " + getPassengerCapacity());
        return sb.toString();
    }
}
