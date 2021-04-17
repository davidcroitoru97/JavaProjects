package Evaluation_3.Rezolvare_Robert.Logic;

import Evaluation_3.Rezolvare_Robert.Classes.Angajati;
import Evaluation_3.Rezolvare_Robert.Classes.Proiect;
import Evaluation_3.Rezolvare_Robert.Classes.ProjectManager;

public class TeamInterfaceImplementation implements TeamInterface{


    @Override
    public String creareEchipa(ProjectManager projectManager, Angajati[] angajati) {

        int numarAngajati = angajati.length;
        projectManager.setPeople(numarAngajati);

        return "Echipa condusa de Project Manager-ul " + projectManager.getNume() + " " + projectManager.getPrenume() + " are sub indrumare un numar de " + projectManager.getPeople() + " angajati";
    }

    @Override
    public String alocareProiect(String echipa, Proiect proiect) {
        String numeProiect = "No Name";
        String deadline = "No deadline";

        if(proiect.getNumeProiect() != null){
            numeProiect = proiect.getNumeProiect();
        }
        if(proiect.getDeadline() != null){
            deadline = proiect.getDeadline();
        }

        String temp = " pe proiectul '" + numeProiect + "' care are deadline-ul pe data de '" + deadline + "'";

        return echipa + temp;
    }
}
