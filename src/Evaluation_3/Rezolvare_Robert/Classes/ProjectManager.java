package Evaluation_3.Rezolvare_Robert.Classes;

public class ProjectManager extends Angajati{

    private int people;

    public ProjectManager(String nume, String prenume, String nivel, int people,int star) {
        super(nume, prenume, nivel, star);
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public void setStarForAngajat(Angajati angajat, int star){
        angajat.setStar(star);
    }
}
