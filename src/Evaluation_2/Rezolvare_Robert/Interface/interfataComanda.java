package Evaluation_2.Rezolvare_Robert.Interface;

import Evaluation_2.Rezolvare_Robert.Classes.Cumparator;
import Evaluation_2.Rezolvare_Robert.Classes.Produs;
import Evaluation_2.Rezolvare_Robert.Classes.Vanzator;

public interface interfataComanda {

    int calculPretComanda(int cantitateVanduta, int pretProdus);
    String generateInfoComanda(Produs produs, Vanzator vanzator, Cumparator cumparator);

}
