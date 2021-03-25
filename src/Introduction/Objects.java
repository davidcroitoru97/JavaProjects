package Introduction;

public class Objects {

    private String nume;
    private String prenume;
    private int varsta;

    public int a  ;
    public int b ;



        Objects() {

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
