package Collections;

import java.util.Stack;

public class stack {
    public static void main(String[] args){
        //facut o stiva
        Stack s1=new Stack();

        //Pushing elemente in stiva
        s1.push("Ana");
        s1.push("Are");
        s1.push("Mere");

        System.out.println(s1);
        //Afisat ultimul element adaugat in Stiva
        System.out.println("Element cap lista: "+s1.peek());

        //Scoatem elemente din stiva si afisam ce am scos si ce a mai ramas
        System.out.println(s1.pop());
        System.out.println(s1.pop());

        System.out.println("Stiva dupa eliminarea ultimelor 2 valori adaugate: " + s1);
    }
}
