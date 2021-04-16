package Evaluation_2;

//import java.io.PrintWriter;

public class Main {

    public static void main(String [] args) {
        //PrintWriter fisier = new PrintWriter(Comenzi.txt);
       // Fisier String fisier = new Fisier();


        Produs produs1 = new Produs();
        produs1.setNumeProdus("Led");
        produs1.setPretProdus(15);
        //System.out.println("Nume produs: " + produs1.getNumeProdus() + " Pret produs: " + produs1.getPretProdus() + " lei");

        Vanzator vanzator1 = new Vanzator();
        vanzator1.setNumeVanzator("Alex");
        vanzator1.setDepartamentVanzator("Legume");
        //System.out.println("Nume vanzator: " + vanzator1.getNumeVanzator() +" Departament vanzator " + vanzator1.getDepartamentVanzator());

        Produs produs2= new Produs("Mere", 12);
        Vanzator vanzator2= new Vanzator("Florin", "Legume");
        Cumparator cumparator2= new Cumparator("David","Falticeni",2);

        Comanda comanda = new Comanda();
        System.out.println(comanda);


    }


}
