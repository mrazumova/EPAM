package by.epam.javatraining.mrazumova.tasks.maintask04.entity;

import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;

public class Truck extends Auto {

    public Truck(int capacity, int passengerCapacity, CarBrand carBrand){
        super(capacity, passengerCapacity, carBrand);
    }

    @Override
    public boolean isTruck() {
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Truck: " + getCarBrand() + ", capacity - " + getCapacity() + ", passengers - " + getPassengerCapacity());
        return sb.toString();
    }
}
