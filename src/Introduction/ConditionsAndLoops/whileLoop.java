package Introduction.ConditionsAndLoops;

public class whileLoop {

    public static void main(String args[]){
        //TODO: incearca sa schimbi number pentru metoda sa vezi ce se intampla si sa intelgi logica
        while_loop(6);
    }

    /**
     * Aici ai metoda cu while loop
     * @author Robert
     */
    public static void while_loop( int number){

        boolean parameter = true;

        // cat timp parametrul este true executa codul
        while(parameter){

            // Daca number=5 fa parameter = false ca sa termini while
            if(number == 5){
                parameter = false;
                System.out.println("Numarul a atins valoarea " + number);
                // opreste while daca numarul este egal cu 5
                break;

                // daca number este mai mare ca 5 opreste while-ul
            }else if(number > 5){
                parameter = false;
                System.out.println("Numarul este prea mare");
                // opreste while daca este mai mare decat 5
                break;
            }else{
                // daca parametrul nu este egal cu 5 sau mai mare cu 5 atunci afiseaza numarul
                System.out.println("Numarul este: " + number);
            }

            //creste number cu o unitate la fiecare executie de while
            number++;
        }

    }

}
