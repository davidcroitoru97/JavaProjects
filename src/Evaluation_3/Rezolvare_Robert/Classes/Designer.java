package Evaluation_3.Rezolvare_Robert.Classes;

public class Designer extends Angajati{

    private String programUsed;

    public Designer(String nume, String prenume, String nivel, String programUsed, int star) {
        super(nume, prenume, nivel, star);
        this.programUsed = programUsed;
    }

    public String getProgramUsed() {
        return programUsed;
    }

    public void setProgramUsed(String programUsed) {
        this.programUsed = programUsed;
    }

}
