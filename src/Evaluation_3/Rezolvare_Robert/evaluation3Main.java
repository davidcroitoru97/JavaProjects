package Evaluation_3.Rezolvare_Robert;

import Evaluation_3.Rezolvare_Robert.Classes.*;
import Evaluation_3.Rezolvare_Robert.Logic.ExportInfo;
import Evaluation_3.Rezolvare_Robert.Logic.TeamInterfaceImplementation;

import java.io.FileNotFoundException;

public class evaluation3Main {

    public static void main(String []args) {
        // creare angajati
        Angajati developer = new Developer("Popescu", "Vasile", "Junior", "Java", 0);
        Angajati designer = new Designer("Mircea", "Gicu", "Medior", "Photoshop", 0);
        Angajati tester = new Tester("Ionescu", "Mihai", "Senior", "QA", 0);
        ProjectManager projectManagerAndrei = new ProjectManager("Voiculescu", "Andrei", "Senior", 0, 0);
        ProjectManager projectManagerMirel = new ProjectManager("Ionel", "Mirel", "Senior", 0, 0);


        // creare proiecte
        Proiect socialSite = new Proiect("Social Site", "January 2022");
        Proiect automationTesting = new Proiect("Automation Testing Tool", "December 2023");
        Proiect birocracy = new Proiect("Multinational Birocracy", "August 2021");

        // project manager setting star for employees
        projectManagerAndrei.setStarForAngajat(designer,4);
        projectManagerMirel.setStarForAngajat(developer,5);
        projectManagerMirel.setStarForAngajat(tester,2);

        // Creare echipe si alocarea lor pe proiecte
        TeamInterfaceImplementation logic = new TeamInterfaceImplementation();

        // creare vector cu angajati
        Angajati [] angajatiPentruAndrei = {designer, developer , tester};
        Angajati [] angajatiPentruMirel = {developer, tester};

        // asignare angajati pentru un proiect manager
        String echipa1 = logic.creareEchipa(projectManagerAndrei, angajatiPentruAndrei);
        String echipa2 = logic.creareEchipa(projectManagerMirel, angajatiPentruMirel);

        // alocare echipe pentru proiecte
        String proiect1 = logic.alocareProiect(echipa1, socialSite);
        String proiect2 = logic.alocareProiect(echipa2, automationTesting);
        String proiect3 = logic.alocareProiect(echipa1, birocracy);

        // export informatii
        Angajati [] angajati = {developer, designer, tester, projectManagerAndrei, projectManagerMirel};
        String [] proiecte = {proiect1, proiect2 , proiect3};
        try {
            ExportInfo.exportAngajatiData(angajati);
            ExportInfo.exportProjectData(proiecte);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
