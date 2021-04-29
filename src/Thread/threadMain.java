package Thread;

public class threadMain extends Thread {

    public static int a=0;
    public static void main(String[] args){

        //aici am facut doar ca sa vad cum execut codul in thread
        //threadMain thread = new threadMain();
       // thread.start();

        threadMain thread1 = new threadMain();
        thread1.start();
        //Asteptam ca firul sa se termine
        while(thread1.isAlive()) {
            System.out.println("Se asteapta");
        }
        // facem update si afisam valoarea
        System.out.println("valoare1: " + a);
        a++;
        System.out.println("valoare2: " + a);


    }
    public void run(){
        //thread
        //System.out.println("se executa in thread");

        //thread1
        a++;
    }
}
