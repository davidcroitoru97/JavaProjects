package Introduction.ConditionsAndLoops;

import javax.sound.midi.SysexMessage;

import static java.lang.System.out;

public class ForLoop {

    public static void main(String[] args) {
        // facut: creiaza si tu alti vectori si alte for-uri

        //vector cu 5 elemente
        int vector[] = {1, 2, 3, 4, 5};
        for_loop(vector);

       int vect[] ={0,4,10,9};
      // vect2(vect);

        //Un vector A cu 5 pozitii
        int[] A=new int[5];
        vec1(A);
        //am afisat suma
        System.out.println("suma este: " + sum(vect));


    }

    /**
     * Aici ai metoda cu for loop
     *
     * @author Robert
     */
    // metoda aceasta foloseste for ca sa parcurga toate elementele unui vector, cum am facut vara asta
    public static void for_loop(int vector[]) {
        out.print("Vectorul este: ");

        // creaiaza o variabila care incepe de la indexul 0; x nu trebuie sa fie mai mic sau egal cu lungimea vectorului (vector.length); x++ itereaza vectorul (adica crestel cu cate o unitate (+1) dupa ce termini for-ul)
        for (int x = 0; x <= vector.length; x++) {
            out.print(x + " ");
        }



    }
    //public static void vect(int vect[]){

      //  for (int i=0; i<9;i++){
        //    System.out.println(i);
       // }

    //}

    //Am afisat toate elementele vect pana la pozitia 4 inclusiv pozitia 4
    public static void vec1(int A[]){
        for(int i=0; i<=4;i++){
            A[i]=i;

           out.println(A[i]);
        }
    }
    //Calculat suma vectorului
    public static int sum(int vect[])
    {
        int sum = 0;
        for(int i=0;i<vect.length; i++) {
            sum += vect[i];

        }
        return sum;

    }


}


