package by.epam.javatraining.mrazumova.tasks.maintask04;

public class InternetOnlyTariffs extends MobileCommunication {

    public InternetOnlyTariffs(double monthlyCost, int sizeOfInternet, double costOfAdditionalMinute, double costOfAdditionalMegaB){
        super(monthlyCost, sizeOfInternet, 0, costOfAdditionalMinute, costOfAdditionalMegaB);
    }
}
