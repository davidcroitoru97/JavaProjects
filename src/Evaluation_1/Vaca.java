package Evaluation_1;

//import static Evaluation_1.Rasa.Par;

//Am implementat interfata in clasa Vaca
public class Vaca extends Animal implements Rasa{

    private String numeRasa;

    //metode moostenite de la clasa abstracta
    @Override
    public void rasa() {System.out.println("Rasa Belgiana");

    }
    //metode mostenite de la clasa abstracta
    @Override
    public void talie() {

    }


    @Override
    public String Nume(String Nume) {
        return null;
    }

    @Override
    public String Par(String Par) {
        return null;
    }

    @Override
    public String picioare() {
        return null;
    }

    public void setNumeRasa(String numeRasa) {
        this.numeRasa = numeRasa;
    }

    @Override
    public void numeRasa(String parametru) {
        setNumeRasa(parametru);
        System.out.println("Vaca este de rasa " + parametru);
    }

    //Am implementat metodele interfetei

}

