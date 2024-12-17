import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int choix;
        //Apprenant youssef= new Apprenant();
        //youssef.getNom()="ahmed";

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\n ----Menu Principale---- \n"
                + "\n (1).AJOUTER "
                + "\n (2).ASSOCIER"
                + "\n (3).MODIFIER"
                + "\n (4).SUPPRIMER"
                + "\n (5).AFFICHER"
                + "\n (6).QUITTER");
        System.out.println("Vous pouvez choisir parmis les operations precedentes : \n");
        Scanner scanner = new Scanner(System.in);
        choix = scanner.nextInt();
        switch (choix){
            case 1 :
                System.out.println("");

        }


    }

}
