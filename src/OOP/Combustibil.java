package OOP;

import javax.jws.WebParam;

//Subclasa
public class Combustibil extends Auto{

    private String Marca;
    private String Model;
    private int An;
    private int consum;
    private String euro;


    //polimorfism static
    public Combustibil()
    {}
    public Combustibil(int consum){
        this.consum = consum;
    }

    Combustibil(String Model, int consum) {
        super(Model);
        this.consum = consum;
    }

    //getters
    public int getconsum() {return this.consum;}
    public String geteuro() {return this.euro;}

    //Setters
    public void setconsum(int consum) {this.consum = consum;}
    public void seteuro(String euro) {this.euro = euro;}

    //Override
    public void masina(){
        System.out.println("consumul este " + consum);

    }

    public String toString(){
        return "Marca: " + getMarca() + " Cp: " + getconsum();
    }
}
