package Introduction.ConditionsAndLoops;

public class ConditionalSwitch {

    public static void main(String []args){
        // TODO: testeaza si joacate cu metoda asta, si creiaza una care sa ia ca pararmetru un int
    }

    /**
     * Aici ai metoda cu switch
     * @author Robert
     */
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
