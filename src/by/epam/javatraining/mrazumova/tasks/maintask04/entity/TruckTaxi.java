package by.epam.javatraining.mrazumova.tasks.maintask04.entity;

import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;

public class TruckTaxi extends Truck {

    public TruckTaxi(int capacity, int passengerCapacity, CarBrand carBrand){
        super(capacity, passengerCapacity, carBrand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TruckTaxi: " + getCarBrand() + ", capacity - " + getCapacity() + ", passengers - " + getPassengerCapacity());
        return sb.toString();
    }
}
