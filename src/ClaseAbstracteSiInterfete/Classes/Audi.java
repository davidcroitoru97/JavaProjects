package ClaseAbstracteSiInterfete.Classes;

import ClaseAbstracteSiInterfete.Interfaces.PatternMasina;

public class Audi implements PatternMasina {
    @Override
    public void motortizare() {
        System.out.println("audi motorizare");
    }

    @Override
    public int caiPutere() {
        return 54;
    }

    @Override
    public String numeMarca() {
        return  "audi numeMarca";

    }
}
