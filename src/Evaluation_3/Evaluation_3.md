# Task 3
`O multinationala doreste sa isi faca un program pentru organizarea angajatilor in functie de pozitie si proiect.`

* Multinationala are urmatorii angajati: 
    * Developer
    * Designer
    * Tester
    * Project Manager
    
* Multinationala are urmatoarele proiecte
    * Social Site
    * Automation Testing Tool
    * Multinational Birocracy
    
****
* Anagajtii au urmatoarele proprietati comune:
    * nume si prenume
    * nivel (ex: Junior)
    
* Developerul are urmatoarele proprietati proprii:
    * technology (ex: Java)
    * star
    
* Designer-ul are urmatoarele proprietati proprii:
    * programUsed (ex: Photoshop)
    * star
    
* Tester-ul are urmatoarele proprietati proprii:
    * type (ex: automation / QA )
    * star
    
* ProjectManager are urmatoarele proprietati proprii:
    * people (cati angajati are sub indrumare)
    
* Proprietati proiect:
    * nume proiect
    * data terminarii proiectului (deadline)
****
* Sa se creeze o interfata cu urmatoarele functii:
    * **creareEchipa** = la apelarea acestei functii, parametrul (people) al unui Project Manager, trebuie iterat, adica crescut cu o unitate pentru fiecare angajat care ii se aloca
    si sa se genereze un String de forma:
      `Echipa Condusa de Project Manager-ul [nume] are sub indrumare un numar de [people] angajati.`
    `HINT:` creare un vector de angajati in care se pot pune obiectele de tip angajati (ex: developer, designer etc.), urmat de sumarea numarului de angajati si modificarea atributului people pentru project manager.Atribuirea unei valori pentru parametrul people trebuie realizata doar prin apelarea acestei metode si nu prin initializarea cu o valoare in cadrul unui constructor.
    * **alocareProiect** = aici trebuie sa se atribuie pentru o echipa un anume proiect si sa se genereze urmatorul string 
    
    _Stringul generat de metoda creeareEchipa_ + ` pe proiectul [numeProiect] care are deadline-ul pe data de [deadline].`
  
* Clasa Project Manager trebuie sa detina urmatoarea functie:
    * Se preia ca parametru un angajat si se seteaza o nota de performanta pentru aceasta de la 0-5. Parametrul fiind "star". Atribuirea unei valori pentru variabila star se realizeaza doar prin ajutorul acestei metode si nu prin cadrul constructorului(se lasa default 0).
    
* Intr-o clasa sa se creeze o urmatoarele 2 functii:
    * exportProjectData: ce v-a exporta intr-un fisier text (projectData.txt) Stringurile generate de metoda "alocareProiect"
    * exportAngajatiData: ce v-a exporta datele tuturor angajatiilor intr-un fisier (angajati.txt)
        * in cazul in care angajatul este developer String-ul trebuie sa fie format in felul urmator:
            `[nivel] [technology] Developer| Star: [star] | [nume] [prenume] |`
          
        * in cazul in care angajatul este Designer:
            `[nivel] Designer with [programUsed] | Star: [star] | [nume] [prenume] `
          
        * in cazul in care angajatul este Tester:
            `[nivel] [type] Tester | Star: [star] | [nume] [prenume]`
          
        * in cazul in care angajatul este Project Manager:
            `Project Manager [nume] [prenume] | Coordonated People: [people]`
          
`HINT: poti realiza cu if sau switch`

* In main trebuie sa populezi cele 2 fisiere txt cu informatiile aferente. Spor!