package Evaluation_3;

public class ProjectManager extends Angajati{


    private int people;

    public ProjectManager(String nume, String nivel, double star,int people) {
        super(nume, nivel,star);
        this.people=people;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }
}
