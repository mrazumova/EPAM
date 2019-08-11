package by.epam.javatraining.mrazumova.tasks.maintask04;

import by.epam.javatraining.mrazumova.tasks.maintask04.entity.AutoPark;
import by.epam.javatraining.mrazumova.tasks.maintask04.validation.ParkCreator;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        AutoPark autoPark = new AutoPark();
        try {
            ParkCreator.createPark(new File("input.txt"), autoPark);
        }
        catch (FileNotFoundException e){
            System.out.println("Incorrect file path.");
        }
    }
}
