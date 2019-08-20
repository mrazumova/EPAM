package by.epam.javatraining.mrazumova.tasks.maintask04.action;

import by.epam.javatraining.mrazumova.tasks.maintask04.entity.Auto;
import by.epam.javatraining.mrazumova.tasks.maintask04.entity.AutoPark;
import by.epam.javatraining.mrazumova.tasks.maintask04.info.CarBrand;

import java.util.ArrayList;
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

    public static void sortByManyParameters(AutoPark autoPark, boolean sortByCapacity, boolean sortByPassengerCapacity,
                                            boolean sortByCarBrand, boolean sortByCost){
        if (sortByCapacity){
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
    public static void mySort(AutoPark autoPark){
        int size = autoPark.getDatabase().size() - 1;
        for(int i = 1; i < size; ++i){
            int minIndex = getMinIndex(autoPark.getDatabase(), i);
            if (autoPark.getDatabase().get(minIndex).compareTo(autoPark.getDatabase().get(i - 1)) < 0){
                swap(autoPark.getDatabase().get(i-1),autoPark.getDatabase().get(minIndex));
            }
        }
    }

    private static int getMinIndex(ArrayList<Auto> arr, int index){
        int min = index;
        int mincomp = arr.get(min).compareTo(arr.get(++index));
        for (; index < arr.size(); ++index){
            int curr = arr.get(min).compareTo(arr.get(index));
            if (curr < mincomp){
                min = index;
            }
        }
        return min;
    }

    private static void swap(Auto a1, Auto a2){
        a1.swap(a2);
    }
}
