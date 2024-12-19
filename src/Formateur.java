import java.util.ArrayList;
import java.util.Scanner;

public class Formateur extends Personne{
    static ArrayList<Formateur> formateur = new ArrayList<>();
    private String specialite;
    private double salaire;
    private Classe classe;



    public Formateur(int Id, String nom, String prenom, String email,String specialite,double salaire, Classe classe) {
        super(Id, nom, prenom, email);
        this.specialite = specialite;
        this.salaire = salaire;
        this.classe = classe ;

    }
    public Formateur(){

    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    static Scanner sc = new Scanner(System.in);
    public Formateur AjouterFormateur(){

        System.out.println("entrer un nom : ");
        String nom=sc.nextLine();

        System.out.println("entrer un prenom : ");
        String prenom=sc.nextLine();

        System.out.println("entrer un Id : ");
        int Id=sc.nextInt();
        sc.nextLine();

        System.out.println("enter un email : ");
        String email=sc.nextLine();

        System.out.println("entrer la spécialiter : ");
        String specialite=sc.nextLine();

        System.out.println("entrer le salaire : ");
        double salaire=sc.nextDouble();


        Formateur a=new Formateur(Id,nom,prenom,email,specialite,salaire,null);
        formateur.add(a);
        return a;
    }
    public void AfficherFormateur(Formateur a){
        System.out.println(a.toString());
    }
    public void ModifierFormateur(){
        System.out.println("Veuillez saisir ID de formateur : ");
        int id= sc.nextInt();
        sc.nextLine();

        System.out.println("entrer le nouveau nom : ");
        String name=sc.nextLine();

        System.out.println("entrer le nouveau prenom : ");
        String prenom=sc.nextLine();

        System.out.println("entrer le nouveau Id : ");
        int Id=sc.nextInt();
        sc.nextLine();

        System.out.println("entrer le nouveau email : ");
        String email =sc.nextLine();

        System.out.println("entrer la nouvelle specialiter :");
        String specialite=sc.next();

        System.out.println("entrer le nouveau salaire :");
        double salaire=sc.nextDouble();

        Formateur a = new Formateur(id,name,prenom,email,specialite,salaire,null);
        formateur.set(id,a);
        AfficherFormateur(a);
    }
    public void AssocierFormateur() {
        System.out.println("entre l'Id du  formateur : ");

        Formateur b = null;
        for (Formateur a : formateur) {
            if (a.getId() == sc.nextInt()) {
                b = a;
            }
        }
        System.out.println("entre le nom de classe");
        ArrayList<Classe> C = Classe.classe;
        for (Classe a : C) {
            if (a.getNom().equals(sc.nextLine())) {
                Classe cl = a;
            }
        }
        classe.setFormateur(b);
        System.out.println("Bien Associer !");

    }
    public void SupprimerFormateur(){
        System.out.println("entre l'Id de formateur que vous voullez :");
        for (Formateur a : formateur) {
            if (a.getId() == sc.nextInt()) {
                formateur.remove(a);
            }

        }
    }

    @Override
    public String toString() {
        return "Formateur{" +
                "specialite='" + specialite + '\'' +
                ", salaire=" + salaire +
                ", classe=" + classe +
                '}';
    }
}


