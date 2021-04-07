# Concepts

* Declararea unei metode sau unei clase abstracte se face folosind keyword-ul abstract.
* O clasa abstracta poate avea specificatorul de acces public, accesul fiind la nivel de pachet, dar nu poate folosi keyword ul final, deoarece aceasta ar furniza o eroare, iar combinatia de final abstract ar fi inutila pentru ca nu poti mosteni o clasa care este finala si scopul unor metode abstracte este fix acesta, de a fi mostenite ca sa le furnizam o implementare.
* O clasa abstracta poate avea acelasi numar de elemente ca si o clasa normala la care se mai poat adauga si metode abstracte.
* Metodele abstracte sunt metodele ce nu au nici o implementare. Practic putem sa le spunem metode abstracte sau metode fara nici o implementare. Ex: public abstract void nume(String string){}
* Practic o clasa abstracta prin intermediul metodelor abstracte poate pune la dispozitie un model pentru o subclasa pe care sa il implementeze ulterior.
* O clasa abstracta poate sa nu contina nici o metoda abstracta.
* O metoda abstracata nu poate sa apara decat intr-o clasa abstracta sau intr-o interfata.
* Daca o subclasa mosteneste o clasa abstracta, ea trebuie sa implementeze metodele abstracte din clasa de baza(abstracta).
* Exemple de clase abstracte care sunt in librariile Java: Number, Reader, Writer, InputStream, OutputStream
* Interfetele  duc conceptul de clasa abstracta mai departe. Interfata poate fi privita si ca un protocol de comunicare intre obiecte.
* O interfata este practic o colectie de metode abstracte si de declaratii de constante.
* O clasa abstracta nu este obligata sa implementeze metodele interfetei, dar o clasa normala este obligata sa implementeze metodele interfetei.
* Variabilele declarate intr-o interfata sunt final(e) adica constante si trebuie sa fie si initializate: ex: int x =5; este defapt final int x = 5;
* Cum in cazul claselor in java nu este permisa mostenirea multipla, in cazul interfetelor se poate face mostenire multipla, adica practic o interfata poate extends (extinde) cate interfete doresti.
* In interfata doar specificatorul de acces public este permis pentru metode si variabile.
* Daca dorim sa implementam o interfata intr-o clasa, aceasta se realizeaza cu keyword-ul implements. EX: public class x implements yInterface{}
* Poate o interfata sa inlocuiasca o clasa abstracta? 
  - Da , sa spunem ca avem o clasa care mosteneste o clasa abstracta, noi am avea nevoie sa mai implementam niste metode abstracte, dar din cauza ca in Java nu exista mostenire multipla, acest lucru nu este posibil, iar aici ajungem sa folosim interfetele. In plus interfetele furnizeaza doar metode care vor furniza un model de metode care trebuiesc implementate, iar in cazul mostenirii unei clase abstracte, acolo se realizeaza si o relatie intre clase.
* O interfata este o colectie de metode abstracte si constante si le putem folosi ca pe un protocol de comunicare intre obiecte.
* Metodele abstracte sunt metodele ce nu au nici o implementare.
* Metodele abstracte sunt definite in clasele abstracte si in interfete.

# Clasa abstracata VS Interfata

* O clasa abstracta poate contine metode abstracte, dar si metode care nu sunt abstracte, iar o interfata contine doar metode abstracte.
* O clasa normala poate mosteni doar o clasa abstracta pentru ca nu exista mostenire multipla in java, dar poate implementa mai multe interfete.
* O clasa abstracta este mostenita folosind keyword-ul extends, iar o interfata keywordul implements.
* O clasa abstracta poate sa aiba membri private si protected, iar in interfata toti membri sunt publici.
* O clasa abstracta poate avea variabile final, non-final, static sau non-static pe cand o interfata poate avea doar constante publice
* O clasa abstracta poate extinde si o alta clasa si mai multe interfete, pe cand o interfata poate extinde doar interfete.

`Aici ai niste teorie, ia si citeste si incearca sa intelegi logic diferentele. Ce este important pentru tine sa stii la nivel de teorie pentru interviu, se regaseste in principiu in intrebarile din fisierul "abstractionConclusion`

