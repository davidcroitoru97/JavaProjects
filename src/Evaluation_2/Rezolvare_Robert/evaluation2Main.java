package Evaluation_2.Rezolvare_Robert;

import Evaluation_2.Rezolvare_Robert.Classes.Comanda;
import Evaluation_2.Rezolvare_Robert.Classes.Cumparator;
import Evaluation_2.Rezolvare_Robert.Classes.Produs;
import Evaluation_2.Rezolvare_Robert.Classes.Vanzator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class evaluation2Main {

    public static void exportInfoComanda(String []comenzi) throws FileNotFoundException{
        PrintWriter out = new PrintWriter("src/Evaluation_2/Rezolvare_Robert/detaliiComenzi.txt");

        for(int index = 0; index < comenzi.length; index++){
            out.println(comenzi[index]);
            System.out.println("Comanda cu numarul " + index + " a fost scrisa...");
        }

       out.close();
    }

    public static void main(String []args){
        // vanzatori
        Vanzator vanzator1 = new Vanzator("Robert", "IT");
        Vanzator vanzator2 = new Vanzator("Claudia", "Design");

        // cumparatori
        Cumparator cumparator1 = new Cumparator("David", "Iasi", 10);
        Cumparator cumparator2 = new Cumparator("Mirel", "Sibiu", 32);

        // produse
        Produs produs1 = new Produs("Led 50W", 23);
        Produs produs2 = new Produs("Casetofon", 432);

        Comanda comanda = new Comanda();

        // aici am creat un vector de string-uri unde am pus mai multe comenzi
        String [] comenzi = {
                comanda.generateInfoComanda(produs1,vanzator1,cumparator1),
                comanda.generateInfoComanda(produs2,vanzator2,cumparator2),
                comanda.generateInfoComanda(produs1,vanzator2,cumparator1)
        };

        // exporta comenzile
        try {
            exportInfoComanda(comenzi);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
