package Evaluation_2.Rezolvare_Robert.Classes;

public class Produs {

    private String numeProdus;
    private int pretProdus;

    public Produs(String numeProdus, int pretProdus) {
        this.numeProdus = numeProdus;
        this.pretProdus = pretProdus;
    }

    //Getters & Setters
    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public int getPretProdus() {
        return pretProdus;
    }

    public void setPretProdus(int pretProdus) {
        this.pretProdus = pretProdus;
    }
}
