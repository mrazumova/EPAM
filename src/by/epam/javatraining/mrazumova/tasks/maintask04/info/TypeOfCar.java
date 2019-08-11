package by.epam.javatraining.mrazumova.tasks.maintask04.info;

public enum TypeOfCar {
    BUS("BUS"),
    MINIBUS("MINIBUS"),
    TAXI("TAXI"),
    TRUCKTAXI("TRUCKTAXI");

    private String type;

    private TypeOfCar(String type){
        this.type = type;
    }
}
