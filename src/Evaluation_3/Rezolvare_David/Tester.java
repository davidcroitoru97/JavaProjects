package Evaluation_3.Rezolvare_David;

public class Tester extends Angajati{

    private String type;

    public Tester(String nume, String nivel, double star,String type){
        super(nume, nivel,star);

        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
