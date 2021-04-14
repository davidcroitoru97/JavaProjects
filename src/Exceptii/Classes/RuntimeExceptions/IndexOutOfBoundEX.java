package Exceptii.Classes.RuntimeExceptions;

/**
 * Runtime Exception example
 * Adica exceptia asta apare in timpul executiei (cand dai run)
 */
public class IndexOutOfBoundEX {

    public static void main(String []args){

        // Aceasta metoda o sa arunce o exceptie, adica ArrayIndexOutOfBoundsException deoarece vectorul are 4 elemente
        // deci index-ului este {0, 1 , 2 , 3}, si eu am incercat sa afisez ce este pe pozitia 5 care nu exista, de asta si exceptia
        int vector[]={1,2,3,4};

        System.out.println(vector[3]);

    }

    public static void tratareExceptie(int vector[]){
        // aici am tratat exceptia ca sa nu existe probleme, dar best practice este in metoda goodPractice
        try{
            System.out.println(vector[5]);
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Index-ul este mult prea mare");
        }
    }

    public static void goodPractice(int vector[]){
        // in cazul asta, felul in care am scris codul, nu arunca nici o exceptie pentru ca am prevenit apelarea index-ului mai mare decat lungimea vectorului prin acel if
        if(vector.length < 5){
            System.out.println("Indexul este prea mare");
        }else{
            System.out.println(vector[5]);
        }
    }
    public static void aruncareExceptie(int vector[]) throws ArrayIndexOutOfBoundsException{
        System.out.println(vector[5]);
    }


}
