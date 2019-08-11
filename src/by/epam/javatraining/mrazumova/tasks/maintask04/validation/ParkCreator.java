package by.epam.javatraining.mrazumova.tasks.maintask04.validation;

import by.epam.javatraining.mrazumova.tasks.maintask04.entity.*;
import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;
import by.epam.javatraining.mrazumova.tasks.maintask04.info.TypeOfCar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParkCreator {

    private ParkCreator(){}

    public static void createPark(File file, AutoPark autoPark) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        String type;
        int capacity;
        int passengers;
        String brand;
        int cost;
        while (sc.hasNext()){
            type = sc.next();
            capacity = sc.nextInt();
            passengers = sc.nextInt();
            brand = sc.next();
            cost = sc.nextInt();
            if (ValidateAuto.validate(type, capacity, passengers, brand, cost)){
                switch (TypeOfCar.valueOf(type)){
                    case BUS:
                        autoPark.add(new Bus(capacity, passengers, CarBrand.valueOf(brand), cost));
                        break;
                    case MINIBUS:
                        autoPark.add(new Minibus(capacity, passengers, CarBrand.valueOf(brand), cost));
                        break;
                    case TAXI:
                        autoPark.add(new Taxi(capacity, passengers, CarBrand.valueOf(brand), cost));
                        break;
                    case TRUCKTAXI:
                        autoPark.add(new TruckTaxi(capacity, passengers, CarBrand.valueOf(brand), cost));
                        break;
                }
            }
        }
    }
}
