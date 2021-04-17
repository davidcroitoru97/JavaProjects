package Evaluation_3.Rezolvare_Robert.Logic;

import Evaluation_3.Rezolvare_Robert.Classes.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExportInfo {


    public static void exportProjectData(String[] proiecte) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("src/Evaluation_3/Rezolvare_Robert/exportedData/projectData.txt");

        for (int index = 0; index < proiecte.length; index++) {
            out.println(proiecte[index]);
            System.out.println("Proiectul cu numarul " + index + " a fost scris...");
        }
        out.close();
    }

    public static void exportAngajatiData(Angajati[] angajati) throws FileNotFoundException{
        PrintWriter out = new PrintWriter("src/Evaluation_3/Rezolvare_Robert/exportedData/angajati.txt");

        for (int index = 0; index < angajati.length; index++) {

            String nume = angajati[index].getNume();
            String prenume = angajati[index].getPrenume();
            String nivel = angajati[index].getNivel();
            int star = angajati[index].getStar();

            if(angajati[index] instanceof Developer){
                String technology = ((Developer) angajati[index]).getTechnology();
                out.println(nivel + " " + technology + " Developer | Star: " + star + " | " + nume + " " + prenume);

            }else if (angajati[index] instanceof Designer){
                String programUsed = ((Designer) angajati[index]).getProgramUsed();
                out.println(nivel + " Designer with " + programUsed + " | Star: " + star + " | " + nume + " " + prenume);

            }else if(angajati[index] instanceof Tester){
                String type = ((Tester) angajati[index]).getType();
                out.println(nivel + " " + type + " Tester | Star: " + star + " | " + nume + " " + prenume);

            }else if(angajati[index] instanceof ProjectManager){
                int people = ((ProjectManager) angajati[index]).getPeople();
                out.println("Project Manager " + nume + " " + prenume + " | Coordonated People: " + people);
            }

            System.out.println("Angajatul cu numarul " + index + " a fost scris...");
        }
        out.close();

    }
}
