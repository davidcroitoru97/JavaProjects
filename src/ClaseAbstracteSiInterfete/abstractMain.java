package ClaseAbstracteSiInterfete;

import ClaseAbstracteSiInterfete.Classes.Audi;
import ClaseAbstracteSiInterfete.Classes.BMW;
import ClaseAbstracteSiInterfete.Classes.Cat;
import ClaseAbstracteSiInterfete.Interfaces.PatternMasina;

public class abstractMain {

    public static void main(String []args){
        Cat cat = new Cat();

        //TODO-4: Creiaza o interfata cu cateva metode pe care sa le apelezi intr-o clasa implementand interfata si furnizandui o implementare.
        //TODO-5: Creiaza o clasa abstracta si aplica principiile OOP pentru ea, in acelasi timp citeste care sunt functionalitatile pe care le detine o clasa abstracta fata de una normala si joaca te cu ele in cod.

        // Audi IS-A PatternMasina
        PatternMasina patternMasina = new Audi();
        patternMasina.motortizare();

        PatternMasina patternMasina1 = new BMW();
        patternMasina1.motortizare();

    }
}
