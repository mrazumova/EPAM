package by.epam.javatraining.mrazumova.tasks.maintask04.info;

public enum TypeOfCar {
    BUS("bus"),
    MINIBUS("minibus"),
    TAXI("taxi"),
    TRUCKTAXI("trucktaxi");

    private String type;

    private TypeOfCar(String type){
        this.type = type;
    }
}
