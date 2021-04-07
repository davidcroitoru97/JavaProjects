package ClaseAbstracteSiInterfete.Classes;

import ClaseAbstracteSiInterfete.AbstractClasses.Populatie;
import ClaseAbstracteSiInterfete.Interfaces.Angajati;

// Aici m-am folosit de clasa abstracta pentru a mosteni variabila obiect
public class Director extends Populatie implements Angajati {

    public void cod() {
        System.out.println("Codul este 720200");
    }


    //public Director(String oras, int numar) {
        // Cand se foloseste treaba asta cu super?
        // super(oras, numar);
   // }

    public Director() {
        super();
    }

    @Override
    public String nume() {
        return "Numele este Cucos Vasile";
    }

    @Override
    public void salar() {
        System.out.println("Salar 5000 lei");

    }

    @Override
    public int vechime() {
        return 5 ;
    }


}
