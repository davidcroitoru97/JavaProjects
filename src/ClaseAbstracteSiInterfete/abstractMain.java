package ClaseAbstracteSiInterfete;

import ClaseAbstracteSiInterfete.Classes.*;
import ClaseAbstracteSiInterfete.Interfaces.Angajati;
import ClaseAbstracteSiInterfete.Classes.Director;
import ClaseAbstracteSiInterfete.Classes.Manager;

public class abstractMain {

    public static void main(String []args){
        Cat cat = new Cat();

        //Rezolvat Creiaza o interfata cu cateva metode pe care sa le apelezi intr-o clasa implementand interfata si furnizandui o implementare.
        //Rezolvat Creiaza o clasa abstracta si aplica principiile OOP pentru ea, in acelasi timp citeste care sunt functionalitatile pe care le detine o clasa abstracta fata de una normala si joaca te cu ele in cod.

        // Audi IS-A PatternMasina
        //PatternMasina patternMasina = new Audi();
       // patternMasina.motortizare();

        //PatternMasina patternMasina1 = new BMW();
        //patternMasina1.motortizare();

        Angajati angajat1 = new Director();
        System.out.println(angajat1.nume());
        angajat1.salar();
        System.out.println("Vechimea este de " + angajat1.vechime() + " ani");

        Angajati angajat2 = new Manager();
        System.out.println(angajat2.nume() + " Vechimea este de " + angajat2.vechime() + " ani");

        //Aici am afisat variabila mostenita
        Director director= new Director();
        director.cod();

    }
}
