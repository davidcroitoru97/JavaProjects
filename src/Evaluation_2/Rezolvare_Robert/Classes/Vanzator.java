package Evaluation_2.Rezolvare_Robert.Classes;

public class Vanzator {

    // detalii vanzator
    private String numeVanzator;
    private String departamentVanzator;

    // constructor vanzator
    public Vanzator(String numeVanzator, String departamentVanzator) {
        this.numeVanzator = numeVanzator;
        this.departamentVanzator = departamentVanzator;
    }

    // Getters & Setters
    public String getNumeVanzator() {
        return numeVanzator;
    }

    public void setNumeVanzator(String numeVanzator) {
        this.numeVanzator = numeVanzator;
    }

    public String getDepartamentVanzator() {
        return departamentVanzator;
    }

    public void setDepartamentVanzator(String departamentVanzator) {
        this.departamentVanzator = departamentVanzator;
    }
}
