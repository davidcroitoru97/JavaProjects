package OOP;

import OOP.Mostenire.Auto;
import OOP.Mostenire.Combustibil;
import OOP.Mostenire.SUV;

public class oopMain {

    //Rezolvat: Vezi ca ti-am pus clasele facute de tine in pachetul Mostenire unde le este locul, acum ca le-am mutat au aparut niste erori aici la instantierea obiectelor, vezi din ce cauza si cum le rezolvi
    //TODO-2: In fisierul oopConclusion.md sunt intrebarile  comune ce pot fi la interviu din ce ai invatat tu pana acum, te rog sa raspunzi la ele cu cuvintele tale incat
    // sa pot sa iti furnizez o definitie finala pe care sa o stii pentru interviu. De asemenea chit ca treci mai departe, nu uita  sa te intorci si sa repeti.
    public static void main(String []args){
        //Incapsulare
        //am declarat un obiect
        Auto auto = new Auto();
        SUV suv = new SUV("integrala");
        Combustibil cons = new Combustibil(5);

        auto.masina();

        Combustibil c=new Combustibil();

        //am declarat un obiect ce mostenea argumente de la clasa Auto si am facut si afisarea folosind metoda toString
        SUV sandra = new SUV("Audi", "A4", 2019, "integrala", 250);
        System.out.println(sandra);

        Combustibil comb = new Combustibil();
        comb.setMarca("BMW");
        comb.setconsum(11);
        System.out.println(comb);

        //SUV masina = new SUV();
       // masina.setModel("BMW");
        //masina.setMarca("seria 5");

       // masina.masina();

        //Am initializat valori
       // auto.setMarca("BMW");
        //auto.setModel("E39");

        //Am facut afisare
        //System.out.println("Marca este: " + auto.getMarca() + " Modelul este: " + auto.getModel());
        // Am facut afisarea folosint metoda toString
        //System.out.println(auto);

    }

}
