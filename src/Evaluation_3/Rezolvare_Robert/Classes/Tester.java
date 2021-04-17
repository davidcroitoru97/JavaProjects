package Evaluation_3.Rezolvare_Robert.Classes;

public class Tester extends Angajati{

    private String type;

    public Tester(String nume, String prenume, String nivel, String type, int star) {
        super(nume, prenume, nivel, star);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
