package Introduction.ConditionsAndLoops;

public class ConditionalIfElse {

    public static void main(String args[]){
        // TODO: te rog sa apelezi fiecare metoda de mai jos cu parametrii necesarii si sa intelegi cum functioneaza
        // TODO: pe langa asta te rog sa te gandesti la niste exemple in care poti implementa tu aceste conditii if-else

    }

    /**
     * Aici ai metode cu if-else
     * @author Robert
     */
    private static void metoda_cu_if_si_else(boolean parameter){
        // in conditia if(parameter)  -> ea se traduce in felul urmator, DACA PARAMETER ESTE TRUE fa system, ALTFEL (else) fa celalalt system.
        if(parameter){
            System.out.println("Parametrul este true");
        }else {
            System.out.println("Parametrul este false");
        }
    }

    private static void metoda_cu_if_si_else_negat(boolean parameter){
        // aici din cauza faptului ca am pus !parameter, el se traduce ca fiind, DACA PARAMETER ESTE FALSE, simbolul ! semnaland o negatie
        if(!parameter){
            System.out.println("Parametrul este false");
        }else{
            System.out.println("Parametrul este true");
        }
    }

    private static void metoda_cu_if_si_elseIf(int number){

        if(number == 1){
            System.out.println("Numarul are valoarea -> 1");
        }else if(number == 5){
            System.out.println("Numarul are valoarea -> 5");
        }else if(number == 10){
            System.out.println("Numarul are valoarea -> 10");
        }else{
            System.out.println("Numarul are valoarea: " + number);
        }
    }
}
