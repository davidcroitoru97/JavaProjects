package ObjectClass;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
public class objectMain {

        public static void main(String[] argv)
                throws Exception
        {

            // Am creat un stringBuilder
            StringBuilder q
                    = new StringBuilder();

            q.append("David");

            // am afisat Stringul
            System.out.println("q = "
                    + q.toString());

            // Am creat un StringBuilder
            StringBuilder q1
                    = new StringBuilder("Alex");

            // afisam stringul 1
            System.out.println("q1 = "
                    + q1.toString());
            //ce am stric in string mutam in string2
            StringBuilder q2
                    = new StringBuilder(q.toString());

            // afisam stringul 2
            System.out.println("q2 = "
                    + q2.toString());

        //SringBuffer

            StringBuffer a = new StringBuffer("David");
            a.append(" Croitoru"); //Adaugam Croitoru
            System.out.println(a);
            a.append(" Falticeni"); //Mai adaugam Falticeni
            System.out.println(a);
        }

    //  ca sa navighezi in IntelliJ trebuie sa folosesti "cmd + click"
    //  apasa "cmd + click" pe clasa Object ca sa te duca la metodele sale
    Object object;
}
