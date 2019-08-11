package by.epam.javatraining.mrazumova.tasks.maintask04.entity;

import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;

public class Minibus extends Car {

    public Minibus(int capacity, int passengerCapacity, CarBrand carBrand){
        super(capacity, passengerCapacity, carBrand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Minibus: " + getCarBrand() + ", capacity - " + getCapacity() + ", passengers - " + getPassengerCapacity());
        return sb.toString();
    }
}
