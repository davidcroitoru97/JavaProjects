package ClaseAbstracteSiInterfete.Classes;

import ClaseAbstracteSiInterfete.Interfaces.PatternMasina;

public class BMW implements PatternMasina {

    @Override
    public void motortizare() {
        System.out.println("BMW Motorizare");
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
