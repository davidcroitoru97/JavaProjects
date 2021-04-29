package Thread;

public class runnableMain implements Runnable{
    public static int b=0;
    public static void main(String[] args){


        threadMain thread = new threadMain();
        Thread aa= new Thread(thread);
        aa.start();

        threadMain thread1 = new threadMain();
        thread1.start();
       System.out.println(b);
        b++;
      System.out.println(b);

    }


    public void run() {
        System.out.println("cod ce se executa in thread dar implementand Runnable");
       b++;

    }
}
