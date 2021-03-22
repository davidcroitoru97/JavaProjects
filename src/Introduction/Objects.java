package Introduction;

// REZOLVAT : Citeste despre ce seminifica o clasa si ce este un obiect
// REZOLVAT: Citeste ce este un constructor si ce este o instanta
public class Objects {
    String nume;
    String prenume;
    int varsta;


    // Rezolvat: Creiaza un constructor fara parametrii pentru aceasta clasa
        Objects()
        {
            nume = "Croitoru";
            prenume = "David";
            varsta = 23;
        }

    // Rezolvat: Creiaza un constructor cu parametrii(nume, prenume, varsta) pentru aceasta clasa

        Objects(String nume, String prenume, int varsa)
        {
            this.nume = nume;
            this.prenume = prenume;
            this.varsta = varsta;
        }

    // TODO-5: Creiaza o metoda care insumeaza 2 variabile de tip int

    // TODO-6: Creiaza o metoda toString care sa afiseze valorile constructorului cu parametrii
}
