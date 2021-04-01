package Introduction;

public class Garaj {

    // variabile
    private int nrMecanici;
    private int locuri;
    private String numeMan;
    private String prenumeMan;

    // Constructor fara argumente
    public Garaj() {}

    // Constructor cu argumente
    public Garaj(int nrMecanici, int locuri, String numeMan, String prenumeMan) {
        this.nrMecanici = nrMecanici;
        this.locuri = locuri;
        this.numeMan = numeMan;
        this.prenumeMan = prenumeMan;
    }

    // constructor cu doua argumente
    public Garaj(int nrMecanici, String numeMan) {
        this.nrMecanici = nrMecanici;
        this.numeMan = numeMan;
    }

   public Garaj(String numeMan, int nrMecanici){
        this.nrMecanici=nrMecanici;
        this.numeMan=numeMan;
   }

    // getters
    public int getnrMecanici() {
        return this.nrMecanici;
    }
    public int getlocuri() {
        return this.locuri;
    }
    public String getnumeMan() {
        return this.numeMan;
    }
    public String getprenumeMan() {
        return this.prenumeMan;
    }

    // setters
    public Garaj setnrMecanicisiLocuri() {
        return new Garaj("Robert", 23);
    }
    public void setlocuri(int locuri) {
        this.locuri = locuri;
    }
    public void setNumeMan(String numeMan) {
        this.numeMan = numeMan;
    }
    public void setPrenumeMan(String prenumeMan) {
        this.prenumeMan = prenumeMan;
    }

    // toString
    public String toString() {
        return "Garajul este al mecanicului " + this.numeMan + " " + this.prenumeMan + " care are "
                + this.nrMecanici + " de mecanici si " + this.getlocuri() + " locuri libere.";
    }

    public int impartire(int impartit, int impartitor){
        return impartit/impartitor;
    }

}
