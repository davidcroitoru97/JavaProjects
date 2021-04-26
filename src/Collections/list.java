package Collections;
import java.util.*;
public class list {
//list-ArrayList

    public static void main(String[] args)
        {
            // am creat lista
            List<String> a1
                    = new ArrayList<String>();
            List<String> b1
                    = new ArrayList<String>();

            // Aici adaugam un element pe indexul 0
            a1.add(0, "Croitoru");

            // Aici adaugam un element pe indexul 1 si am afisat l1 si elementul de pe indexul 1
            a1.add(1, "David");
            System.out.println(a1);
            System.out.println(a1.get(1));

           // Alta lista
            List<String> a2
                    = new ArrayList<String>();

            a2.add("Nume");
            a2.add("si");
            a2.add("Prenume");

            // Aici am adaugat la lista l1 lista l2 incepand de la indexul 0
            a1.addAll(0, a2);
            System.out.println(a1);

             //Aici am sters din elementele listei l1 elementele de la index 1,2
           a1.remove(1);
           a1.remove(2);
           System.out.println(a1);


            // Aici inlocuim un element de pe indexul 0
           a2.set(0, "NUME");
           a2.set(1," ");
            System.out.println(a2);

            b1.add("c");
            b1.add("w");
            b1.add("a");
            b1.add("e");
            //Sortam elementele din lista
            Collections.sort(b1);
            System.out.println(b1);




        }
    }

