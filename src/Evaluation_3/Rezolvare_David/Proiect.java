package Evaluation_3.Rezolvare_David;

public class Proiect extends Angajati{

    private String proiect;
    private String dataProiect;

    public Proiect(String nume, String nivel, double star,String proiect,String dataProiect){
        super(nume, nivel, star);
        this.proiect=proiect;
        this.dataProiect=dataProiect;
    }

    public String getProiect() {
        return proiect;
    }

    public void setProiect(String proiect) {
        this.proiect = proiect;
    }

    public String getDataProiect() {
        return dataProiect;
    }

    public void setDataProiect(String dataProiect) {
        this.dataProiect = dataProiect;
    }
}
