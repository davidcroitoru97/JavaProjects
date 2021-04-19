package Evaluation_3.Rezolvare_Robert.Logic;

import Evaluation_3.Rezolvare_Robert.Classes.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Clasa cu metode statice pentru a nu fi necesar crearea unei instante pentru apelarea metodelor pentru nu a consuma mai multa memorie
 */
public class ExportInfo {

    // constante cu path-ul unde sa se salveze fisierele + fisierele
    private static final String FOLDER_PATH = "src/Evaluation_3/Rezolvare_Robert/exportedData/";
    private static final String PROJECT_EXPORT_FILE = "projectData.txt";
    private static final String ANGAJATI_EXPORT_FILE = "angajati.txt";

    // metoda export proiecte
    public static void exportProjectData(String[] proiecte){
        try(PrintWriter out = new PrintWriter(FOLDER_PATH + PROJECT_EXPORT_FILE)) {

            for (int index = 0; index < proiecte.length; index++) {
                out.println(proiecte[index]);
                System.out.println("Proiectul cu numarul " + index + " a fost scris...");
            }

        }catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit...");
        }
    }

    // metoda export angajati
    public static void exportAngajatiData(Angajati[] angajati){
        try(PrintWriter out = new PrintWriter(FOLDER_PATH + ANGAJATI_EXPORT_FILE)) {
            // ia fiecare angajat si verifical
            for (int index = 0; index < angajati.length; index++) {

                // pentru fiecare angajat de pe un index, preia atributele comune
                String nume = angajati[index].getNume();
                String prenume = angajati[index].getPrenume();
                String nivel = angajati[index].getNivel();
                int star = angajati[index].getStar();

                // daca angajatul este o instanta a unui Developer, atunci preia "technology" si scrie string-ul in fisier.
                if (angajati[index] instanceof Developer) {
                    String technology = ((Developer) angajati[index]).getTechnology();
                    out.println(nivel + " " + technology + " Developer | Star: " + star + " | " + nume + " " + prenume);

                } else if (angajati[index] instanceof Designer) {
                    String programUsed = ((Designer) angajati[index]).getProgramUsed();
                    out.println(nivel + " Designer with " + programUsed + " | Star: " + star + " | " + nume + " " + prenume);

                } else if (angajati[index] instanceof Tester) {
                    String type = ((Tester) angajati[index]).getType();
                    out.println(nivel + " " + type + " Tester | Star: " + star + " | " + nume + " " + prenume);

                } else if (angajati[index] instanceof ProjectManager) {
                    int people = ((ProjectManager) angajati[index]).getPeople();
                    out.println("Project Manager " + nume + " " + prenume + " | Coordonated People: " + people);
                }

                System.out.println("Angajatul " + nume + " " + prenume + " a fost exportat...");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit...");
        }
    }
}
