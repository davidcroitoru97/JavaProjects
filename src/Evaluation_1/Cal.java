package Evaluation_1;

//Am implementat interfata in clasa Cal
public class Cal extends Animal implements Rasa{

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
    public String Ochi() {
        return "Caprui";
    }

    @Override
    public void picioare() {
        System.out.println("patruped");


    }





}
