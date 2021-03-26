package Introduction;

public class Garaj {

    //Aici nu am inteles cum spui tu sa folosesc garaje.nr>mecanici pentru a schimba valoarea int-ului
    // Notat adica practic cum ai facut in main "Objects A = new Objects(); A.setnume("David");" daca nu declari
    //  variabilele private, atunci o sa poti sa faci si "Objects A = new Objects(); A.nrMecanici = 5" ceea ce este un bad practice
    //  daca doresti sa schimbi valoarea unei variabile trebuie sa o faci prin intermediul unui setter ex:
    //  Objects A = new Objects(); A.setNrMecanici(5);"

    // Notat :in momentul de fata din clasa main poti face "garaj.nrMecanici" si sa schimbi valoarea int-ului
    //  asta este bad practice, tot timpul declara variabilele private si folosesti setteri & getteri publici ca sa modifici caracteristici
    //  acesta este principiul incapsularii, ia si citeste despre incapsulare si fa aceste variabile private
    private int nrMecanici;
    private int locuri;
    private String numeMan;
    private String prenumeMan;


    // TODO-HINT: Sa stii ca poti creia constructori si cu ce anume parametrii vrei tu, nu este un must sa incluzi toate variabilele
    //  spre exemplu "Garaj(int nrMecanici, int locuri); Garaj garaj = new Garaj(2,5);" Practic iti faci un constructor sau mai multi
    //  pe care ii folosesti in contextul de care tu ai nevoie

    // Constructor fara argumente
    public Garaj() {}

    // Constructor cu argumente
    public Garaj(int nrMecanici, int locuri, String numeMan, String prenumeMan) {
        this.nrMecanici = nrMecanici;
        this.locuri = locuri;
        this.numeMan = numeMan;
        this.prenumeMan = prenumeMan;
    }
    // Aici am creat un constructor cu doua argumente
    public Garaj(int nrMecanici, String numeMan){
        this.nrMecanici = nrMecanici;
        this.numeMan = numeMan;
    }

    //getters
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

    //setters
    public void setnrMecanici(int nrMecanici) {
        this.nrMecanici = nrMecanici;
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

     public String toString()
     {
         return "Garajul este al mecanicului " + this.numeMan + " " + this.prenumeMan + " care are "
                 + this.nrMecanici + " de mecanici si " + this.getlocuri() + " locuri libere.";
     }

}
