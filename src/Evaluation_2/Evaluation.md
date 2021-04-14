# Task
* O firma de vanzare accesorii auto are nevoie de un program care sa exporte informatiile despre accesoriile vandute intr-un fisier text dupa ce produsul a fost cumparat de catre un cumparator.
* Informatiile care trebuie sa fie continute despre fiecare comanda sunt:

`[numeProdus][cantitateCumparata][pretProdus][pretTotal][numeVanzator][departamentVanzator][numeCumparator][localitateCumparator]`

_ex:
 BEC 23 32 736 David Marketing Robert Bucuresti_
****
**Produsele vor avea ca parametrii :**
* numeProdus
* pretProdus

**Vanzatorii vor avea ca parametrii :**
* numeVanzator
* departamentVanzator

**Cumparatorul va avea ca parametrii:**
* numeCumparator
* localitateCumparator
* cantitateCumparata

****
Se va crea o interfata cu urmatoarele metode care vor fi implementate intr-o clasa ce va implementa interfata, logica/corpul metodei trebuie sa fie in metoda ce va fi suprascrisa in clasa:
* **calculPretComanda** = metoda care calculeaza pretul total a unei comenzi (cantitateVanduta * pretBucata)
* **generateInfoComanda** = metoda care returneaza un string care sa contina toate informatiile despre o comanda 
****
Se va creea o metoda numita **exportInfoComanda** care va lua ca un parametru un vector de stringuri si il va scrie intr-un fisier de tipul text.
****
* In clasa main se vor creea obiecte de tipul Produse / Vanzatorii / Cumparatori.
* Prin apelarea metodei **generateInfoComanda** care va lua ca parametrii un produs, un vanzator si un cumparator, se va genera un string cu informatia despre comanda
* Cu ajutorul metodei **exportInfoComanda** se va scrie String-ul sau Stringurile generate de metoda **generateInfoComanda** intr-un fisier text.
****
`Prin aceasta problema o sa treci prin toate conceptele pana in momentul de fata si in plus o sa te puna sa iti bati capul putin. Pentru informatii cum sa scrii intr-un fisier un String, o sa gasesti nelimitate chestii pe google. Dupa cum ti-am zis este necesar sa poti sa gandesti si sa cauti si sa gasesti solutii pentru ce ai de rezolvat.`

Task-ul nu este unul greu, dar poate o sa fie putin dificil in prima faza deoarece necesita ceva mai mult interes si o sa te puna in ipostaza in care trebuie sa gandesti putin solutiile, si acesta este si unul dintre scopuri pe langa cel de a te familiariza mai bine cu conceptele.