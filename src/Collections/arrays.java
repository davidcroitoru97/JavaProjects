package Collections;

/**
 * Arrays / Vectori
 */
public class arrays {

    public static void main(String []args) {
        // vectorul are dimensiune statica
        int vectorForIntegers[] = new int[10];

        // adaugare valoare 32 pe indexul 0
        vectorForIntegers[0]= 32;
        // adaugare valoare 54 pe indexul 7 (adica pe pozitia 7)
        vectorForIntegers[7] = 54;

        // afisare valoare de pe indexul 7
        System.out.println(vectorForIntegers[7]);
    }
}
