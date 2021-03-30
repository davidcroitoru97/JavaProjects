package OOP;
//Subclasa
public class Combustibil extends Auto{

    private int consum;
    private String euro;

    //polimorfism static
    public Combustibil(int consum){
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
}
