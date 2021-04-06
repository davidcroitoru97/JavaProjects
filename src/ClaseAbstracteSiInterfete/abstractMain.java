package ClaseAbstracteSiInterfete;

import ClaseAbstracteSiInterfete.Classes.Cat;

public class abstractMain {

    public static void main(String []args){
        Cat cat = new Cat();
        cat.sunete();
        // TODO: Incearca sa pui tot timpul metodele cu prima litera mica, este un principiu pentru clean code (ex: sunet(), nu Sunet()) ||
        //   ex: getSunet() -> good, GetSunet() -> bad
        cat.Sunet();

        //TODO-4: Creiaza o interfata cu cateva metode pe care sa le apelezi intr-o clasa implementand interfata si furnizandui o implementare.
        //TODO-5: Creiaza o clasa abstracta si aplica principiile OOP pentru ea, in acelasi timp citeste care sunt functionalitatile pe care le detine o clasa abstracta fata de una normala si joaca te cu ele in cod.

    }
}
