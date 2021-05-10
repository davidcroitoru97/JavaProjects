package Collections;
import java.util.*;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;

public class lista {

    public static void main(String[] args){

        List<Integer> a1 = new ArrayList<Integer>();

        a1.add(1);
        a1.add(2);
        a1.add(1);

        try {
            for (int i = 0; i < a1.size(); i++) {
                Thread.sleep(3000);
                System.out.println(a1.get(i));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
