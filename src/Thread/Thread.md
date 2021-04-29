1.Ce este un fir?
Un fir de executie este o succesiune secventiala de instructiuni care se executa in cadrul unui proces.
2.Care sunt deosebirile dintr-un fir de executie si un proces?
Firul este mai rapid.
Proces inseamna un program in executie pe cand firul este segmentul unui proces.
Un proces consta in mai multe fire iar un fir este o parte dintr-un proces
Un proces are propriul spatiu de adrese iar firul foloseste spatiul de adrese al procesului
3.Cum se poate crea un fir de executie?
Se poate face prin doua metode:
a. Extend thread: extindem clasa thread si supradefinim metoda run a clasei Thread.
b. Implement runnable: Clasa thread implementeaza interfata Runnable, iar la extindere implementam indirect interfata.Prin implementarea interfetei trebuie sa implementam metoda run.
4.Care este un ciclu de viata a unui fir de executie?
Starile in care se poate gasi un fir de executie sunt:
a. New Thread- un fir de executie se gaseste in aceasta stare dupa instantierea unui obiect in clasa Thread. Firul este vid si se lanseaza in executie cu metoda start
b. Runnable- Firele fie sunt in executie fie sunt gata de rulare dar asteapta alocarea resurselor din sistem.
c. Not Runnable- Un fir ajunge in starea asta daca a fost apelata met sleep sau daca a fost apelata met wait iar in acest caz asteapta ca o anumita conditie sa fie satisfacuta.
d. Dead- starea in care ajunge un fir de executie la terminarea sa.
5. Ce fac urmatoarele functii?
a. isAlive() - folosim pentru a testa daca un fir de executie a fost pornit dar nu s-a terminat. Daca firul e in una din starile Runnable sau not runnable returneaza true altfel returneaza false.
   b.wait() - poate produce exceptii de tipul IntreruptedException, atunci cand firul care asteapta este intrerupt din asteptare si a trecut fortat in starea Runnable desi conditia asteptata nu era indeplinita
                Punerea corecta a unui fir de executie in asteptare
   c.sleep() - provoaca i pauza in timpul rularii firului curent lfat in executie pt un timp specificat
   notify() - notificam un singur fir care este in astetarea unui obiect iar acesta incepe executarea
   notifyAll() - notificam toate firele care sunt in asteptarea unor obiecte iar acestea incep executarea