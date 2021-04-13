package Evaluation_1;

import Evaluation_1.Classes.Cal;
import Evaluation_1.Interfaces.Rasa;

public class AnimalMain {

    public static void main(String []args){

        //Am apelat si afisat variabilele mostenite
        /*
        Cal cal1 = new Cal();
        cal1.rasa();

        Cal cal2=new Cal();
        cal2.talie();
        cal2.sunet();

        //Vaca IS-A Animal
        Animal vaca1 = new Vaca();
        vaca1.rasa();
        //Am afisat metodele implementate din interfata in clasa Cal
        Rasa cal3= new Cal();
        //System.out.println(cal3.Ochi());
        cal3.picioare();

        Cal cal5= new Cal();
        cal5.setNume("Clat");

        System.out.println(cal5);
*/
        // Creez un cal care este un animal
        // Cal IS-A Rasa
        Rasa cal = new Cal();
        // Ma folosesc de metoda din interfata ca sa setez acestui cal, numele rasei (e pe acelasi principiu ca setters, doar ca ne folosim de o metoda mostenita
        // in aplicatii poti face o metoda care are mai multe functionalitati, si una dintre ele sa fie sa ii setezi o variabila
        cal.numeRasa("Belgian");
    }
}
