package Evaluation_1;

//Am implementat interfata in clasa Cal
public class Cal extends Animal implements Rasa{
    private  String Coada;
    private String Nume;

    public void setNume(String nume) {
        Nume = "Gica";
    }

    //metode mostenite de la clasa abstracta
    @Override
    public void rasa() {System.out.println("Rasa Mustang");

    }
    ////metode mostenite de la clasa abstracta
    @Override
    public void talie() {System.out.println("Talie mare");

    }
//Am implementat metodele

    @Override
    //Aici e metoda din interfata cu un string pe care am implementat-o in clasa cal
    // am facut in ea un string nume
    //Acum nu reusesc sa l afisez orice as scrie
    public String Nume(String Nume) {
        return  this.Nume =Nume;
    }
    
    

    @Override
    public String Par(String Par) {
        return Par="Galben";
    }

    @Override
    public String picioare() {
        return null;
    }


    // }


   // public void setlocuri(int locuri) {
       // this.locuri = locuri;
    //}
        //public void setPar(int Par)
        //{
       //     this.setPar =Par;
      //  }
  // public String geOchi() {
      // return this.Ochi;
   //}
      // public void setOchi(String Ochi)
      // {
      //      this.setOchi=Ochi;
      // }


    public String getCoada() {
        return Coada;
    }

    public void setCoada(String coada) {
        Coada = coada;
    }
}
