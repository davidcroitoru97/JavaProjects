package Evaluation_2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
      //  public void exportInfoComanda(String numeVanzator, String departamentVanzator,String pretProdus, String numeProdus,String numeCumparator, String localitateCumparator, int cantitateCumparata){
        //    String x= pretProdus +" "+numeProdus;
        //}

   // public <generateInfoComanda, calculPretComanda> void exportInfoComanda(generateInfoComanda, calculPretComanda){

    //}
    public static void main(String [] args) throws FileNotFoundException {


        //Object exportInfoComanda = null;
       // File exportInfoComanda= new File(exportInfoComanda.txt)
        //PrintWriter fisier = new PrintWriter(exportInfoComanda);
       // Fisier String fisier = new Fisier();

        Produs produs2= new Produs("Mere", 12);
        Vanzator vanzator2= new Vanzator("Gabi", "Legume");
        Cumparator cumparator2= new Cumparator("David","Falticeni",2);
        Comanda comanda = new Comanda();
        String infoComanda = comanda.generateInfoComanda(vanzator2.getNumeVanzator(),
                vanzator2.getDepartamentVanzator(),
                produs2.getNumeProdus(),
                String.valueOf(produs2.getPretProdus()),
                cumparator2.getNumeCumparator(),
                cumparator2.getLocalitateCumparator(),
                cumparator2.getCantitateCumparata(),
                comanda.calculPretComanda(produs2.getPretProdus(),cumparator2.getCantitateCumparata()));
        System.out.println(comanda);
        System.out.println(infoComanda);

        comanda.exportInfoComanda(infoComanda);

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
