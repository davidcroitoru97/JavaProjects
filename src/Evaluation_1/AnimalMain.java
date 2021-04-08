package Evaluation_1;

public class AnimalMain {

    public static void main(String []args){

        //Am apelat si afisat variabilele mostenite
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
        System.out.println(cal3.Ochi());
        cal3.picioare();

    }
}
