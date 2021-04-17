package Evaluation_3.Rezolvare_Robert.Logic;

import Evaluation_3.Rezolvare_Robert.Classes.Angajati;
import Evaluation_3.Rezolvare_Robert.Classes.Proiect;
import Evaluation_3.Rezolvare_Robert.Classes.ProjectManager;

public interface TeamInterface {

    String creareEchipa(ProjectManager projectManager, Angajati[] angajati);
    String alocareProiect(String echipa, Proiect proiect);

}
