package Evaluation_2.Rezolvare_Robert.Classes;

import Evaluation_2.Rezolvare_Robert.Interface.interfataComanda;

/**
 * @author Robert
 * Clasa ce genereaza comenzile
 */
public class Comanda implements interfataComanda {

    // Calculeaza pretul total al unei comenzi
    @Override
    public double calculPretComanda(int cantitateVanduta, double pretProdus) {
        return cantitateVanduta * pretProdus;
    }

    // genereaza informatii despre o comanda
    @Override
    public String generateInfoComanda(Produs produs, Vanzator vanzator, Cumparator cumparator) {
        // Parametrii cu variabile default, in cazul in care un Obiect nu are informatiile completate complet
        String nume_Produs = "-";
        String nume_Vanzator = "-";
        String departament_Vanzator = "-";
        String nume_Cumparator = "-";
        String localitate_Cumparator = "-";
        double pret_Produs = 0;
        int cantitate_Cumparata = 0;
        double pret_total_Comanda;

        // ia valorile de pe obiecte folosind getters si punele in variabile
        // daca exista un nume pentru produs, atunci punel in "nume_Produs", altfel lasa valoarea "-"
        // Facem acest exemplu pentru a evita exceptia "NullPointer" in cazul in care o valoare este null
        if (produs.getNumeProdus() != null) {
            nume_Produs = produs.getNumeProdus();
        }
        if (produs.getPretProdus() != 0) {
            pret_Produs = produs.getPretProdus();
        }
        if (vanzator.getNumeVanzator() != null) {
            nume_Vanzator = vanzator.getNumeVanzator();
        }
        if (vanzator.getDepartamentVanzator() != null) {
            departament_Vanzator = vanzator.getDepartamentVanzator();
        }
        if (cumparator.getNumeCumparator() != null) {
            nume_Cumparator = cumparator.getNumeCumparator();
        }
        if (cumparator.getLocalitateCumparator() != null) {
            localitate_Cumparator = cumparator.getLocalitateCumparator();
        }

        // Daca cumparatorul are 0 unitati comandate, inseamna ca nu are nici o comanda, de asta facem verificarea
        // daca cumparatorul are cel putin o unitate comandata, atunci genereaza informatie comanda
        if (cumparator.getCantitateCumparata() != 0) {
            cantitate_Cumparata = cumparator.getCantitateCumparata();

            // calculeaza pretul total folosind metoda "calculPretComanda"
            pret_total_Comanda = calculPretComanda(cantitate_Cumparata, pret_Produs);

            // returneaza string-ul cu informatiile despre comanda
            return "COMANDA REUSITA: Produs: " + nume_Produs + " | Cantitate: " + cantitate_Cumparata
                    + " | Pret produs: " + pret_Produs + " RON | Pret Total: " + pret_total_Comanda
                    + " RON | Nume Vanzator: " + nume_Vanzator + " | Departament Vanzator: " + departament_Vanzator
                    + " | Nume Cumparator: " + nume_Cumparator + " | Localitate livrare: " + localitate_Cumparator;

            // altfel, daca nu are nici o unitate comandata, inseamna ca comanda nu poate fi procesata
        } else {
            return "COMANDA ESUATA: Cumparatorul " + nume_Cumparator + " a pus 0 unitati '" + nume_Produs+ "'. Comanda nu poate fi procesata";
        }
    }
}
