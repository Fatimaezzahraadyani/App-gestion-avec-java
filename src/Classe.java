import java.util.*;
public class Classe {
    static ArrayList<Classe> classe = new ArrayList<>();
    private String nom;
    private Formateur formateur;
    ArrayList<Apprenant> Apprenants = new ArrayList<>();

    public Classe(String nom) {
        this.nom = nom;


    }

    public Classe() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public ArrayList<Apprenant> getApprenants() {
        return Apprenants;
    }

    public void setApprenants(ArrayList<Apprenant> apprenants) {
        Apprenants = apprenants;
    }
    static Scanner sc = new Scanner(System.in);
    public static void AjouterClasse(){
        System.out.println("entrer un nom : ");
        String nom = sc.nextLine();
        //Formateur Fr = new Formateur();
        Classe a = new Classe (nom);
        classe.add(a);
    }
}

