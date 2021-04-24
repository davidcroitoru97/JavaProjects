package Collections;
import java.util.*;
public class linkedList {
    public static void main(String args[]){

        //LinkedList avem aici
        LinkedList<String> a = new LinkedList<String>();

        // Am adaugat un element
        a.add("Croitoru");
        //Am adaugat Nume ca primul element al listei
        a.addFirst("Nume");
        //Aici adaugam falticeni ca ultimul element al listei
        a.addLast("Falticeni");
        //Aici am adaugat david pe pozitia 2(index2)
        a.add(2,"David");
        System.out.println(a);
        //Aici am sters falticeni
        a.remove("Falticeni");
        System.out.println(a);

    }
}

