import java.sql.SQLOutput;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //static ArrayList<Apprenant> appr = new ArrayList<>();
    //static ArrayList<Formateur> formateur = new ArrayList<>();
    //static ArrayList<Classe> classe = new ArrayList<>();

    public static void main(String[] args) {
        int choix = 0;

        //instanciation des objet

        // Apprenant youssef= new Apprenant();
        //youssef.getNom()="ahmed";

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        while (choix != 4) {
            System.out.println("\n ----Menu Principale---- \n"
                    + "\n (1).Gestion des Apprenants "
                    + "\n (2).Gestion des Formateurs"
                    + "\n (3).Gestion des Classes"
                    + "\n (4).QUITTER");
            System.out.println("choisir que vous voulez gérer : \n");
            Scanner scanner = new Scanner(System.in);
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    gestionApprenants();//Methode  menu de gestion des apprenants
                    break;
                case 2:
                    gestionFormateurs();//Methode menu de gestion des formateurs
                    break;
                case 3:
                    gestiondesClasses();//methode menu de gestion des classes
                    break;
                case 4:
                    System.out.println("vous avez quitter le menu ");
                    break;
                default:
                    System.out.println("enter un choix depuis la liste");
                    break;
            }
        }

    }

    public static void gestionApprenants() {
        Apprenant Ap = new Apprenant();
        int s = 0;
        while (s != 6) {
            System.out.println("Gestion des Apprenants \n"
                    + "\n 1.Ajouter un apprenant "
                    + "\n 2.Modifier un apprenant "
                    + "\n 3.Associer un apprenant "
                    + "\n 4.Supprimer un apprenant "
                    + "\n 5.Afficher un apprenant"
                    + "\n 6.Retour au menu principale");
            System.out.println("\t choisir un nombre");
            Scanner scanner = new Scanner(System.in);
            s = scanner.nextInt();
            switch (s) {
                case 1:
                    Ap.AjouterApprenant();//ajouter apprenant
                    break;
                case 2:
                    Ap.ModifierApprenant();//modifier apprenant
                    break;
                case 3:
                    Ap.AssocierApprenant();//associer un apprenant
                    break;
                case 4:
                    Ap.SuppApprenant();  //supprimer un apprenant
                case 5:
                    for (Apprenant A : Apprenant.appr) {
                        Ap.AfficherApprenant(A);
                    }          //afficher un apprenant
                    break;
                case 6:
                    System.out.println("vous avez quitter ! ");
                    //retour
                    break;
                default:
                    System.out.println("Merci d'entrer un choix valide");
                    break;
            }
        }
    }
    public static void gestionFormateurs() {
        Formateur Fr = new Formateur();
        int s = 0;
        while (s != 6) {
            System.out.println("Gestion des Formateurs \n"
                    + "\n 1.Ajouter un formateur "
                    + "\n 2.Modifier un formateur "
                    + "\n 3.Associer un formateur "
                    + "\n 4.Supprimer un formateur "
                    + "\n 5.Afficher un formateur "
                    + "\n 6.Retour au le menu principale");
            System.out.println("\t choisir un nombre");
            Scanner scanner = new Scanner(System.in);
            s = scanner.nextInt();
            switch (s) {
                case 1:
                    Fr.AjouterFormateur();  //ajouter formateur
                    break;
                case 2:
                    Fr.ModifierFormateur();  //modifier formateur
                    break;
                case 3:
                    Fr.AssocierFormateur();  //associer un formateur
                    break;
                case 4:
                    Fr.SupprimerFormateur(); //supprimer un formateur
                case 5:
                    for (Formateur A : Formateur.formateur) {
                        Fr.AfficherFormateur(A);
                    }//afficher un formateur
                    break;
                case 6:
                    //retour
                    break;
                default:
                    System.out.println("Merci d'entrer un choix valide");
                    break;
            }
        }

    }

    public static void gestiondesClasses() {
        Classe cls = new Classe();
        int c = 0;
        while (c != 5) {
            System.out.println("Gestion des Classes \n"
                    + "\n 1.Créer une classe "
                    + "\n 2.Modifier une classe "
                    + "\n 3.Supprimer une classe "
                    + "\n 4.Afficher une classe"
                    + "\n 5.Retour au le menu principale");
            System.out.println("\t choisir un nombre");
            Scanner scanner = new Scanner(System.in);
            c = scanner.nextInt();
            switch (c) {
                case 1:
                    cls.AjouterClasse(); //cree une classe
                    break;
                case 2:
                    cls.ModifierClasse(); //modifier classe
                    break;
                case 3:
                    cls.SupprimeClasse();//associer apprenner à la classe
                    break;
                case 4 :
                    for (Classe a : Classe.classe) {
                        cls.AfficherClasse(a);
                    }
                    break;
                default:
                    System.out.println("Merci d'entrer un choix valide");
                    break;
            }
        }


    }
}