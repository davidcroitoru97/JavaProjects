package Introduction;

public class Garaj {

    int nrMecanici;
    int locuri;
    String numeMan;
    String prenumeMan;

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
