package Evaluation_2.Rezolvare_David;

public class Produs {

    private String numeProdus;
    private float pretProdus;

    public Produs(){ }
    public Produs(String numeProdus,float pretProdus){
        this.numeProdus=numeProdus;
        this.pretProdus=pretProdus;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public float getPretProdus() {
        return pretProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public void setPretProdus(float pretProdus) {
        this.pretProdus = pretProdus;
    }
}
