package Evaluation_2.Rezolvare_Robert.Classes;

public class Cumparator {

    // detalii cumparator
    private String numeCumparator;
    private String localitateCumparator;
    private int cantitateCumparata;

    // constructori cumparator
    public Cumparator(String numeCumparator, String localitateCumparator) {
        this.numeCumparator = numeCumparator;
        this.localitateCumparator = localitateCumparator;
    }


    public Cumparator(String numeCumparator, String localitateCumparator, int cantitateCumparata) {
        this.numeCumparator = numeCumparator;
        this.localitateCumparator = localitateCumparator;
        this.cantitateCumparata = cantitateCumparata;
    }


    //Getters & Setters
    public String getNumeCumparator() {
        return numeCumparator;
    }

    public void setNumeCumparator(String numeCumparator) {
        this.numeCumparator = numeCumparator;
    }

    public String getLocalitateCumparator() {
        return localitateCumparator;
    }

    public void setLocalitateCumparator(String localitateCumparator) {
        this.localitateCumparator = localitateCumparator;
    }

    public int getCantitateCumparata() {
        return cantitateCumparata;
    }

    public void setCantitateCumparata(int cantitateCumparata) {
        this.cantitateCumparata = cantitateCumparata;
    }
}
