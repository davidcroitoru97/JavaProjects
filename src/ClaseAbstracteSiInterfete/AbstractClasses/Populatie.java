package ClaseAbstracteSiInterfete.AbstractClasses;

public abstract class Populatie  {

    //declarat variabile
    private String oras;
    private int numar;
    public abstract void cod();

    public Populatie() {


    }
    public void strada(){
        System.out.println("Numar strada ");
    }



    public Populatie(String oras, int numar) {
        this.oras = oras;
        this.numar = numar;
    }

    public String getOras() {
        return oras;
    }

    public int getNumar() {
        return numar;
    }

}
