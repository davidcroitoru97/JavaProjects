package Introduction;

// TODO-HINT: Pentru o mai buna intelegere a codului, te sfatuiesc sa pui commenturi la ce faci, cum am facut eu mai jos si fa curat la ce nu este de folos
//  Si un sfat, te sfatuiesc ca sa faci constructorii publici, in cazul in care doresti sa faci o instanta al clasei Objects
//  in package-ul "OOP" nu o sa poti pentru ca este vizibil la nivel de pachet. specificatorii de acces sunt valabili pentru
//  tot ce scrii, inclusiv constructori, metode , clase, variabile etc. Sa tii cont si de acest aspect
public class Objects {

    // Declaratie Variabile
    private String nume;
    private String prenume;
    private int varsta;

    // Constructor blank
    public Objects() {}

    // Constructor cu argumente
    public Objects(String nume, String prenume, int varsta)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    // Getters
    public String getnume() {
        return this.nume;
    }
    public String getprenume() {
        return this.prenume;
    }
    public int getvarsta() {
        return this.varsta;
    }

    // Setters
    public void setnume(String nume) {
        this.nume = nume;
    }
    public void setprenume(String prenume) {
        this.prenume = prenume;
    }
    public void setvarsta(int varsta) {
        this.varsta = varsta;
    }

    // Functia care calculeaza suma a doi integers
    public static int suma(int a, int b) {
        return a + b;
    }
}
