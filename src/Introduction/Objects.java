package Introduction;

public class Objects {
    // TODO-9: Daca ai citit si inteles specificatorii de acces, poti intra putin in conceptul de incapsulare adica
    // TODO-9: declara aceste variabile private, creiaza setters si getters, iar cu ajutorul unui constructor blank
    // TODO-9: seteaza valori pentru variabilelor utilizand setters si afiseaza in consola valorile folosind getters
    private String nume;
    private String prenume;
    private int varsta;

    public int a  ;
    public int b ;


    // TODO: un construcor fara parametrii nu are scopul de a deservii anumite valori unor variabile
    // TODO: un constructor blank ar trebuii sa fie in general simplu "Objects(){}" el fiind folosit pentru a creia o instanta a acestei clase
    // TODO: se creiaza instanta pentru a putea apela metodele din acesta clasa
    // TODO-8: sterge parametrii din acest constructor, dupa ce faci, poti sterge aceste todo-uri
        Objects()
        {

        }
        public String getnume()
        {
            return this.nume;
        }

        public String getprenume()
        {
            return this.prenume;
        }

        public int getvarsta()
        {
            return this.varsta;
        }

        public void  setnume(String nume)
        {
            this.nume = nume;
        }
        public void setprenume(String prenume)
        {
            this.prenume = prenume;
        }
        public void setvarsta(int varsta)
        {
            this.varsta = varsta;
        }



        // Verificat, ai grija la variabile, ca ai scis varsta gresit la parametrii constructorului, invata sa folosesti auto-completul
        /*Objects(String nume, String prenume, int varsta)
        {
            this.nume = nume;
            this.prenume = prenume;
            this.varsta = varsta;
        } */


    // Aici nu am rezolvat nimic
    // Nu reusesc sa apelez metoda Suma in main
    // Creeaza o metoda care insumeaza 2 variabile de tip int

    public static int suma(int a , int b)
    {
        //this.a = a;
       // this.b = b;

        return a+b;
    }

    // rezolvat in clasa Garaj Creiaza o metoda toString care sa afiseze valorile constructorului cu parametrii
}
