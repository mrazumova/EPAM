package by.epam.javatraining.mrazumova.tasks.maintask04.entity;

import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;

public abstract class Auto implements Comparable {
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

    public Auto(Auto a){
        setCapacity(a.getCapacity());
        setPassengerCapacity(a.getPassengerCapacity());
        setCarBrand(a.getCarBrand());
        setCost(a.getCost());
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

    public void swap(Auto a1){
        int cap = a1.capacity;
        int passCap = a1.passengerCapacity;
        CarBrand cb = a1.carBrand;
        int co = a1.cost;

        a1.setCapacity(this.getCapacity());
        a1.setPassengerCapacity(this.getPassengerCapacity());
        a1.setCarBrand(this.getCarBrand());
        a1.setCost(this.getCost());

        this.setCapacity(cap);
        this.setPassengerCapacity(passCap);
        this.setCarBrand(cb);
        this.setCost(co);
    }

    @Override
    public int compareTo(Object o) {
        return this.getCarBrand().compareTo(((Auto) o).getCarBrand());
    }
}
