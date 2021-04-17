package Evaluation_2.Rezolvare_Robert.Interface;

import Evaluation_2.Rezolvare_Robert.Classes.Cumparator;
import Evaluation_2.Rezolvare_Robert.Classes.Produs;
import Evaluation_2.Rezolvare_Robert.Classes.Vanzator;

public interface interfataComanda {

    double calculPretComanda(int cantitateVanduta, double pretProdus);
    String generateInfoComanda(Produs produs, Vanzator vanzator, Cumparator cumparator);

}
