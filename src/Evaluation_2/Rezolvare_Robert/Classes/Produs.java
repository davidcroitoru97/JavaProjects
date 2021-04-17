package Evaluation_2.Rezolvare_Robert.Classes;

public class Produs {

    // detalii produs
    private String numeProdus;
    private double pretProdus;

    // constructor produs
    public Produs(String numeProdus, double pretProdus) {
        this.numeProdus = numeProdus;
        this.pretProdus = pretProdus;
    }

    // Getters & Setters
    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public double getPretProdus() {
        return pretProdus;
    }

    public void setPretProdus(int pretProdus) {
        this.pretProdus = pretProdus;
    }
}
