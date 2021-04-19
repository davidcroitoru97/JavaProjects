package Evaluation_3.Rezolvare_Robert.Classes;

public class ProjectManager extends Angajati{

    // variabila
    private int people;

    // constructor
    public ProjectManager(String nume, String prenume, String nivel, int people,int star) {
        super(nume, prenume, nivel, star);
        this.people = people;
    }

    // getters & settters
    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    // metoda setare star pentru un angajat de catre ProjectManager
    public void setStarForAngajat(Angajati angajat, int star){
        angajat.setStar(star);
    }
}
