package Introduction;

public class introductionMain {

    // TODO: Aici vei apela toate metodele din clasele pe care le vei face in pachetul "Introduction"
    public static void main(String []args){

        //Apeleaza constructorii si metodele din clasa Objects aici
        
        //Aici am facut partea de incapsulare
        Objects A = new Objects();

        A.setnume("David");
        A.setprenume("Croitoru");
        A.setvarsta(23);
        System.out.println("Numele este: " + A.getnume() + " Prenumele este: " + A.getprenume() + " Varsta este: " + A.getvarsta());

        //Objects B = new Objects("Dinu" , "Croitoru",  23);

        // aici trebuia sa apelez constructorul Suma dar nu inteleg cum sa fac. am scris toate metodele si nu reusesc sa fac sa afisez suma;
        // pana la afisare nu reusesc sa o apelez in main
        System.out.println(A.suma(6,8));
        int a=2;
        int b=3;
        //System.out.println("suma este "+ sum);
    }
}
