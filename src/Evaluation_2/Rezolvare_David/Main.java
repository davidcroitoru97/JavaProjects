package Evaluation_2.Rezolvare_David;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String [] args) throws FileNotFoundException {


        Produs produs2= new Produs("Mere", 12);
        Vanzator vanzator2= new Vanzator("Gabi", "Legume");
        Cumparator cumparator2= new Cumparator("David","Falticeni",2);

        Comanda comanda = new Comanda();
        Produs produs1= new Produs("Led", 15);
        Vanzator vanzator1= new Vanzator("Dine", "Electric");
        Cumparator cumparator1= new Cumparator("Iosif","Iasi",5);

        Vanzator vanzator4 = new Vanzator();

        String infoComanda3 = comanda.generateInfoComanda(vanzator4.getNumeVanzator(),
                vanzator4.getDepartamentVanzator(),
                produs2.getNumeProdus(),
                String.valueOf(produs2.getPretProdus()),
                cumparator2.getNumeCumparator(),
                cumparator2.getLocalitateCumparator(),
                cumparator2.getCantitateCumparata(),
                comanda.calculPretComanda(produs2.getPretProdus(),cumparator2.getCantitateCumparata()));

        String infoComanda = comanda.generateInfoComanda(vanzator2.getNumeVanzator(),
                vanzator2.getDepartamentVanzator(),
                produs2.getNumeProdus(),
                String.valueOf(produs2.getPretProdus()),
                cumparator2.getNumeCumparator(),
                cumparator2.getLocalitateCumparator(),
                cumparator2.getCantitateCumparata(),
                comanda.calculPretComanda(produs2.getPretProdus(),cumparator2.getCantitateCumparata()));

        String infoComanda2= comanda.generateInfoComanda(vanzator1.getNumeVanzator(),
                vanzator1.getDepartamentVanzator(),
                produs1.getNumeProdus(),
                String.valueOf(produs1.getPretProdus()),
                cumparator1.getNumeCumparator(),
                cumparator1.getLocalitateCumparator(),
                cumparator1.getCantitateCumparata(),
                comanda.calculPretComanda(produs1.getPretProdus(),cumparator1.getCantitateCumparata()));

        System.out.println(comanda);
        System.out.println(infoComanda);
        System.out.println(infoComanda2);

       // comanda.exportInfoComanda(infoComanda);
       // comanda.exportInfoComanda(infoComanda2);
        comanda.exportInfoComanda(infoComanda3);

        // generateInfoComnada com= new generateInfoComanda();
        // Produs produs1 = new Produs();
        // produs1.setNumeProdus("Led");
        // produs1.setPretProdus(15);
        //System.out.println("Nume produs: " + produs1.getNumeProdus() + " Pret produs: " + produs1.getPretProdus() + " lei");

        // Vanzator vanzator1 = new Vanzator();
        // vanzator1.setNumeVanzator("Alex");
        // vanzator1.setDepartamentVanzator("Legume");
        //System.out.println("Nume vanzator: " + vanzator1.getNumeVanzator() +" Departament vanzator " + vanzator1.getDepartamentVanzator());


    }


}
