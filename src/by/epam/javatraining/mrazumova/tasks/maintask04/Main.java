package by.epam.javatraining.mrazumova.tasks.maintask04;

import by.epam.javatraining.mrazumova.tasks.maintask04.action.SortAutoPark;
import by.epam.javatraining.mrazumova.tasks.maintask04.entity.AutoPark;
import by.epam.javatraining.mrazumova.tasks.maintask04.validation.ParkCreator;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        AutoPark autoPark = new AutoPark();
        try {
            ParkCreator.createPark(new File("src\\by\\epam\\javatraining\\mrazumova\\tasks\\maintask04\\input.txt"), autoPark);
        }
        catch (FileNotFoundException e){
            System.out.println("Incorrect file path.");
        }
        autoPark.show();
        SortAutoPark.sortByBrand(autoPark);
        System.out.println("\nSorted by capacity: ");
        autoPark.show();
    }
}
