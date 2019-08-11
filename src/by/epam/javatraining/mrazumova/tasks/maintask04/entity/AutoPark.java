package by.epam.javatraining.mrazumova.tasks.maintask04.entity;

import java.util.ArrayList;

public class AutoPark {
    private ArrayList<Auto> database;
    private int cost;

    public AutoPark(){
        database = new ArrayList<>();
    }

    public void show(){
        for(Auto auto : database)
            System.out.println(auto.toString());
    }

    public void remove(Auto auto){
        database.remove(auto);
        cost -= auto.getCost();
    }

    public void add(Auto auto){
        database.add(auto);
        cost += auto.getCost();
    }

    public ArrayList<Auto> getDatabase() {
        return database;
    }

    public int getCost() {
        return cost;
    }
}
