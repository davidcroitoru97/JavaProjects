package OOP;
//Subclasa
public class SUV extends Auto{
    //declarat variabile
    private String tractiune = "integrala";
    private int cp;

    // polimorfism static / overload
    public SUV(String tractiune){
        this.tractiune = tractiune;
    }



    //getters
    public String gettractiune() {return this.tractiune;}
    public int getcp() {return this.cp;}

    //Setters
    public void setMarca(String tractiune) {this.tractiune = tractiune;}
    public void setMarca(int cp) {this.cp = cp;}

    //Override
    public void masina(){
        System.out.println("Tractiunea este " + tractiune);

    }
}
