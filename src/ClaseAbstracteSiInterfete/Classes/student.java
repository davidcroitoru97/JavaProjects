package ClaseAbstracteSiInterfete.Classes;

import ClaseAbstracteSiInterfete.AbstractClasses.human;
import ClaseAbstracteSiInterfete.Interfaces.AnimalInterface;
import ClaseAbstracteSiInterfete.Interfaces.PatternMasina;
import ClaseAbstracteSiInterfete.Interfaces.humanInterface;

public class student extends human implements humanInterface, AnimalInterface, PatternMasina {

    @Override
    public void humanBody() {
        System.out.println("Hello body");
    }

    @Override
    public void humanBody2() {

    }

    public student(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void humanInterfaceBody() {

    }

    @Override
    public void humanInterfaceBody2() {

    }

    @Override
    public void motortizare() {

    }

    @Override
    public int caiPutere() {
        return 0;
    }

    @Override
    public String numeMarca() {
        return null;
    }
}
