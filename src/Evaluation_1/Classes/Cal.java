package Evaluation_1.Classes;

import Evaluation_1.AbstractClasses.Animal;
import Evaluation_1.Interfaces.Rasa;

//Am implementat interfata in clasa Cal
public class Cal extends Animal implements Rasa {
    private  String Coada;
    private String Nume;
    private String numeRasa;

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

    // Inteles aici este implementat setter-ul si metoda care se foloseste de un setter
    // setter pentru string-ul numeRasa
    public void setNumeRasa(String numeRasa) {
        this.numeRasa = numeRasa;
    }

    @Override
    public void numeRasa(String parametru) {
        setNumeRasa(parametru);
        System.out.println("Calul este de rasa " + parametru);
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
