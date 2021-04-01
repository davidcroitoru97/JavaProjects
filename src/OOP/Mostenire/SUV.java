package OOP.Mostenire;

//Subclasa
public class SUV extends Auto {
    //declarat variabile
    private String Marca;
    private String Model;
    private int An;
    private String tractiune = "integrala";
    private int cp;

    // polimorfism static / overload
    public SUV(String tractiune) {
        this.tractiune = tractiune;
    }


    //Aici am facut un constructor cu argumentele mostenite de la clasa Auto si am incul si argumentele prorii
    public SUV(String Marca, String Model, int An, String tractiune, int cp) {
        super(Marca, Model, An);
        this.tractiune = tractiune;
        this.cp = cp;

    }


    //getters
    public String gettractiune() {
        return this.tractiune;
    }

    public int getcp() {
        return this.cp;
    }

    //Setters
    public void setMarca(String tractiune) {
        this.tractiune = tractiune;
    }

    public void setMarca(int cp) {
        this.cp = cp;
    }

    //Override
    public void masina() {
        System.out.println("Tractiunea este " + tractiune);

    }

    public String toString() {
        return "Marca: " + getMarca() + " Model: " + getModel() + " tractiune :" + gettractiune() + " cp: " + getcp();
    }
}
