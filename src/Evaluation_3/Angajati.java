package Evaluation_3;

public class Angajati {


    protected String nume;
    protected String nivel;
    protected double star;

    public Angajati(String nume, String nivel, double star){
        this.nume =nume;
        this.nivel=nivel;
        this.star=star;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }
}
