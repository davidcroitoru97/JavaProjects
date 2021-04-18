package Evaluation_3;

public class Developer extends Angajati{

    private String technology;

    public Developer(String nume, String nivel, double star,String technology){
        super(nume,nivel, star);
        this.technology= technology;

    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
