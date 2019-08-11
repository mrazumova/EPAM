package by.epam.javatraining.mrazumova.tasks.maintask04.entity;

import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;

public abstract class Auto {
    private int capacity;
    private int passengerCapacity;
    private CarBrand carBrand;


    public Auto(int capacity, int passengerCapacity, CarBrand carBrand){
        setCapacity(capacity);
        setPassengerCapacity(passengerCapacity);
        setCarBrand(carBrand);
    }

    public abstract boolean isTruck();

    public CarBrand getCarBrand() {
        return carBrand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Auto: " + getCarBrand() + ", capacity - " + getCapacity() + ", passengers - " + getPassengerCapacity());
        return sb.toString();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
