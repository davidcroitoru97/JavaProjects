package Collections;

import java.util.HashMap;

public class map {
    public static void main(String[] args){

        //am creat HashMap
        HashMap<String, String> masini= new HashMap<String, String>();
        //Adaugam cheie si valoare
        masini.put("Opel","Astra");
        masini.put("Ford","Galaxy");
        masini.put("Audi","A4");
        System.out.println(masini);

        //Am afisat Key si valoare
        for(String i : masini.keySet()){
            System.out.println("Marca: " + i +" Model: " + masini.get(i));
        }

        //Am afisat valoare lui Key Ford
        System.out.println(masini.get("Ford"));
        //Stergem valoarea pentru Opel
        masini.remove("Opel");
        System.out.println(masini);
    }
}
