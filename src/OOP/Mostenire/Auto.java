package OOP.Mostenire;

//Clasa mama
public class Auto {

    //Am declarat variabile
    private String Marca;
    private String Model;
    private int An;

    //Constructor fara argumente/blank
    public Auto() {
    }

    Auto(String Marca, String Model, int An) {
        this.Marca = Marca;
        this.Model = Model;
        this.An = An;
    }

    Auto(String Marca) {
        this.Marca = Marca;
    }

    //Getters
    public String getMarca() {
        return this.Marca;
    }

    public String getModel() {
        return this.Model;
    }

    public int getAn() {
        return this.An;
    }

    //Setters
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setAn(int An) {
        this.An = An;
    }


    //override
    public void masina() {
        System.out.println("Marca masinii este Audi");
    }

    //toString
    public String toString() {
        return "Marca este: " + this.Marca + " Modelul este: " + this.getModel() + " Anul este: " + this.An;
    }


}
