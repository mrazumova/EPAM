package by.epam.javatraining.mrazumova.tasks.maintask04.entity;

import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;

public class Taxi extends Car {

    public Taxi(int capacity, int passengerCapacity, CarBrand carBrand, int cost){
        super(capacity, passengerCapacity, carBrand, cost);
    }

    @Override
    public int hashCode() {
        return this.getCost() + this.getPassengerCapacity()*183 + this.getCapacity();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Taxi bus = (Taxi) obj;
        if (bus.getCapacity() == this.getCapacity() &&
                bus.getPassengerCapacity() == this.getPassengerCapacity() &&
                bus.getCarBrand().equals(this.getCarBrand()) &&
                bus.getCost() == this.getCost())
            return true;
        return false;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Taxi: " + getCarBrand() + ", capacity - " + getCapacity() + ", passengers - " + getPassengerCapacity()+ ", cost: " + getCost());
        return sb.toString();
    }
}
