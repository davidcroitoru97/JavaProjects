package Evaluation_2.Rezolvare_Robert.Classes;

import Evaluation_2.Rezolvare_Robert.Interface.interfataComanda;


public class Comanda implements interfataComanda {

    @Override
    public int calculPretComanda(int cantitateVanduta, int pretProdus) {
        return cantitateVanduta * pretProdus;
    }

    @Override
    public String generateInfoComanda(Produs produs, Vanzator vanzator, Cumparator cumparator) {

        String nume_Produs = produs.getNumeProdus();
        int pret_Produs = produs.getPretProdus();
        String nume_Vanzator = vanzator.getNumeVanzator();
        String departament_Vanzator = vanzator.getDepartamentVanzator();
        String nume_Cumparator = cumparator.getNumeCumparator();
        String localitate_Cumparator = cumparator.getLocalitateCumparator();
        int cantitate_Cumparata = cumparator.getCantitateCumparata();

        int pret_total_Comanda = calculPretComanda(cantitate_Cumparata,pret_Produs);

        return "Comanda: " + nume_Produs + " Cantitate: " + cantitate_Cumparata
                + " Pret produs: " + pret_Produs + " Pret Total: " + pret_total_Comanda
                + " Nume Vanzator: " + nume_Vanzator + " Departament Vanzator: " + departament_Vanzator
                + " Nume Cumparator: " + nume_Cumparator + " Localitate livrare: " + localitate_Cumparator;
    }

}
