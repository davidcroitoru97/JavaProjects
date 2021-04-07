package ClaseAbstracteSiInterfete.Classes;

import ClaseAbstracteSiInterfete.Interfaces.Angajati;

public class Manager implements Angajati{
    @Override
    public String nume() {
        return "Costica Vio";
    }

    @Override
    public void salar() {
        System.out.println("Salarul este 4500 Lei");

    }

    @Override
    public int vechime() {
        return 2;
    }
}
