package Introduction;

public class introductionMain {

    // TODO: Aici vei apela toate metodele din clasele pe care le vei face in pachetul "Introduction"
    public static void main(String []args){

        //Apeleaza constructorii si metodele din clasa Objects aici
        
        //Aici am facut partea de incapsulare
        Objects A = new Objects();

        A.setnume("David");
        A.setprenume("Croitoru");
        A.setvarsta(23);
       // System.out.println("Numele este: " + A.getnume() + " Prenumele este: " + A.getprenume() + " Varsta este: " + A.getvarsta());

        //Objects B = new Objects("Dinu" , "Croitoru",  23);
        
        // ici trebuia sa apelez constructorul Suma dar nu inteleg cum sa fac. am scris toate metodele si nu reusesc sa fac sa afisez suma;
        // pana la afisare nu reusesc sa o apelez in main
       // System.out.println(A.suma(6,8));
        int a=2;
        int b=3;
        //System.out.println("suma este "+ sum);
//Aici am folosit metoda toString si m-am "jucat" ca sa inteleg cum e treaba cu metoda asta
        Garaj B = new Garaj();
        Garaj C = new Garaj(4,5,"Andrei","Popescu");

        B.setnrMecanici(54);
        B.setlocuri(6);
        B.setNumeMan("Adrian");
        B.setPrenumeMan("Popescu");
        //System.out.println("Numarul de mecanici din garaj este: " + B.getnrMecanici() + " Numarul de locuri din garaj este :" + B.getlocuri() + " Numele complet al manager-ului este " + B.getnumeMan() + " " + B.getprenumeMan());
        System.out.println(B);
        //System.out.println(B.toString());

        //TODO: In afisare practic tu faci un string care sa fie afisat, pe langa metoda toString, poti sa concatenzi diferite variabile sau obiecte
        // Concatenarea se face folosind "+". Ti-am facut un exemplu mai jos, poti sa il rulezi  si sa vezi ce face
        System.out.println("Nume: " + B.getnumeMan() + " Prenume: " +B.getnumeMan() + " are " + 234 + " lucrari facute.");
        //TODO: alt exemplu de concatenare
        String nume = "Robert" + " Vasile";
        int varsta = 24;
        System.out.println("Utilizatorul este: " + nume + " cu varsta de " + varsta + " ani.");
        //TODO concatenarea o poti folosi si la combinarea unor valori. daca faci int x = 4 + 5; aici nu este concatenare, este adunare
        // concatenarea se face la siruri de caractere.
        int x = 3;
        int y = 5;
        String coordonate1 = "x1: " + x + " y1: " + y;
        // TODO : daca faci asa int-urile se concateneaza
        String coordonate2 = "x2: " + x + y;
        // TODO: daca faci asa , ele se aduna, sau se pot inmulti, imparti, scadea etc.
        String coordonate3 = "x3: " + (x+y);
        System.out.println(coordonate1);
        System.out.println(coordonate2);
        System.out.println(coordonate3);
        //System.out.println(C.toString());
    }
}
