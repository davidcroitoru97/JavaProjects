package Exceptii.Classes.RuntimeExceptions;

/**
 * Runtime Exception
 */
public class NullPointerExceptionEX {

    public static void main(String []args){
        // Aici este un exemplu cand sare NullPointerException, deoarece exista acest obiect care este null si incerc sa
        // convertesc ceva ce nu exista intr-un String
        // nullPointer poate sa apara in multe alte cazui, acesta este doar un exemplu
        NullPointerExceptionEX object = null;

        object.toString();
    }

    public void tratareExceptie(NullPointerExceptionEX object){
        try{
            object.toString();
        }catch (NumberFormatException numberFormatException){
            System.out.println("Null Pointer");
        }
    }

    public void goodPractice(NullPointerExceptionEX object){
        // Daca obiectul nu este null, atunci fa object.toString() pentru a evita null pointer
        if(object != null){
            object.toString();
        }
    }


}
