package Evaluation_2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Comanda  implements Interface{

    @Override
    public float calculPretComanda(float pretProdus, int cantitateCumparata) {

        return pretProdus * cantitateCumparata;
    }

    @Override
    public String generateInfoComanda(String numeVanzator, String departamentVanzator, String numeProdus,String pretProdus, String numeCumparator, String localitateCumparator, int cantitateCumparata, float PretComanda) {
        return "Nume Vanzator: "+numeVanzator
                +" Departament Vanzator:" +departamentVanzator
                +" Nume Produs: "+numeProdus+
                " Pret Produs: "+pretProdus+
                " Nume Cumparator "+numeCumparator+
                " Localita: "+localitateCumparator+
                " Cantitate Cumparata "+cantitateCumparata
                +" PretComanda"+ PretComanda;
    }
    public void exportInfoComanda(String infoComanda) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("InfoComanda.txt");
        out.println(infoComanda);
        out.close();
    }

}
