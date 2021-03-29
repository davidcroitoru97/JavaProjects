package OOP;

public class oopMain {

    // Ai grija cand dai run, sa dai de aici, in partea de sus-dreapta poti seta mai multe metode la care sa dai run(chenarul in care scrie introducitonMain)
    // Rezolvat Creiaza o clasa si implementeaza conceptul de incapsulare


    // TODO-HINT: sa stii ca abstractizarea poate fi faptul ca tu folosesti getters & settari pentru a modifica si a prelua valori
    //  acoperind conceptul ca, tu stii ca daca folosesti setter, acea metoda o sa seteze o valoare pentru respectiva variabila
    //  dar nu stii cum o face.

    //TODO: te rog sa citesti bine despre incapsulare, daca nu ai inteles specificatorii de acces, revin o la ei
    //TODO: citeste si despre abstractizare si noteaza-ti
    //TODO-OOP-2: Citeste si invata despre mostenire
    public static void main(String []args){
        //Incapsulare
        //am declarat un obiect
        Auto auto = new Auto();

        //Am initializat valori
        auto.setMarca("BMW");
        auto.setModel("E39");

        //Am facut afisare
        System.out.println("Marca este: " + auto.getMarca() + " Modelul este: " + auto.getModel());
        // Am facut afisarea folosint metoda toString
        System.out.println(auto);
    }

    /* TODO-IMPORTANT : Ti-am facut un pachet care se numeste mostenire, in acel pachet
    *   dupa ce citesti despre mostenire, sa iti faci 2, 3 clase pe care o sa le apelezi in acest main.
    *   In aceste clase vreau sa ai o clasa principala si mai multe secundare care sa mosteneasca caracteristici
    *   de la clasa mama. In engleza, termenul de mostenire este cunoscut ca  (inheritance).
    *   Prin topicul asta o sa vreau  sa folosesti si conceptul de incapsulare pentru ce o sa faci.
    *   Aici o sa ai un exercitiu, vreau sa te gandesti la o clasa mama (ex: Masina) care ar avea ca atribute
    *   niste caracteristici comune, gen (numar roti, capacitate cilindrica, motorizare etc.). Clasele secundare care
    *   pot fi de tipul (Audi, BMW, Dacia etc.) o sa mosteneasca acele caracteristici si in plus o sa detina fiecare
    *   niste caracteristici proprii (ex: Audi o sa contina niste caracteristici in plus de tipul "numar geamuri, an fabricatie etc"*
    *   Ca intr-un final Clasa Audi sa detina atributele mostenite (numar roti, capacitate cilindrica etc) + cele proprii (numar geamurir, an fabricatie)
    *   Acesta este un exemplu, tu gandeste te la un alt exemplu. Este foarte bine sa antrenezi aceasta gandire, pentru ca tot ce faci
    *   este orientat spre obiect, adica creiezi obiecte. Exemplul asta iti ofera o gandire de ansamblu asupra cum ai putea sa pui problema
    *   in anumite cirmustante. Vreau sa te joci foarte bine cu mostenirea ( si sa citesti despre "this" si "super") si vreau
    *   sa incluzi toate conceptele invatate pana acum, si evident sa INVETI TEORIA SI SA TI-O NOTEZI, pentru ca este un topic
    *   primordial la orice interviu de angajare, indiferent de limbajul de programare.
    * */
}
