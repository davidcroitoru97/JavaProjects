package Evaluation_3.Rezolvare_Robert.Logic;

import Evaluation_3.Rezolvare_Robert.Classes.Angajati;
import Evaluation_3.Rezolvare_Robert.Classes.Proiect;
import Evaluation_3.Rezolvare_Robert.Classes.ProjectManager;

/**
 * Clasa care implementeaza metodele abstracte
 */
public class TeamInterfaceImplementation implements TeamInterface{

    // metoda creare echipa
    @Override
    public String creareEchipa(ProjectManager projectManager, Angajati[] angajati) {

        // angajati.length returneaza cati angajati sunt in vector si dupa seteaza numarul pentru ProjectManager
        int numarAngajati = angajati.length;
        projectManager.setPeople(numarAngajati);

        return "Echipa condusa de Project Manager-ul " + projectManager.getNume() + " " + projectManager.getPrenume() + " are sub indrumare un numar de " + projectManager.getPeople() + " angajati";
    }

    // metoda alocare echipa
    @Override
    public String alocareProiect(String echipa, Proiect proiect) {
        return echipa + " pe proiectul '" + proiect.getNumeProiect() + "' care are deadline-ul pe data de '" + proiect.getDeadline() + "'";
    }
}
