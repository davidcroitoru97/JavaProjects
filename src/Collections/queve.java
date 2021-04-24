package Collections;


import java.util.*;

public class queve {

    public static void main(String[] args){

        Queue<String> q= new PriorityQueue<>();

        q.add("Cal");
        q.add("vaca");
        q.add("Oaie");

        //Afisat coada
        System.out.println(q);

        //Am eliminat un element
        q.remove("Oaie");

        //Am afist dupa eliminare
        System.out.println(q);

        //Am adaugat un nou element
        q.add("Capra");
        System.out.println(q);
    }
}
