package by.epam.javatraining.mrazumova.tasks.maintask04.entity;

import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;

public abstract class Auto {
    private double capacity;
    private int passengerCapacity;
    private CarBrand carBrand;


    public Auto(double capacity, int passengerCapacity, CarBrand carBrand){
        setCapacity(capacity);
        setPassengerCapacity(passengerCapacity);
        setCarBrand(carBrand);
    }

    public abstract boolean isTruck();

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
