package by.epam.javatraining.mrazumova.tasks.maintask04.entity;

import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;

public abstract class Auto {
    private int capacity;
    private int passengerCapacity;
    private CarBrand carBrand;
    private int cost;


    public Auto(int capacity, int passengerCapacity, CarBrand carBrand, int cost){
        setCapacity(capacity);
        setPassengerCapacity(passengerCapacity);
        setCarBrand(carBrand);
        setCost(cost);
    }

    public abstract boolean isTruck();

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public int getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setCost(int cost) {
        this.cost = cost;
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
