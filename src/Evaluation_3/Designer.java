package Evaluation_3;

public class Designer extends Angajati {

    private String programUsed;

    public Designer(String nume, String nivel, double star,String programUsed){
        super(nume, nivel, star);
        this.programUsed=programUsed;
    }

    public String getProgramUsed() {
        return programUsed;
    }

    public void setProgramUsed(String programUsed) {
        this.programUsed = programUsed;
    }
}
