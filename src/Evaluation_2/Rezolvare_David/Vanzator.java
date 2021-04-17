package Evaluation_2.Rezolvare_David;

public class Vanzator {

    private String numeVanzator;
    private String departamentVanzator;

    public Vanzator (){}
    public Vanzator(String numeVanzator, String departamentVanzator)
    {
        this.numeVanzator = numeVanzator;
        this.departamentVanzator = departamentVanzator;
    }

    public String getDepartamentVanzator() {
        return departamentVanzator;
    }

    public void setDepartamentVanzator(String departamentVanzator) {
        this.departamentVanzator = departamentVanzator;
    }
    public String getNumeVanzator() {
        return numeVanzator;
    }

    public void setNumeVanzator(String numeVanzator) {
        this.numeVanzator = numeVanzator;
    }
}
