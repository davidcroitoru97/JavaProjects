package Exceptii.Classes.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Aici este o exceptie ce trebuie tratata din timp, si nu este o exceptie de tipul Runtime, adica exceptia de tip
 * Runtime iti da eroare in momentul in care dai run, asta iti zice sa o tratezi din prima
 */
public class IOExceptionEX {

    // TODO: dai click pe ea ca sa rezolvi problema, o sa iti sugereze sa o arunci sau sa o tratezi
    //  aici nu poti face ca in cazul exceptiilor de Runtime unde acolo poti sa le eviti printr-un cod, aici trebuie tratate numaidecat
    public void verificaFile() throws FileNotFoundException {

        FileInputStream in = new FileInputStream("fisier.txt");

    }
}
