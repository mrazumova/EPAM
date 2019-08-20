package by.epam.javatraining.mrazumova.tasks.maintask04.validation;

import by.epam.javatraining.mrazumova.tasks.maintask04.exception.ValidationException;
import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;
import by.epam.javatraining.mrazumova.tasks.maintask04.info.TypeOfCar;

public class ValidateAuto {

    private ValidateAuto(){}

    public static void validate(String type, int capacity, int passengerCapacity, String carBrand, int cost) throws ValidationException{
        if(capacity < 0)
            throw new ValidationException("Capacity should be more than 0.");
        if (passengerCapacity < 0)
            throw new ValidationException("Amount of passenger seats should be more than 0.");
        if (cost < 0)
            throw new ValidationException("Cost should be more than 0.");
        try{
            TypeOfCar.valueOf(type);
        }
        catch (Exception e){
            throw new ValidationException("Incorrect type of car.");
        }
        try{
            CarBrand.valueOf(carBrand);
        }
        catch (Exception e){
            throw new ValidationException("Incorrect brand.");
        }
    }
}
