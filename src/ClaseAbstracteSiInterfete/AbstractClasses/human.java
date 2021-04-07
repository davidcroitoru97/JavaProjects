package ClaseAbstracteSiInterfete.AbstractClasses;

public abstract class human {

    private String nume;
    private int varsta;

    public abstract void humanBody();
    public abstract void humanBody2();

    public human(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
