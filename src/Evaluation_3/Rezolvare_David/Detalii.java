package Evaluation_3.Rezolvare_David;

public class Detalii implements InterfaceProiect{
    @Override
    public String creareEchipa(Angajati nume, ProjectManager people) {
        String nume_Angajat="-";
        int numar_People = 0;

        if(nume.getNume()!=null) {
            nume_Angajat = nume.getNume();
        }

        if(people.getPeople()!=0){
            numar_People=people.getPeople();
        }

        return "numele complet al angajatului este: " +nume_Angajat +
                " Numarul de oameni pe care ii conduce: " +numar_People;

    }

    @Override
    public String alocareProiect(String creareEchipa,Proiect proiect) {
        String nume_proiect = "-";
        String data_proiect= "-";

        if(proiect.getProiect()!=null){
            nume_proiect= proiect.getProiect();
        }
        if(proiect.getDataProiect()!=null){
            data_proiect= proiect.getDataProiect();
        }

        return ""+ creareEchipa + " "+nume_proiect+"  "+data_proiect;
    }

    @Override
    public String detaliiAngajati(Angajati angajat) {
        if (angajat instanceof Developer) {
            return "Detalii developer: "+
                    " Nivelul angajatului:"+angajat.getNivel()+
                    " Technologi: "+ ((Developer) angajat).getTechnology() +
                    " Star:" + angajat.getStar() +
                    " Numele angajatului"+ angajat.getNume() ;
        } else if (angajat instanceof Tester) {
            return "Tester"+ ": Nivel" + angajat.getNivel() +
                    " Type : "+((Tester) angajat).getType() + " -----Tester-----" +
                    " Star: " +angajat.getStar() +
                    " Numele "+ angajat.getNume();
        }
        else if(angajat instanceof Designer){
            return "Nivel: " + angajat.getNivel() +
                  " Designer with " + ((Designer) angajat).getProgramUsed() +
                  " Star:" + angajat.getStar() +
                   " Nume:" + angajat.getNume();
        }
       else if(angajat instanceof ProjectManager){
            return "Project Manager: " + angajat.getNume() +
                    "   Coordonate People: " + ((ProjectManager) angajat).getPeople();
        }
       return null;
    }

}
