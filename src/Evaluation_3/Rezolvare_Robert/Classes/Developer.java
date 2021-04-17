package Evaluation_3.Rezolvare_Robert.Classes;

public class Developer extends Angajati{

    private String technology;

    public Developer(String nume, String prenume, String nivel, String technology, int star) {
        super(nume, prenume, nivel, star);
        this.technology = technology;
    }


    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

}
