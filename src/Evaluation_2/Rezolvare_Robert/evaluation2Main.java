package Evaluation_2.Rezolvare_Robert;

import Evaluation_2.Rezolvare_Robert.Classes.Comanda;
import Evaluation_2.Rezolvare_Robert.Classes.Cumparator;
import Evaluation_2.Rezolvare_Robert.Classes.Produs;
import Evaluation_2.Rezolvare_Robert.Classes.Vanzator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

// TODO: Comenzile sunt scrise in "detaliiComenzi.txt" dupa rularea functiei main
public class evaluation2Main {

    // metoda pentru scrierea comenzilor in fisierul "detaliiComenzi.txt"
    public static void exportInfoComanda(String[] comenzi) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("src/Evaluation_2/Rezolvare_Robert/detaliiComenzi.txt");

        // traverseaza fiecare comanda si pune-o in detaliiComenzi.txt
        for (int index = 0; index < comenzi.length; index++) {
            out.println(comenzi[index]);
            System.out.println("Comanda cu numarul " + index + " a fost scrisa...");
        }

        out.close();
    }

    public static void main(String[] args) {
        // vanzatori
        Vanzator vanzator1 = new Vanzator("Robert", "IT");
        Vanzator vanzator2 = new Vanzator("Claudia", "Design");
        // departament vanzator este "null" pentru ca nu apartine de nici un departament
        Vanzator vanzator3 = new Vanzator("Vasile", null);

        // cumparatori
        Cumparator cumparator1 = new Cumparator("David", "Iasi", 10);
        Cumparator cumparator2 = new Cumparator("Mirel", "Sibiu", 32);
        Cumparator cumparator3 = new Cumparator("Gigel", "Bucuresti", 0);

        // produse
        Produs produs1 = new Produs("Led 50W", 23.32);
        Produs produs2 = new Produs("Casetofon", 432.1);
        Produs produs3 = new Produs(null, 21.99);

        Comanda comanda = new Comanda();

        // aici am creat un vector de string-uri unde am pus mai multe comenzi
        String[] comenzi = {
                comanda.generateInfoComanda(produs1, vanzator1, cumparator1),
                comanda.generateInfoComanda(produs2, vanzator2, cumparator2),
                comanda.generateInfoComanda(produs1, vanzator2, cumparator1),
                comanda.generateInfoComanda(produs2, vanzator3, cumparator3),
                comanda.generateInfoComanda(produs3, vanzator3, cumparator1),
        };

        // exporta comenzile, este nevoie de try-catch pentru ca metoda arunca o exceptie si aici trebuie sa o prindem
        try {
            exportInfoComanda(comenzi);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
