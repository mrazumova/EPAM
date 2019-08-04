package by.epam.javatraining.mrazumova.tasks.maintask04;

public class MobileCommunication {
    protected double monthlyCost;
    protected int sizeOfInternet;
    protected int sizeOfMinutes;
    protected double costOfAdditionalMinute;
    protected double costOfAdditionalMegaB;

    public MobileCommunication(double monthlyCost, int sizeOfInternet, int sizeOfMinutes, double costOfAdditionalMinute, double costOfAdditionalMegaB){
        setMonthlyCost(monthlyCost);
        setSizeOfInternet(sizeOfInternet);
        setSizeOfMinutes(sizeOfMinutes);
        setCostOfAdditionalMinute(costOfAdditionalMinute);
        setCostOfAdditionalMegaB(costOfAdditionalMegaB);
    }

    public void setCostOfAdditionalMegaB(double costOfAdditionalMegaB) {
        this.costOfAdditionalMegaB = costOfAdditionalMegaB;
    }

    public void setCostOfAdditionalMinute(double costOfAdditionalMinute) {
        this.costOfAdditionalMinute = costOfAdditionalMinute;
    }

    public void setSizeOfInternet(int sizeOfInternet) {
        this.sizeOfInternet = sizeOfInternet;
    }

    public void setSizeOfMinutes(int sizeOfMinutes) {
        this.sizeOfMinutes = sizeOfMinutes;
    }

    public void setMonthlyCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public int getSizeOfInternet() {
        return sizeOfInternet;
    }

    public int getSizeOfMinutes() {
        return sizeOfMinutes;
    }

    public double getCostOfAdditionalMinute() {
        return costOfAdditionalMinute;
    }

    public double getCostOfAdditionalMegaB() {
        return costOfAdditionalMegaB;
    }
}
