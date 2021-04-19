package Evaluation_3.Rezolvare_Robert.Classes;

public class Angajati {

    // variabile
    private String nume;
    private String prenume;
    private String nivel;
    private int star;

    // constructor
    public Angajati(String nume, String prenume, String nivel, int star) {
        this.nume = nume;
        this.prenume = prenume;
        this.nivel = nivel;
        this.star = star;
    }

    // setters & getters
    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
