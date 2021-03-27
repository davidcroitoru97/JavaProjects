package Introduction;

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
