package Evaluation_3.Rezolvare_Robert.Classes;

public class Proiect {

    private String numeProiect;
    private String deadline;

    public Proiect(String numeProiect, String deadline) {
        this.numeProiect = numeProiect;
        this.deadline = deadline;
    }

    public String getNumeProiect() {
        return numeProiect;
    }

    public void setNumeProiect(String numeProiect) {
        this.numeProiect = numeProiect;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
