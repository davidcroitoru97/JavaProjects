package Introduction;

public class Garaj {

    //Rezolvat-Verificare: Fa aceste variabile private, in momentul de fata  ele sunt vizibile la nivel de pachet.
    // Rezolvat vei seta si vei prelua valorile folosind getters and setters, ca de aia ai creat acele metode

    //Aici nu am inteles cum spui tu sa folosesc garaje.nr>mecanici pentru a schimba valoarea int-ului
    // TODO:in momentul de fata din clasa main poti face "garaj.nrMecanici" si sa schimbi valoarea int-ului
    //  asta este bad practice, tot timpul declara variabilele private si folosesti setteri & getteri publici ca sa modifici caracteristici
    //  acesta este principiul incapsularii, ia si citeste despre incapsulare si fa aceste variabile private
    private int nrMecanici;
    private int locuri;
    private String numeMan;
    private String prenumeMan;

    Garaj()
    {}

    Garaj(int nrMecanici, int locuri, String numeMan, String prenumeMan)
    {
        this.nrMecanici = nrMecanici;
        this.locuri = locuri;
        this.numeMan = numeMan;
        this.prenumeMan = prenumeMan;
    }
    //getters
        public int getnrMecanici()
        {
            return this.nrMecanici;
        }
        public int getlocuri()
        {
            return this.locuri;
        }
        public String getnumeMan()
        {
            return this.numeMan;
        }
        public String getprenumeMan()
        {
            return this.prenumeMan;
        }

        //setters
        public void setnrMecanici(int nrMecanici)
        {
            this.nrMecanici = nrMecanici;
        }
        public void setlocuri(int locuri)
        {
            this.locuri = locuri;
        }
        public void setNumeMan(String numeMan)
        {
            this.numeMan = numeMan;
        }
        public void setPrenumeMan(String prenumeMan)
        {
            this.prenumeMan = prenumeMan;
        }

       // public String toString()
       // {
       //     return "Nr de mecanici  " +  nrMecanici +  " " + "Nr de locuri  " + locuri + " " +"Nume complet Manager " + numeMan + " " + prenumeMan + " ";
       // }

 }
