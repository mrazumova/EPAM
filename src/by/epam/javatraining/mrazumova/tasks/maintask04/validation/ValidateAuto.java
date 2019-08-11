package by.epam.javatraining.mrazumova.tasks.maintask04.validation;

import by.epam.javatraining.mrazumova.tasks.maintask04.entity.Auto;
import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;
import by.epam.javatraining.mrazumova.tasks.maintask04.info.TypeOfCar;

public class ValidateAuto {

    private ValidateAuto(){}

    public static boolean validate(String type, int capacity, int passengerCapacity, String carBrand, int cost){
        boolean isData = true;
        if(capacity < 0){
            System.out.println("Capacity should be more than 0.");
            isData = false;
        }
        if (passengerCapacity < 0){
            System.out.println("Amount of passenger seats should be more than 0.");
            isData = false;
        }
        if (cost < 0){
            System.out.println("Cost should be more than 0.");
            isData = false;
        }
        try{
            TypeOfCar.valueOf(type);
        }
        catch (Exception e){
            System.out.println("Incorrect type of car.");
            isData = false;
        }
        try{
            CarBrand.valueOf(carBrand);
        }
        catch (Exception e){
            System.out.println("Incorrect brand.");
            isData = false;
        }
        finally {
            if (!isData)
                System.out.println("Enter parameters again.");
            return isData;
        }
    }
}
