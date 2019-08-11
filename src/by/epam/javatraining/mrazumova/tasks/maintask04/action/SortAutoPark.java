package by.epam.javatraining.mrazumova.tasks.maintask04.action;

import by.epam.javatraining.mrazumova.tasks.maintask04.entity.Auto;
import by.epam.javatraining.mrazumova.tasks.maintask04.entity.AutoPark;

import java.util.Comparator;

public class SortAutoPark {

    public static void sortByCapacity(AutoPark autoPark){
        autoPark.getDatabase().sort(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getCapacity() - o2.getCapacity();
            }
        });
    }

    public static void sortByPassengerCapacity(AutoPark autoPark){
        autoPark.getDatabase().sort(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getPassengerCapacity() - o2.getPassengerCapacity();
            }
        });
    }

    public static void sortByCost(AutoPark autoPark){
        autoPark.getDatabase().sort(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getCost() - o2.getCost();
            }
        });
    }

    public static void sortByBrand(AutoPark autoPark){
        autoPark.getDatabase().sort(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getCarBrand().compareTo(o2.getCarBrand());
            }
        });
    }

    public static void sortByManyParameters(AutoPark autoPark, boolean sortByCapasity, boolean sortByPassengerCapacity,
                                            boolean sortByCarBrand, boolean sortByCost){
        if (sortByCapasity){
            SortAutoPark.sortByCapacity(autoPark);
        }
        if (sortByPassengerCapacity){
            SortAutoPark.sortByPassengerCapacity(autoPark);
        }
        if (sortByCarBrand){
            SortAutoPark.sortByBrand(autoPark);
        }
        if (sortByCost){
            SortAutoPark.sortByCost(autoPark);
        }
    }
}
