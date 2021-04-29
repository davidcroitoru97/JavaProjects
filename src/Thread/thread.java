package Thread;

public class thread  extends Thread{

     private int a;
     private int b;

     public void valori (){
         a++;
         b++;
     }
     public void run(){
         super.run();
         for(int i=0;i<5;i++){
             valori();
         }
     }
}
