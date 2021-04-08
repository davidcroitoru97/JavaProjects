package Introduction.ConditionsAndLoops;

public class ForLoop {

    public static void main(String []args){
        // TODO: creiaza si tu alti vectori si alte for-uri

        //vector cu 5 elemente
        int vector[] = {1,2,3,4,5};

        for_loop(vector);
    }

    /**
     * Aici ai metoda cu for loop
     * @author Robert
     */
    // metoda aceasta foloseste for ca sa parcurga toate elementele unui vector, cum am facut vara asta
    public static void for_loop(int vector[]){
        System.out.print("Vectorul este: ");

        // creaiaza o variabila care incepe de la indexul 0; x nu trebuie sa fie mai mic sau egal cu lungimea vectorului (vector.length); x++ itereaza vectorul (adica crestel cu cate o unitate (+1) dupa ce termini for-ul)
        for(int x = 0 ; x <= vector.length; x++){
            System.out.print(x + " ");
        }

    }
}
