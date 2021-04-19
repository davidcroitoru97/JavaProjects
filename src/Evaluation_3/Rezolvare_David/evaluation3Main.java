package Evaluation_3.Rezolvare_David;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class evaluation3Main {
    public static void exportProjectData(String[] detproiect) throws FileNotFoundException{
        PrintWriter out =new PrintWriter("projectData.txt");
            for(int index = 0; index < detproiect.length; index++)
            {
                out.println(detproiect[index]);
                System.out.println(+index);
            }
            out.close();
        
    }

    public static void exportAngajatiData(String[] detangajat) throws FileNotFoundException{
        PrintWriter out =new PrintWriter("angajatiData.txt");
        for(int index = 0; index < detangajat.length; index++)
        {
            out.println(detangajat[index]);
            System.out.println(+index);
        }
        out.close();

    }


        public static void main(String[] args){
        
        //Angajati
       // Angajati angajat1 = new Angajati("Vieriu Razvan","Junior",4);
       // Angajati angajat2 = new Angajati("Croitoru David","Senior", 4.5);
        
        //Developer
        Developer developer1 = new Developer("Duminica Rares","Senior",0,"Java");
        Developer developer2 = new Developer("Vieriu Razvan","Junior",0,"C");
        
        //Designer
        Designer designer1 = new Designer("Croitoru David","Senior",0,"Eclipse");
        Designer designer2 = new Designer("Gicu Gigel","Senior",0,"Photoshop");
        
        //Tester
        Tester tester1 = new Tester("Vieriu Augustin","Junior",0,"automation");
        Tester tester2 = new Tester("Musteata DAvid","senior",0,"QA");


        //ProjectManager
        ProjectManager projectManager1= new ProjectManager("Costel Gicu","Boss",0,0);
        ProjectManager projectManager2 = new ProjectManager("Tim Cristi","Boss",0,0);
        
        //Proiect
        Proiect proiect1 = new Proiect("Vasile Ioan","Boss",0,"ShopOnline","23/04/2021");
        Proiect proiect2 = new Proiect("Fane Spoitoru","Senior",0,"Sondaj","23/05/2021");



       // Detalii detalii1=new Detalii("alex",3);
        Detalii detalii = new Detalii();
        String creareEchipa1= detalii.creareEchipa(tester1,projectManager1);
        String creareEchipa2= detalii.creareEchipa(developer1,projectManager2);
        String[] detproiect ={
        detalii.alocareProiect(creareEchipa1, proiect1),
                detalii.alocareProiect(creareEchipa2,proiect2)
      };
        String[] detangajat ={
                detalii.detaliiAngajati(tester1),
                detalii.detaliiAngajati(tester2),
                detalii.detaliiAngajati(developer1),
                detalii.detaliiAngajati(developer2),
                detalii.detaliiAngajati(designer1),
                detalii.detaliiAngajati(designer2),
                detalii.detaliiAngajati(projectManager1),
                detalii.detaliiAngajati(projectManager2),
                detalii.detaliiAngajati(proiect1),
                detalii.detaliiAngajati(proiect2)
        };

        try{

            exportAngajatiData(detangajat);
           exportProjectData(detproiect);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
}
