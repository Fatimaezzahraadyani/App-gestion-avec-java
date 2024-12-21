import java.util.*;
public class Classe {
    static ArrayList<Classe> classe = new ArrayList<>();
    private String nom;
    private Formateur formateur;
    ArrayList<Apprenant> Apprenants = new ArrayList<>();


    public Classe(String nom) {
        this.nom = nom;
    }
    //public Classe(Formateur formateur){
    //     this.formateur=formateur;
    // }

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

    public void AjouterClasse() {
        System.out.println("entrer un nom : ");
        String nom = sc.nextLine();
        Classe a = new Classe(nom);
        classe.add(a);
    }

    public void AfficherClasse(Classe a) {
        System.out.println(a.toString());
    }

    public void ModifierClasse() {
        Formateur Fr = new Formateur();
        System.out.println("entrer le nom de la classe que vous voullez modifier : ");
        String nom = sc.nextLine();
        ArrayList<Classe> C = Classe.classe;
        for (Classe s : C) {
            if (s.getNom().equals(sc.nextLine())) {
                System.out.println("entrer le nouveau nom : ");
                String name = sc.nextLine();
                s.setNom(name);
                System.out.println("Vous avez modifier le nom!");
            } else {
                System.out.println("cree une classe premiérement");
            }
            Fr.AssocierFormateur();
        }
    }

    public void SupprimeClasse() {
        System.out.println("entre le nom du classe que vous voullez supprimer :");
        String N = sc.nextLine();
        boolean trouve = false;

        for (int i=0;i<classe.size();i++){
            Classe c = classe.get(i);
            if (c.getNom().equals(N)) {
                classe.remove(i);
                System.out.println("Classe bien supprimer !");
                trouve = true;
                break;
            }
        }
        if (!trouve){
            System.out.println("classe non trouvée !");

        }
    }


    @Override
    public String toString() {
        return "Classe : \n" +
                "nom='" + nom + '\'' +
                ", formateur=" + formateur +
                ", Apprenants=" + Apprenants +
                '}';
    }

}

