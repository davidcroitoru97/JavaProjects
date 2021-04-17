package Evaluation_2;

import java.io.FileNotFoundException;

public interface Interface {
    float calculPretComanda(float pretProdus, int cantitateCumparata);
    String generateInfoComanda(String numeVanzator, String departamentVanzator,String pretProdus, String numeProdus,String numeCumparator, String localitateCumparator, int cantitateCumparata, float PretComanda);
    void exportInfoComanda(String infoComanda) throws FileNotFoundException;
}
