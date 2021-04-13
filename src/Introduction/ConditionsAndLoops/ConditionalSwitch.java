package Introduction.ConditionsAndLoops;

public class ConditionalSwitch {

    public static void main(String []args){
        // Rezolvat: testeaza si joacate cu metoda asta, si creiaza una care sa ia ca pararmetru un int
        swtich_method("Costel");
        euro( 2);
    }

    /**
     * Aici ai metoda cu switch
     * @author Robert
     */
    public static void euro(int valoare)
    {
        switch (valoare) {
            case 5:
                System.out.println(" Masina este Euro 5 ");
                break;
            case 3:
                System.out.println("Masina ete euro 3");
                break;
            default:
                System.out.println("Masina nu se incadreaza in normele de poluare deoarece este Euro " +valoare);

        }
    }
    public static void swtich_method(String nume){
        switch (nume){
            case "Robert":
                System.out.println("Numele este Robert");
                break;
            case "David":
                System.out.println("Numele este David");
                break;
            case "Vasile":
                System.out.println("Numele este Vasile");
                break;
            default:
                System.out.println("Numele este -> " + nume);
                break;
        }
    }


}
