# Tehnic interview

1. Ce este o clasa abstracata?
Este o clasa restrictionata care nu poate fi utilizata pentru a crea obiecte. Pentru a fi accesata trebuie mostenita de la o alta clasa.

2. Cum declari o clasa abstracta?
Declararea unei clase abstracte se face folosint keyword-ul abstract.

3. Ce este o metoda abstracta?
Poate fi folosita doar intr-o clasa abstracta si nu are un corp.

4. Ce este o interfata?
    Este o colectie de metode fara implementare si fara declaratii de constante
   O interfata defineste un set un set de metode fara a specifica vreo metoda de implementare.
5. Ce se regaseste intr-o interfata?
Constante si metode fara parametri

6. Ce se intampla daca mostenesti o clasa abstracta?
Trebuie sa implementam metodele abstracte din ea

7. Ce se intampla daca implementezi o interfata?
Suntem oblicati sa implementam metodele din interfata
8. Diferentele dintre o clasa abstracata si o interfata?
Intr-o interfata variabilele declarate sunt in mod implicit finale.
   Metodele interfetei sunt implicit abstracte si nu pot avea implementari
   O clasa abstracta poate contine variabile non-finale
   O clasa abstracta poate avea metode abstracte si non-abstracte