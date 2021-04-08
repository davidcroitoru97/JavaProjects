package Introduction.Classes;

public class introductionMain {

    public static void main(String []args){

        // Aici o sa iti fac o parcurgere a anumitor concepte si vreau sa te uiti si sa intelegi foarte bine

        // Declararea unui obiect de tipul garaj
        Garaj autoRobert = new Garaj();

        System.out.println(autoRobert);
        // Instantierea unui obiect, Am folosit constructorul blank (new Garaj();)
        // Instantierea este practic ce se intampla dupa "="
       // autoRobert = new Garaj();

        // Instantierea unui obiect, Am folosit constructorul cu argumente " public Garaj(int nrMecanici, int locuri, String numeMan, String prenumeMan)"
        //autoRobert = new Garaj(4,5,"Robert","CRV");

        // Declarere + instantiere
        // Garaj autoRobert = new Garaj();

        // Initializarea cu valori a unui obiect


        // Afisarea unui obiect folosin metoda toString declarata in clasa Garaj
       // System.out.println(autoRobert);

        //Aici am apelat constructorul cu doi parametri din clasa Garaj
        Garaj C = new Garaj();

        //Aici am initializat cu valori si am folosit metoda toString
       // C.setnrMecanici(3);
       // C.setNumeMan("David");

        //Si din cauza ca in string sunt 4 parametri si eu am folosit doar 2, cei pe care nu i-am folosit li s-au atribuit valoarea null;
       // System.out.println(C);

        // In realitatea nu prea o sa faci afisari in consola, doar niste logari care sunt practic cumva acelasi lucru,
        // doar sa deserveasca o informatie care poate fi citita de catre programator. Tu faci afisarile in momentul de fata ca
        // sa intelegi ce output furnizeaza toata logica pe care tu o implementezi. De obicei, ca si exemplu, dupa ce setezi valorile
        // unui constructor , il pui in ceva sau faci ceva cu el, il salvezi etc. Asta este un practice sa intelegi ce se intampla
        // cand faci aceasta logica.

        /**
         * @author: Robert
         * Example: aici sunt exemple de concatenare in diverse circumstante
         */
        // In afisare practic tu faci un string care sa fie afisat, pe langa metoda toString, poti sa concatenzi diferite variabile sau obiecte
            // Concatenarea se face folosind "+". Ti-am facut un exemplu mai jos, poti sa il rulezi  si sa vezi ce face
           // System.out.println("Nume: " + B.getnumeMan() + " Prenume: " +B.getnumeMan() + " are " + 234 + " lucrari facute.");

            // alt exemplu de concatenare
//            String nume = "Robert" + " Vasile";
//            int varsta = 24;
//            System.out.println("Utilizatorul este: " + nume + " cu varsta de " + varsta + " ani.");

            // concatenarea o poti folosi si la combinarea unor valori. daca faci int x = 4 + 5; aici nu este concatenare, este adunare
            // concatenarea se face la siruri de caractere.

//            int x = 3;
//            int y = 5;
//            String coordonate1 = "x1: " + x + " y1: " + y;
//            System.out.println(coordonate1);

            // daca faci asa int-urile se concateneaza
            //String coordonate2 = "x2: " + x + y;

            // daca faci asa , ele se aduna, sau se pot inmulti, imparti, scadea etc.
           // String coordonate3 = "x3: " + (x+y);

    }
}
