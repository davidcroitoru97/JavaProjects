# Exceptions
* In pachetul Info ai poza "Ierarhie.jpg" ca sa vezi care este Ierarhia exceptiilor.

**Types of exceptions (typesException.png)**
* Checked exception
* Unchecked exception (Runtime Exception)

`Mai multe informatii in Cartea pe care ti-am dat-o la pagina 77.`

* O exceptie poate fi tratata sau evitata. 
* Prinderea si tratarea exceptiilor se realizeaza cu ajutorul instructiunilor Try, catch , finally . In blocul try este scris codul care poate contine o exceptie, in catch se trateaza exceptiile, iar blocul finally este optional, el se va executa oricum.
* Aruncarea exceptiilor se realizeaza cu ajutorul clauzei throws.
* Avantajele tratarii exceptiilor sunt ca separam codul care poate sa furnizeze o exceptie, grupam erorile dupa tipul lor si exceptia se duce pana la analizatorul de exceptie corespunzator.


# Types definition
* **Error** = Obiectele de tip error sunt cazuri speciale de exceptii generate de functionarea anormala a echipamentului hard pe care ruleaza un program java si sunt invizibile pentru programator.
* **Checked Exception** = Exceptiile de tipul exception sunt exceptii standard (soft), care trebuie tratate de catre programele Java. Exceptiile care pot “scapa” netratate descind din subclasa RuntimeException, si se numesc exceptii de executii. 
* **Exceptiile de executie (RuntimeException), Unchecked Exception** 
  * Aceste exceptii au o superclasa comuna RuntimeException si in aceasta categorie sunt incluse exceptiile provocate de:
    * ArithmeticException = operatii aritmetice ilegale (impartirea intregilor la zero)
    * NullPointerException = accesarea membrilor unui obiect ce are valoarea null
    * ArrayIndexOutOfBoundsException = accesarea eronata a elementelor unui vector.
    
* **Cate tipuri de exceptii sunt in Java?**
  * Checked adica de tip Exceptions, Unchecked adica exceptiile de executie (RuntimeExceptions), si erorile.
