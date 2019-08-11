package by.epam.javatraining.mrazumova.tasks.maintask04.entity;

import java.util.ArrayList;

public class AutoPark {
    private ArrayList<Auto> database;

    public AutoPark(){
        database = new ArrayList<>();
    }

    public void show(){
        for(Auto auto : database)
            System.out.println(auto.toString());
    }

    public void remove(Auto auto){
        database.remove(auto);
    }

    public void add(Auto auto){
        database.add(auto);
    }

    public ArrayList<Auto> getDatabase() {
        return database;
    }
}
