package Evaluation_1;

import static Evaluation_1.Rasa.Par;

//Am implementat interfata in clasa Vaca
public class Vaca extends Animal implements Rasa{

    //metode moostenite de la clasa abstracta
    @Override
    public void rasa() {System.out.println("Rasa Belgiana");

    }
    //metode mostenite de la clasa abstracta
    @Override
    public void talie() {

    }

    //Am implementat metodele interfetei
    @Override
    public String Ochi() {
        return null;
    }

    @Override
    public void picioare() {

    }
}

