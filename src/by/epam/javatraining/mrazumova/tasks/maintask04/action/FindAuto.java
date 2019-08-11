package by.epam.javatraining.mrazumova.tasks.maintask04.action;

import by.epam.javatraining.mrazumova.tasks.maintask04.entity.Auto;
import by.epam.javatraining.mrazumova.tasks.maintask04.entity.AutoPark;

public class FindAuto {
    private FindAuto(){}

    public boolean findAuto(Auto auto, AutoPark autoPark){
        int index = -1;
        for(Auto a : autoPark.getDatabase()){
            if (a.equals(auto))
                return true;
        }
        return false;
    }
}
