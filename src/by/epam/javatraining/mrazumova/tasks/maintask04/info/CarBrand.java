package by.epam.javatraining.mrazumova.tasks.maintask04.info;

public enum CarBrand{
    AUDI("AUDI"),
    BMW("BMW"),
    FIAT("FIAT"),
    FORD("FORD"),
    KIA("KIA"),
    LADA("LADA"),
    MAZDA("MAZDA"),
    MERCEDES("MERCEDES"),
    NISSAN("NISSAN"),
    OPEL("OPEL"),
    RENAULT("RENAULT"),
    SKODA("SKODA"),
    TOYOTA("TOYOTA");

    private String brand;

    private CarBrand(String brand){
        this.brand = brand;
    }
}